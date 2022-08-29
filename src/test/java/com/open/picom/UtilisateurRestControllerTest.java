package com.open.picom;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.open.picom.dto.ClientDto;
import com.open.picom.exception.ClientExistantException;

@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UtilisateurRestControllerTest {

	@Autowired
    private ObjectMapper objectMapper;
	
	@Autowired
	private MockMvc mockMvc;
	
	private static final String TEST_EMAIL = "mail@orsys.fr";
	
	 @Test
	 @Order(1)
    public void testerAjouterUtilisateur() throws Exception {

		 	ClientDto clientDto = new ClientDto();
		 	clientDto.setNom("SAMPLE");
		 	clientDto.setPrenom("John");
		 	clientDto.setEmail(TEST_EMAIL);
		 	clientDto.setMotDePasse("123");
		 	clientDto.setNumeroDeTelephone("010203040506");
		 	
            mockMvc.perform(MockMvcRequestBuilders.post("/api/utilisateursDto") 
            		// on place l'objet utilisateurDto dans le Request Body
            .content(objectMapper.writeValueAsString(clientDto))
            .contentType(MediaType.APPLICATION_JSON)
            .accept(MediaType.APPLICATION_JSON))
            .andExpect(MockMvcResultMatchers.jsonPath("$.nom").value(clientDto.getNom()))
            .andExpect(MockMvcResultMatchers.jsonPath("$.prenom").value(clientDto.getPrenom()))
            .andExpect(MockMvcResultMatchers.jsonPath("$.email").value(clientDto.getEmail()))
            .andExpect(MockMvcResultMatchers.jsonPath("$.numeroDeTelephone").value(clientDto.getEmail()))

            .andExpect(status().isCreated())
            .andDo(MockMvcResultHandlers.print());

    }
	 
	@Test
	@Order(2)
	public void testerAjouterUtilisateurDoublon() throws Exception {
		ClientDto clientDto = new ClientDto();
		clientDto.setNom("SAMPLE");
		clientDto.setPrenom("John");
		clientDto.setEmail(TEST_EMAIL);
		clientDto.setMotDePasse("123");
		

         mockMvc.perform(MockMvcRequestBuilders.post("/api/client")  
        		 // Objet Java -> JSON : process de sérialisation
        		 // JSON -> objet Java : process de désérialisation
        		 // On place la version Json de l'objet utilisateurDto dans le corps
        		 // de la requête HTTP
         .content(objectMapper.writeValueAsString(clientDto))
         .contentType(MediaType.APPLICATION_JSON)
         .accept(MediaType.APPLICATION_JSON))
         .andExpect(status().isConflict())
         .andExpect(result -> assertTrue(result.getResolvedException() instanceof ClientExistantException))
         .andDo(MockMvcResultHandlers.print());

	 }
}
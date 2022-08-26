package com.open.picom.initialisation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.open.picom.business.Administrateur;
import com.open.picom.business.Arret;
import com.open.picom.business.Client;
import com.open.picom.business.TrancheHorraire;
import com.open.picom.business.Utilisateur;
import com.open.picom.business.Zone;
import com.open.picom.dao.AdministrateurDao;
import com.open.picom.dao.ArretDao;
import com.open.picom.dao.ClientDao;
import com.open.picom.dao.TrancheHorraireDao;
import com.open.picom.dao.UtilisateurDao;
import com.open.picom.dao.ZoneDao;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class AjoutDonnesInitiales implements CommandLineRunner {

    private final ZoneDao zoneDao;
    private final ArretDao arretDao;
    private final TrancheHorraireDao trancheHorraireDao;
    private final UtilisateurDao utilisateurDao;
    private final AdministrateurDao administrateurDao;
    private final ClientDao clientDao;

    @Override
    public void run(String... args) throws Exception {
        ajouterZone();
        ajouterArret();
        ajouterTrancheHorraire();
        ajouterAdministrateur();
        ajouterClient();
    }

    private void ajouterZone() {
        if (zoneDao.count() == 0) {
            for (int i = 0; i < 5; i++) {
                Zone zone = new Zone();
                zone.setNom("Zone " + (i + 1));
                zoneDao.save(zone);
            }

        }
    }

    private void ajouterArret() {
        if (arretDao.count() == 0) {
            List<Zone> zoneList = zoneDao.findAll();
            List<Arret> arretList = new ArrayList<>();

            Arret arret1 = new Arret("Torcy", 48.839643001509344, 2.655273836829538, zoneList.get(4));
            arretList.add(arret1);

            Arret arret2 = new Arret("Porte de Clichy", 48.89430373885804, 2.3160640435877733, zoneList.get(0));
            arretList.add(arret2);

            Arret arret3 = new Arret("Paris Bercy Bourgogne - Pays d'Auvergne", 48.838211140536046, 2.3856038461994014,
                    zoneList.get(0));
            arretList.add(arret3);

            Arret arret4 = new Arret("Magenta", 48.88070936561204, 2.358949411544882, zoneList.get(0));
            arretList.add(arret4);

            Arret arret5 = new Arret("Invalides", 48.86283372871624, 2.3125378350952026, zoneList.get(0));
            arretList.add(arret5);

            Arret arret6 = new Arret("Clichy - Levallois", 48.89752384748113, 2.2975121347388763, zoneList.get(1));
            arretList.add(arret6);

            Arret arret7 = new Arret("La Plaine Stade de France", 48.91812953988195, 2.362254587760935,
                    zoneList.get(1));
            arretList.add(arret7);

            Arret arret8 = new Arret("Pantin", 48.8981913126568, 2.4004457629919593, zoneList.get(1));
            arretList.add(arret8);

            Arret arret9 = new Arret("Saint-Ouen", 48.90455838854967, 2.322818474165692, zoneList.get(1));
            arretList.add(arret9);

            Arret arret10 = new Arret("Choisy-le-Roi", 48.76371685058322, 2.4110784984058373, zoneList.get(2));
            arretList.add(arret10);

            Arret arret11 = new Arret("La Défense", 48.89289288477416, 2.2373314168683387, zoneList.get(2));
            arretList.add(arret11);

            Arret arret12 = new Arret("Les Ardoines", 48.78220096090303, 2.4094952980156523, zoneList.get(2));
            arretList.add(arret12);

            Arret arret13 = new Arret("Nanterre - Ville", 48.89499053338933, 2.1950725639897115, zoneList.get(2));
            arretList.add(arret13);

            Arret arret14 = new Arret("Argenteuil", 48.946996627011934, 2.257577560945356, zoneList.get(3));
            arretList.add(arret14);

            Arret arret15 = new Arret("Franconville - Le Plessis-Bouchard", 48.99378249697358, 2.2342107501168083,
                    zoneList.get(3));
            arretList.add(arret15);

            Arret arret16 = new Arret("Juvisy", 48., 2.383627606761674, zoneList.get(3));
            arretList.add(arret16);

            Arret arret17 = new Arret("Versailles Chantiers", 48.79513101671609, 2.1343450409801514, zoneList.get(3));
            arretList.add(arret17);

            Arret arret18 = new Arret("Chars", 49.16309712434757, 1.937014806335425, zoneList.get(4));
            arretList.add(arret18);

            Arret arret19 = new Arret("L'Isle-Adam - Parmain", 49.114640188846, 2.2100437751166533, zoneList.get(4));
            arretList.add(arret19);

            Arret arret20 = new Arret("Mantes Station", 48.983624786466805, 1.7149349369891402, zoneList.get(4));
            arretList.add(arret20);

            arretDao.saveAll(arretList);

        }
    }

    private void ajouterTrancheHorraire() {
        if (trancheHorraireDao.count() == 0) {
            for (int i = 6; i < 21; i++) {
                TrancheHorraire tH = new TrancheHorraire();
                tH.setDebut(i);
                trancheHorraireDao.save(tH);
            }
        }
    }


   
    private void ajouterAdministrateur() {
        if (administrateurDao.count() == 0) {
            Administrateur ad = new Administrateur();
            ad.setNom("Le Bihan");
            ad.setPrenom("Soazig");
            ad.setEmail("admin1@orsys.fr");
            ad.setMotDePasse("12345678");
            administrateurDao.save(ad); 
        }
    }

    private void ajouterClient(){
        if (clientDao.count() == 0) {
            Client c = new Client();
            c.setNom("Cote");
            c.setPrenom("FX");
            c.setNumeroDeTelephone("0603051278");
            c.setEmail("client1@orsys.fr");
            c.setMotDePasse("12345678");
            clientDao.save(c);
        }
    }
}

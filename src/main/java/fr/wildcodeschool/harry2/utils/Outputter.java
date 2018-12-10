package fr.wildcodeschool.harry2.utils;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import fr.wildcodeschool.harry2.entities.User;
import fr.wildcodeschool.harry2.repositories.UserDao;

@Component
public class Outputter implements CommandLineRunner {

    private Logger LOG = LoggerFactory.getLogger("Wilder");

    @Autowired
    private UserDao userDao;

    @Override
    public void run(String... args) throws Exception {

        // Checke combien d'objets se trouvent dans la BDD        
        LOG.info("******************");
        LOG.info("Objects in DB : " + userDao.count());

        // Crée un nouvel utilisateur et l'enregistre dans la BDD
        User user1 = new User("Brenda", "Wildeuse", 19);
        LOG.info("******************");
        LOG.info(user1 + " has been created !");
        userDao.save(user1);
        LOG.info(user1 + " has been saved !");
    }    
}
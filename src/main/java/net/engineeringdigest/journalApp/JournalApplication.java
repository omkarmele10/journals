package net.engineeringdigest.journalApp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import java.awt.*;

@SpringBootApplication
public class JournalApplication {

    public static void main(String[] args) {
//        ConfigurableApplicationContext context =
            SpringApplication.run(JournalApplication.class, args);
//        ConfigurableEnvironment environment = context.getEnvironment();
//        System.out.println(environment.getActiveProfiles()[0]);
    }

    @Bean
    public PlatformTransactionManager falana(MongoDatabaseFactory dbFactory){
        return new MongoTransactionManager(dbFactory);
    }
//PlatformTransactionManager: This is a standard Spring interface that acts as the core engine for managing transactions (handling commits, rollbacks, and defining the scope of operations).
//MongoTransactionManager: This is the specific implementation of that interface required for MongoDB. It ensures that if multiple database operations are grouped under a @Transactional annotation, they succeed or fail as a single unit (achieving atomicity).
//MongoDatabaseFactory: This is a dependency that provides the connection to your MongoDB instance. Spring Boot automatically detects your database configuration (from application.properties) and provides this factory instance to the method.
//@Bean explicitly telling Spring to manage transactions for database.
}
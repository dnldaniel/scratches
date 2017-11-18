package com.daniel.SpringProfileImport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;


@SpringBootApplication
public class SpringProfileImportApplication
{

    public static void main( String[] args )
    {
        ConfigurableApplicationContext run =
            SpringApplication.run( SpringProfileImportApplication.class, args );
        ConfigurableEnvironment environment = run.getEnvironment();
        System.out.println( "Property value: " + environment.getProperty( "myproperty" ) );

    }
}

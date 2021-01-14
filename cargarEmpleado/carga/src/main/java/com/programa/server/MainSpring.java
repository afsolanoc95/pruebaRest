
package com.programa.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:META-INF/spring/applicationContext.xml"})
public class MainSpring {

//http://localhost:8080/prueba/parameta/names=anderson%20fabian&lastnames=solano%20cubillos&typeId=cc&numberId=1023946321&birthdate=19951025&companydate=20191110&businessRole=ejecutivo&salary=50.2/

	public static void main(String[] args) {
        SpringApplication.run(MainSpring.class, args);
    }
}

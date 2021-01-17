
package com.programa.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:META-INF/spring/applicationContext.xml"})
public class MainSpring {

//http://localhost:8080/prueba/parameta/names=anderson%20fabian%20&lastnames=solano%20cubillos%20&typeId=cc%20&numberId=1023946321%20&birthdate=19951025%20&companydate=20191110%20&businessRole=ejecutivo%20&salary=50.2%20/
	public static void main(String[] args) {
        SpringApplication.run(MainSpring.class, args);
    }
}

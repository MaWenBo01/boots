package boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*@ComponentScan("boot.service.services")*/

@SpringBootApplication
public class BootControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootControllerApplication.class, args);
	}

}


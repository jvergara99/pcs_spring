package mx.uv.coatza.holamundo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HolamundoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HolamundoApplication.class, args);
	}
 

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Nuestro primer Spring...");
		
	}
 
}

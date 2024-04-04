package mx.uv.coatza.holamundo;

import java.util.Scanner;

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
		Scanner input = new Scanner(System.in);
		System.out.println("Ingresa primer número: ");
		int firstNumber = input.nextInt();

		System.out.println("Ingresa segundo número: ");
		int secondNumber = input.nextInt();

		int result = firstNumber + secondNumber;

		System.out.println(firstNumber + " + " + secondNumber + " = " + result);

	}
 
}

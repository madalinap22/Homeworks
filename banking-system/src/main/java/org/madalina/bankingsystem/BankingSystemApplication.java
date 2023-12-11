package org.madalina.bankingsystem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BankingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingSystemApplication.class, args); //lambda
	}

//@Bean                                            //adauga un springBean in context (args->sout("say someting"), adica un obiect pe care l-am creat)
//	public CommandLineRunner doSomething() { //commandLineRunner-ajuta sa rulam lucruri la deschiderea app
//	CommandLineRunner commandLineRunner = new CommandLineRunner() {
//		@Override
//		public void run(String... args) throws Exception {
//			System.out.println("say Something");
//		}
//	};
//		return commandLineRunner;
//	}
//
//	@Bean                                            //adauga un springBean in context (args->sout("say someting"), adica un obiect pe care l-am creat)
//	public CommandLineRunner doSomethingElse() { //commandLineRunner-ajuta sa rulam lucruri la deschiderea app
//		CommandLineRunner commandLineRunner = new CommandLineRunner() {
//			@Override
//			public void run(String... args) throws Exception {
//				System.out.println("say Something else");
//			}
//		};
//		return commandLineRunner;
//	}
}



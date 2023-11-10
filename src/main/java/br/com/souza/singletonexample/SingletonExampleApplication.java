package br.com.souza.singletonexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingletonExampleApplication.class, args);

		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton);

		System.out.println(Singleton.getInstance());
	}

}

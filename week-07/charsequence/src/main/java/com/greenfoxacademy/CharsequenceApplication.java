package com.greenfoxacademy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CharsequenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CharsequenceApplication.class, args);
		CharOperations charreverse = new CharOperations("Testtext");
		System.out.println(charreverse.toString());
    System.out.println(charreverse.charAt(2));
    System.out.println(charreverse.length());
    System.out.println(charreverse.subSequence(1,5));
	}
}

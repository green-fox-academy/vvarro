package com.greenfoxacademy;

import music.BassGuitar;
import music.ElectricGuitar;
import music.Violin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InstrumentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstrumentsApplication.class, args);

    System.out.println("Test 1, create Electric Guitar, Bass Guitar and Violin with default strings.");
    ElectricGuitar guitar = new ElectricGuitar();
    BassGuitar bassGuitar = new BassGuitar();
    Violin violin = new Violin();

    System.out.println("Test 1 Play");
    guitar.play();
    bassGuitar.play();
    violin.play();

    System.out.println("Test 2, create Electric Guitar, Bass Guitar with 7 and 5 strings .");
    ElectricGuitar guitar2 = new ElectricGuitar(7);
    BassGuitar bassGuitar2 = new BassGuitar(5);

    System.out.println("Test 2 Play");
    guitar2.play();
    bassGuitar2.play();
	}
}

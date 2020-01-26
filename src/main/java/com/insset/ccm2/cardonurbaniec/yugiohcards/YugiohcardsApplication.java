package com.insset.ccm2.cardonurbaniec.yugiohcards;

import com.insset.ccm2.cardonurbaniec.yugiohcards.services.FirestoreService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YugiohcardsApplication {

	public static void main(String[] args) {
		FirestoreService.setDb(FirestoreService.initializeFirestore());
		SpringApplication.run(YugiohcardsApplication.class, args);
	}

}

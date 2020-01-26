package com.insset.ccm2.cardonurbaniec.yugiohcards.controllers;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.WriteResult;
import com.insset.ccm2.cardonurbaniec.yugiohcards.models.Card;
import com.insset.ccm2.cardonurbaniec.yugiohcards.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardController {

    @Autowired
    CardService cardService;

    @PostMapping("/card")
    public ResponseEntity<ApiFuture<WriteResult>> addCard(@RequestBody Card card){
        return new ResponseEntity<>(cardService.add(card), HttpStatus.CREATED);
    }

    @GetMapping("/card")
    public ResponseEntity<List<Card>> getAll(){
        return new ResponseEntity<>(cardService.getAll(), HttpStatus.OK);
    }
}

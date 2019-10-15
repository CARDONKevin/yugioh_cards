package com.insset.ccm2.cardonurbaniec.yugiohcards.services;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.insset.ccm2.cardonurbaniec.yugiohcards.models.Card;
import org.springframework.stereotype.Service;

@Service
public class CardServiceImpl implements CardService {

    @Override
    public ApiFuture<WriteResult> add(Card card) {
        Firestore db = FirestoreService.getDb();

        DocumentReference documentReference = db.collection("cards").document(card.getReference());

        //asynchronously write data
        ApiFuture<WriteResult> result = documentReference.set(card);

        return result;
    }
}

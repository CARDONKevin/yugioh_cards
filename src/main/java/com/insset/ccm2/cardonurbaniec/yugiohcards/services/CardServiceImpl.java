package com.insset.ccm2.cardonurbaniec.yugiohcards.services;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.insset.ccm2.cardonurbaniec.yugiohcards.mappers.MapperCard;
import com.insset.ccm2.cardonurbaniec.yugiohcards.models.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private MapperCard mapperCard;

    @Override
    public ApiFuture<WriteResult> add(Card card) {
        Firestore db = FirestoreService.getDb();

        DocumentReference documentReference = db.collection("cards").document(card.getReference());

        //asynchronously write data
        ApiFuture<WriteResult> result = documentReference.set(card);

        return result;
    }

    @Override
    public List<Card> getAll(){
        List<Card> cards = new ArrayList<>();

        // asynchronously retrieve all users
        ApiFuture<QuerySnapshot> query = FirestoreService.getDb().collection("cards").get();
        // query.get() blocks on response
        QuerySnapshot querySnapshot = null;
        try {
            querySnapshot = query.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        if (querySnapshot != null){
            for (QueryDocumentSnapshot document : querySnapshot.getDocuments()) {
                cards.add(mapperCard.mapDocumentToCard(document));
            }

            return cards;
        }

        return new ArrayList<>();
    }


}

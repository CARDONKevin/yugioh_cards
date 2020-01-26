package com.insset.ccm2.cardonurbaniec.yugiohcards.services;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.WriteResult;
import com.insset.ccm2.cardonurbaniec.yugiohcards.models.Card;

import java.util.List;

public interface CardService {

    ApiFuture<WriteResult> add(Card card);

    List<Card> getAll();
}

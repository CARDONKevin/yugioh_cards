package com.insset.ccm2.cardonurbaniec.yugiohcards.mappers;

import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.insset.ccm2.cardonurbaniec.yugiohcards.models.Card;
import com.insset.ccm2.cardonurbaniec.yugiohcards.models.Effect;
import com.insset.ccm2.cardonurbaniec.yugiohcards.models.FilterCard;
import com.insset.ccm2.cardonurbaniec.yugiohcards.types.AttributeType;
import com.insset.ccm2.cardonurbaniec.yugiohcards.types.CardSubType;
import com.insset.ccm2.cardonurbaniec.yugiohcards.types.CardType;
import com.insset.ccm2.cardonurbaniec.yugiohcards.types.CategorizedType;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MapperCard {

    public Card mapDocumentToCard(QueryDocumentSnapshot document) {
        Card card = new Card();

        if (document.contains("reference")) {
            card.setReference(document.getString("reference"));
        }

        if (document.contains("name")) {
            card.setName(document.getString("name"));
        }

        if (document.contains("cardType")) {
            card.setCardType(CardType.valueOf(document.getString("cardType")));
        }

        if (document.contains("cardSubType")) {
            card.setCardSubType(CardSubType.valueOf(document.getString("cardSubType")));
        }

        if (document.contains("categorized")) {
            try {
                card.setCategorized(CategorizedType.valueOf(document.getString("categorized")));
            } catch (Exception e) {
                // Nothing
            }
        }

        if (document.contains("attribute")) {
            try {
                card.setAttribute(AttributeType.valueOf(document.getString("attribute")));
            } catch (Exception e) {
                // Nothing
            }
        }

        if (document.contains("description")) {
            card.setDescription(document.getString("description"));
        }

        if (document.contains("imageUrl")) {
            card.setImageUrl(document.getString("imageUrl"));
        }

        if (document.contains("atk")) {
            card.setAtk(document.getLong("atk").intValue());
        }

        if (document.contains("def")) {
            card.setDef(document.getLong("def").intValue());
        }

        if (document.contains("level")) {
            card.setLevel(document.getLong("level").intValue());
        }

        if (document.contains("effects")) {
            card.setEffects((List<Effect>) document.get("effects"));
        }

        if (document.contains("limit")) {
            card.setLimit(document.getLong("limit").intValue());
        }

        if (document.contains("needMonster")) {
            card.setNeedMonster((List<FilterCard>) document.get("needMonster"));
        }

        if (document.contains("canHaveUnlimitedMaterial")) {
            card.setCanHaveUnlimitedMaterial(document.getBoolean("canHaveUnlimitedMaterial"));
        }

        if (document.contains("unlimitedMaterial")) {
            card.setUnlimitedMaterial((List<FilterCard>) document.get("unlimitedMaterial"));
        }

        return card;
    }
}

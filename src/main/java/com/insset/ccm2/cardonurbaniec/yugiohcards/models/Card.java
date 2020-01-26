package com.insset.ccm2.cardonurbaniec.yugiohcards.models;

import com.insset.ccm2.cardonurbaniec.yugiohcards.types.AttributeType;
import com.insset.ccm2.cardonurbaniec.yugiohcards.types.CardSubType;
import com.insset.ccm2.cardonurbaniec.yugiohcards.types.CardType;
import com.insset.ccm2.cardonurbaniec.yugiohcards.types.CategorizedType;

import java.util.List;

public class Card {

    private String reference;

    private String name;

    private CardType cardType;

    private CardSubType cardSubType;

    private CategorizedType categorized;

    private AttributeType attribute;

    private String description;

    private int atk;

    private int def;

    private int level;

    private int limit;

    private List<Effect> effects;

    private String imageUrl;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public CardSubType getCardSubType() {
        return cardSubType;
    }

    public void setCardSubType(CardSubType cardSubType) {
        this.cardSubType = cardSubType;
    }

    public CategorizedType getCategorized() {
        return categorized;
    }

    public void setCategorized(CategorizedType categorized) {
        this.categorized = categorized;
    }

    public AttributeType getAttribute() {
        return attribute;
    }

    public void setAttribute(AttributeType attribute) {
        this.attribute = attribute;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<Effect> getEffects() {
        return effects;
    }

    public void setEffects(List<Effect> effects) {
        this.effects = effects;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}

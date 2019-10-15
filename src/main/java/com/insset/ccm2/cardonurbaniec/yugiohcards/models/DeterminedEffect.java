package com.insset.ccm2.cardonurbaniec.yugiohcards.models;

public class DeterminedEffect {

    private String typeCard;

    private String subTypeCard;

    private String determinedTypeApplication;

    private String location;

    private String targetOfLocation;

    public String getTypeCard() {
        return typeCard;
    }

    public void setTypeCard(String typeCard) {
        this.typeCard = typeCard;
    }

    public String getSubTypeCard() {
        return subTypeCard;
    }

    public void setSubTypeCard(String subTypeCard) {
        this.subTypeCard = subTypeCard;
    }

    public String getDeterminedTypeApplication() {
        return determinedTypeApplication;
    }

    public void setDeterminedTypeApplication(String determinedTypeApplication) {
        this.determinedTypeApplication = determinedTypeApplication;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTargetOfLocation() {
        return targetOfLocation;
    }

    public void setTargetOfLocation(String targetOfLocation) {
        this.targetOfLocation = targetOfLocation;
    }
}

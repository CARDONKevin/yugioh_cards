package com.insset.ccm2.cardonurbaniec.yugiohcards.models;

public class Effect {

    private String action;

    private String quota;

    private String locationFrom;

    private String locationTo;

    private String locationActiveEffect;

    private String target;

    private DeterminedEffect determinedEffect;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getQuota() {
        return quota;
    }

    public void setQuota(String quota) {
        this.quota = quota;
    }

    public String getLocationFrom() {
        return locationFrom;
    }

    public void setLocationFrom(String locationFrom) {
        this.locationFrom = locationFrom;
    }

    public String getLocationTo() {
        return locationTo;
    }

    public void setLocationTo(String locationTo) {
        this.locationTo = locationTo;
    }

    public String getLocationActiveEffect() {
        return locationActiveEffect;
    }

    public void setLocationActiveEffect(String locationActiveEffect) {
        this.locationActiveEffect = locationActiveEffect;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public DeterminedEffect getDeterminedEffect() {
        return determinedEffect;
    }

    public void setDeterminedEffect(DeterminedEffect determinedEffect) {
        this.determinedEffect = determinedEffect;
    }
}

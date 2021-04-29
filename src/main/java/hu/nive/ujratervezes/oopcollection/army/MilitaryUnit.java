package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {

    int lifePower;
    int hitPoints;
    boolean isShielded;

    public MilitaryUnit() {}

    public MilitaryUnit(int lifePower, int hitPoints, boolean isShielded) {
        this.lifePower = lifePower;
        this.hitPoints = hitPoints;
        this.isShielded = isShielded;
    }

    public int doDamage() {
        return getHitPoints();
    }

    public void sufferDamage(int damage) {
        if (this.isShielded) setLifePower(Math.max(getLifePower() - (damage / 2), 0));
        else setLifePower(Math.max(getLifePower() - damage, 0));
    }


    public int getLifePower() {
        return lifePower;
    }

    public void setLifePower(int lifePower) {
        this.lifePower = lifePower;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public boolean isShielded() {
        return isShielded;
    }

    public void setShielded(boolean shielded) {
        isShielded = shielded;
    }



}

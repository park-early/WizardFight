package model;

public class DamageInfo {

    private int dmg;
    private boolean pierce;
    private Entity tempStat;

    public DamageInfo() {
        this.dmg = 0;
        this.pierce = false;
        this.tempStat = new Player("temp");
    }

    //getters
    public int getDmg() {
        return dmg;
    }
    public boolean isPierce() {
        return pierce;
    }
    public Entity getTempStat() {
        return this.tempStat;
    }

    //setters
    public void setDmg(int dmg) {
        this.dmg = dmg;
    }
    public void setPierce(boolean pierce) {
        this.pierce = pierce;
    }
    public void setTempStat(Entity entity) {
        this.tempStat = entity;
    }
}

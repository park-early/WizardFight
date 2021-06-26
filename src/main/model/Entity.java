package model;

import java.util.List;

public abstract class Entity {

    protected String name;
    protected int hp;
    protected int mana;
    protected int manaRegen;
    protected int atk;
    protected int mag;
    protected int def;
    protected int res;
    protected int spd;
    protected int luck;
    protected List<String> status;
    protected Spell spell;

    //getters
    public String getName() {
        return name;
    }
    public int getHp() {
        return hp;
    }
    public int getMana() {
        return mana;
    }
    public int getManaRegen() {
        return manaRegen;
    }
    public int getAtk() {
        return atk;
    }
    public int getMag() {
        return mag;
    }
    public int getDef() {
        return def;
    }
    public int getRes() {
        return res;
    }
    public int getSpd() {
        return spd;
    }
    public int getLuck() {
        return luck;
    }
    public List<String> getStatus() {
        return status;
    }
    public Spell getSpell() {
        return spell;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
    public void setManaRegen(int manaRegen) {
        this.manaRegen = manaRegen;
    }
    public void setAtk(int atk) {
        this.atk = atk;
    }
    public void setMag(int mag) {
        this.mag = mag;
    }
    public void setDef(int def) {
        this.def = def;
    }
    public void setRes(int res) {
        this.res = res;
    }
    public void setSpd(int spd) {
        this.spd = spd;
    }
    public void setLuck(int luck) {
        this.luck = luck;
    }
    public void setStatus(List<String> status) {
        this.status = status;
    }

    //MODIFIES: this
    //EFFECTS: cast spells to use as an attack
    public abstract void castSpell();

    //MODIFIES: this
    //EFFECTS: calculate the amount of damage the entity takes from the spell and apply spell effects
    public void calculateDamage(Spell spell) {
        //stub
    }
}
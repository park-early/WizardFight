package model;

import java.util.*;

public class Entity {

    private SpellBook spellBook;
    private String name;
    private int hp;
    private int mana;
    private int manaRegen;
    private int atk;
    private int mag;
    private int def;
    private int res;
    private int spd;
    private int luck;
    private List<String> status;
    private int statusCounter1;
    private Spell spell;

    public Entity(String name, SpellBook spellBook) {
        this.name = name;
        this.hp = 0;
        this.mana = 0;
        this.manaRegen = 0;
        this.atk = 0;
        this.mag = 0;
        this.def = 0;
        this.res = 0;
        this.spd = 0;
        this.luck = 0;
        this.status = new ArrayList<>();
        this.statusCounter1 = 0;

        this.spellBook = spellBook;
    }

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
    public void addStatus(String status) {
        this.status.add(status);
    }

    //EFFECTS: provides 3 spells that the user can choose from
    public List<Spell> presentSpells() {
        int randR = (int) (Math.random() * spellBook.getRockSpells().size());
        int randP = (int) (Math.random() * spellBook.getPaperSpells().size());
        int randS = (int) (Math.random() * spellBook.getScissorSpells().size());

        Spell spellR = spellBook.getRockSpells().get(randR);
        Spell spellP = spellBook.getPaperSpells().get(randP);
        Spell spellS = spellBook.getScissorSpells().get(randS);

        List<Spell> spells = new LinkedList<>();
        spells.add(spellR);
        spells.add(spellP);
        spells.add(spellS);

        return spells;
    }

    //EFFECTS: check if the entity dodges the attack (before damage calculation)
    public boolean checkDodge() {
        int num = (int) (Math.random() * 100);
        return num <= this.spd;
    }

    //EFFECTS: check if the entity lands a critical hit (after damage calculation)
    public boolean checkCritical() {
        int num = (int) (Math.random() * 100);
        return num <= this.luck;
    }

    //MODIFIES: this
    //EFFECTS: apply status effects to this entity after damage calculation
    public void checkStatuses() {
        boolean cured = false;

        Collections.reverse(this.status);
        for (String s: this.status) {
            if (s.equals("Burn")) {
                this.hp -= 10;
            } else if (s.equals("Bleed")) {
                this.hp -= 2 + statusCounter1;
                statusCounter1 += (int) (Math.random() * 6);
            } else if (s.equals("Cure")) {
                cured = true;
                break;
            }
        }

        if (cured) {
            this.status.clear();
            cured = false;
        }

        Collections.reverse(this.status);
    }

}

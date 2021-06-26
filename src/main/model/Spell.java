package model;

import java.util.ArrayList;
import java.util.List;

public class Spell {

    private String name;
    private int dmg;
    private int acc;
    private int cost;
    private SpellType type;
    private List<String> keywords;
    private String description;

    //getters
    public String getName() {
        return name;
    }
    public int getDmg() {
        return dmg;
    }
    public int getAcc() {
        return acc;
    }
    public int getCost() {
        return cost;
    }
    public SpellType getType() {
        return type;
    }
    public List<String> getKeywords() {
        return keywords;
    }

    //setters
    public String getDescription() {
        return description;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDmg(int dmg) {
        this.dmg = dmg;
    }
    public void setAcc(int acc) {
        this.acc = acc;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public void setType(SpellType type) {
        this.type = type;
    }
    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    //constructs a spell with a name
    public Spell(String name) {
        this.name = name;
        this.dmg = 0;
        this.acc = 0;
        this.cost = 0;
        this.type = SpellType.PHYS;
        this.keywords = new ArrayList<>();
        this.description = "";
    }

    //MODIFIES: entity, this
    //EFFECTS: increase or decrease field of the entity or this based on the keyword passed
    public void alterStat(Entity entity, String keyword) {
        //stub
    }
}

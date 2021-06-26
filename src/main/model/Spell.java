package model;

import java.util.List;

public class Spell {

    private String name;
    private int dmg;
    private int acc;
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
    }
}

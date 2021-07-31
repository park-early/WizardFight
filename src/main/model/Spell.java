package model;

public class Spell {

    private String name;
    private int dmg;
    private int cost;
    private SpellType type;
    private String keyword;
    private String description;

    //getters
    public String getName() {
        return name;
    }
    public int getDmg() {
        return dmg;
    }
    public int getCost() {
        return cost;
    }
    public SpellType getType() {
        return type;
    }
    public String getKeyword() {
        return keyword;
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
    public void setCost(int cost) {
        this.cost = cost;
    }
    public void setType(SpellType type) {
        this.type = type;
    }
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    //constructs a spell with a name
    public Spell(String name) {
        this.name = name;
        this.dmg = 0;
        this.cost = 0;
        this.type = SpellType.ROCK;
        this.keyword = "";
        this.description = "";
    }
}

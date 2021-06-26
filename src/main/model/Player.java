package model;

import java.util.ArrayList;

public class Player extends Entity{

    private Spell clef;
    private Spell cadenza;
    private Spell coda;

    public Player(String name) {
        this.name = name;
        this.hp = 200;
        this.mana = 100;
        this.manaRegen = 25;
        this.atk = 10;
        this.mag = 10;
        this.def = 10;
        this.res = 10;
        this.spd = 10;
        this.luck = 5;
        this.status = new ArrayList<>();
    }

    public void selectClef()

    @Override
    //MODIFIES: this
    //EFFECTS: concatenates spells into a full spell to use as an attack
    public void castSpell() {
        //stub
    }
}

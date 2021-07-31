package model;

import java.util.ArrayList;

public class Player extends Entity{

    public Player(String name, SpellBook spellBook) {
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

        this.spellBook = spellBook;
    }

    //EFFECTS: provides 3 spells that the user can choose from
    public void presentSpells() {
        //stub
    }

}

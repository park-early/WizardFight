package model;

import java.util.ArrayList;

public class Opponent extends Entity{

    public Opponent() {
        this.name = "Opponent";
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
    }

}

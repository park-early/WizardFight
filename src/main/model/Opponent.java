package model;

import java.util.ArrayList;

public class Opponent extends Entity{

    public Opponent() {
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

    @Override
    //MODIFIES: this
    //EFFECTS: casts a random spell at the player, returns final damage info object
    public DamageInfo castSpell(Entity player) {

        Entity tempStat = new Opponent();
        boolean pierce = false;
        DamageInfo damageInfo = new DamageInfo();
        return damageInfo; //stub
    }
}

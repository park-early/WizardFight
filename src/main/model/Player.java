package model;

import java.util.ArrayList;

public class Player extends Entity{

    private Spell clef;
    private Spell cadenza;
    private Spell coda;

    public Player(String name) {
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
    }

    //EFFECTS: provides 3 spells (clefs) that the user can choose from
    public void presentClefs() {
        //stub
    }

    //EFFECTS: provides 3 spells (cadenzas) that the user can choose from
    public void presentCadenzas() {
        //stub
    }

    //EFFECTS: provides 3 spells (codas) that the user can choose from
    public void presentCodas() {
        //stub
    }

    @Override
    //MODIFIES: this
    //EFFECTS: concatenates spells into a full spell to use as an attack, returns a damage info object
    public DamageInfo castSpell(Entity opponent) {

        Entity tempStat = new Player("tempStat");
        boolean pierce = false;
        DamageInfo damageInfo = new DamageInfo();
        return damageInfo; //stub
    }
}

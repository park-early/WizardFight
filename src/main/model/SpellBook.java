package model;

import java.util.ArrayList;
import java.util.List;

public class SpellBook {

    private List<Spell> rockSpells;
    private List<Spell> paperSpells;
    private List<Spell> scissorSpells;

    public SpellBook() {
        this.rockSpells = new ArrayList<>();
        this.paperSpells = new ArrayList<>();
        this.scissorSpells = new ArrayList<>();
    }

    public List<Spell> getRockSpells() {
        return rockSpells;
    }

    public List<Spell> getPaperSpells() {
        return paperSpells;
    }

    public List<Spell> getScissorSpells() {
        return scissorSpells;
    }
}

package model;

import org.junit.jupiter.api.BeforeEach;

public class PlayerTest {

    private Player player;
    private SpellBook spellBook;

    @BeforeEach
    private void setup() {
        this.spellBook = new SpellBook();
        this.player = new Player("Player", spellBook);
    }
}

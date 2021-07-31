package ui;

import model.Entity;
import model.Opponent;
import model.Player;
import model.SpellBook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EntityMenuTest {

    private EntityMenu em;
    private Entity player;
    private Entity opponent;
    private SpellBook spellBook;

    @BeforeEach
    public void setup() {
        this.player = new Player("player", spellBook);
        this.player.setHp(5);
        this.opponent = new Opponent();
        this.opponent.setHp(5);
        this.em = new EntityMenu(this.player, this.opponent);
    }

    @Test
    public void testDisplayWithNoStatus() {
        String spaces = "";
        String spaces2 = "";
        for(int i=0; i<=72; i++) {
            spaces += " ";
        }
        for(int i=0; i<=91; i++) {
            spaces2 += " ";
        }
        assertEquals("player 5" + spaces + "5 Opponent\n" + spaces2, this.em.getEntityMenu());
    }

    @Test
    public void testDisplayWithStatus() {
        this.player.addStatus("Burned");
        this.opponent.addStatus("Slowed");
        this.em = new EntityMenu(player, opponent);
        String spaces = "";
        String spaces2 = "";
        for(int i=0; i<=72; i++) {
            spaces += " ";
        }
        for(int i=0; i<=77; i++) {
            spaces2 += " ";
        }
        assertEquals("player 5" + spaces + "5 Opponent\nBurned " + spaces2 + "Slowed ", this.em.getEntityMenu());
    }
}

package ui;

import model.Entity;
import model.Opponent;
import model.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EntityMenuTest {

    private EntityMenu em;
    private Entity player;
    private Entity opponent;

    @BeforeEach
    public void setup() {
        this.player = new Player("player");
        this.player.setHp(5);
        this.opponent = new Opponent();
        this.opponent.setHp(5);
        this.em = new EntityMenu(this.player, this.opponent);
    }

    @Test
    public void testDisplayWithNoStatus() {
        String spaces = "";
        for(int i=0; i<=50; i++) {
            spaces += " ";
        }
        assertEquals("|||||" + spaces + "|||||\n" + spaces, this.em.getEntityMenu());
    }

    @Test
    public void testDisplayWithStatus() {
        this.player.addStatus("Burned");
        this.opponent.addStatus("Slowed");
        this.em = new EntityMenu(player, opponent);
        String spaces = "";
        for(int i=0; i<=50; i++) {
            spaces += " ";
        }
        assertEquals("|||||" + spaces + "|||||\nBurned " + spaces + "Slowed ", this.em.getEntityMenu());
    }
}

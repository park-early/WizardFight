package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import persistence.JsonReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EntityTest {

    private Entity player;
    private SpellBook spellBook;
    private JsonReader reader;

    @BeforeEach
    public void setup() throws IOException {
        reader = new JsonReader("./data/SpellBook.json");
        spellBook = reader.read();
        this.player = new Entity("Player", spellBook);
    }

    @Test
    public void testPresentSpells() {
        List<String> tracker = new ArrayList<>();

        for (int i=0; i<100; i++) {
            List<Spell> spells = player.presentSpells();
            for (Spell s: spells) {
                tracker.add(s.getName());
            }
        }

        for (Spell s: this.spellBook.getRockSpells()) {
            assertTrue(tracker.contains(s.getName()));
        }
        for (Spell s: this.spellBook.getPaperSpells()) {
            assertTrue(tracker.contains(s.getName()));
        }
        for (Spell s: this.spellBook.getScissorSpells()) {
            assertTrue(tracker.contains(s.getName()));
        }
    }

    @Test
    public void testCheckDodge() {
        List<Boolean> tracker = new ArrayList<>();
        int count = 0;

        this.player.setSpd(50);

        for (int i=0; i<100; i++) {
            tracker.add(this.player.checkDodge());
        }

        for (boolean b: tracker) {
            if (b) count++;
        }

        assertTrue(count>10);
    }

    @Test
    public void testCheckCritical() {
        List<Boolean> tracker = new ArrayList<>();
        int count = 0;

        this.player.setLuck(50);

        for (int i=0; i<100; i++) {
            tracker.add(this.player.checkCritical());
        }

        for (boolean b: tracker) {
            if (b) count++;
        }

        assertTrue(count>10);
    }

    @Test public void testCheckStatusNoStatus() {
        this.player.setHp(100);
        this.player.checkStatuses();

        assertEquals(100, this.player.getHp());
        assertEquals(0, this.player.getStatus().size());
    }

    @Test public void testCheckStatus() {
        this.player.setHp(100);
        this.player.addStatus("Burn");
        this.player.checkStatuses();

        assertEquals(90, this.player.getHp());
        assertEquals(1, this.player.getStatus().size());
    }

    @Test public void testCheckMultipleStatus() {
        this.player.setHp(100);
        this.player.addStatus("Burn");
        this.player.addStatus("Bleed");
        this.player.checkStatuses();

        assertEquals(88, this.player.getHp());
        assertEquals("Burn", this.player.getStatus().get(0));
        assertEquals("Bleed", this.player.getStatus().get(1));
    }

    @Test public void testCheckStatusCure() {
        this.player.setHp(100);
        this.player.addStatus("Burn");
        this.player.addStatus("Cure");
        this.player.checkStatuses();

        assertEquals(100, this.player.getHp());
        assertEquals(0, this.player.getStatus().size());
    }
}

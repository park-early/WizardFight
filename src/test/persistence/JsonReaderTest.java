package persistence;

import model.SpellBook;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class JsonReaderTest {

    @Test
    public void testReaderNonExistentFile() {
        JsonReader reader = new JsonReader("./data/noSuchFile.json");
        try {
            SpellBook sb = reader.read();
            fail("IOException expected");
        } catch (IOException e) {
            // pass
        }
    }

    @Test
    public void testReaderEmptySpellBook() {
        JsonReader reader = new JsonReader("./data/EmptySpellBook.json");
        try {
            SpellBook sb = reader.read();
            assertEquals(0, sb.getRockSpells().size());
            assertEquals(0, sb.getPaperSpells().size());
            assertEquals(0, sb.getScissorSpells().size());
        } catch (IOException e) {
            fail("Couldn't read from file");
        }
    }

    @Test
    public void testReaderSpellBook() {
        JsonReader reader = new JsonReader("./data/SpellBook.json");
        try {
            SpellBook sb = reader.read();
            assertEquals("Incinerate", sb.getRockSpells().get(0).getName());
            assertEquals("Pummel", sb.getRockSpells().get(1).getName());
        } catch (IOException e) {
            fail("Couldn't read from file");
        }
    }
}

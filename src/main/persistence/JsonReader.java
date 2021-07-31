package persistence;

import model.Spell;
import model.SpellBook;
import model.SpellType;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class JsonReader {
    private final String source;

    // EFFECTS: constructs reader to read from source file
    public JsonReader(String source) {
        this.source = source;
    }

    // EFFECTS: reads SepllBook from file and returns it;
    //          throws IOException if an error occurs reading data from file
    public SpellBook read() throws IOException {
        String jsonData = readFile(source);
        JSONObject jsonObject = new JSONObject(jsonData);
        return parseSpellBook(jsonObject);
    }

    // EFFECTS: reads source file as string and returns it
    private String readFile(String source) throws IOException {
        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(source), StandardCharsets.UTF_8)) {
            stream.forEach(contentBuilder::append);
        }

        return contentBuilder.toString();
    }

    // EFFECTS: parses SpellBook from JSON object and returns it
    private SpellBook parseSpellBook(JSONObject jsonObject) {
        SpellBook sb = new SpellBook();
        addRock(sb, jsonObject);
        addPaper(sb, jsonObject);
        addScissor(sb, jsonObject);

        for (Spell s : sb.getRockSpells()) {
            s.setType(SpellType.ROCK);
        }
        for (Spell s : sb.getPaperSpells()) {
            s.setType(SpellType.PAPER);
        }
        for (Spell s : sb.getScissorSpells()) {
            s.setType(SpellType.SCISSOR);
        }

        return sb;
    }

    // MODIFIES: sb
    // EFFECTS: parses rock spells from JSON object and adds them to the spell book
    private void addRock(SpellBook sb, JSONObject jsonObject) {
        JSONArray rockSpells = jsonObject.getJSONArray("rock");
        for (Object json : rockSpells) {
            JSONObject nextSpell = (JSONObject) json;
            sb.getRockSpells().add(buildSpell(nextSpell));
        }
    }

    // MODIFIES: sb
    // EFFECTS: parses paper spells from JSON object and adds them to the spell book
    private void addPaper(SpellBook sb, JSONObject jsonObject) {
        JSONArray paperSpells = jsonObject.getJSONArray("rock");
        for (Object json : paperSpells) {
            JSONObject nextSpell = (JSONObject) json;
            sb.getPaperSpells().add(buildSpell(nextSpell));
        }
    }

    // MODIFIES: sb
    // EFFECTS: parses scissor spells routes from JSON object and adds them to the spell book
    private void addScissor(SpellBook sb, JSONObject jsonObject) {
        JSONArray scissorSpells = jsonObject.getJSONArray("rock");
        for (Object json : scissorSpells) {
            JSONObject nextSpell = (JSONObject) json;
            sb.getScissorSpells().add(buildSpell(nextSpell));
        }
    }

    //MODIFIES: jsonObject (Spell)
    //EFFECT: parses the Spell from JSON object then returns it
    private Spell buildSpell(JSONObject jsonObject) {
        String name = jsonObject.getString("name");
        int damage = jsonObject.getInt("damage");
        int cost = jsonObject.getInt("cost");
        String keyword = jsonObject.getString("keyword");
        String description = jsonObject.getString("description");

        Spell spell = new Spell(name);
        spell.setDmg(damage);
        spell.setCost(cost);
        spell.setKeyword(keyword);
        spell.setDescription(description);

        return spell;
    }
}

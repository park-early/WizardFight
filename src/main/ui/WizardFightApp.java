package ui;

import model.Entity;
import model.SpellBook;
import persistence.JsonReader;

import java.io.IOException;
import java.util.Scanner;

public class WizardFightApp {
    private static final String JSON_STORE = "./data/SpellBook.json";
    private Scanner input;
    private JsonReader jsonReader;
    private SpellBook spellBook;
    private Entity player;
    private Entity opponent;

    public WizardFightApp() {
        input = new Scanner(System.in);
        jsonReader = new JsonReader(JSON_STORE);

        loadSpellBook();
        player = new Entity("Player", spellBook);
        opponent = new Entity("Opponent", spellBook);
    }










    //EFFECT: loads the SpellBook from file
    public void loadSpellBook() {
        try {
            spellBook = jsonReader.read();
        } catch (IOException e) {
            System.out.println("Unable to read from file: " + JSON_STORE);
        }
    }
}

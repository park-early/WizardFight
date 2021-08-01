package ui;

import model.Opponent;
import model.Player;
import model.SpellBook;

public class Main {
    public static void main(String[] args) {
        SpellBook spellBook = new SpellBook();

        Player player = new Player("test", spellBook);

        player.setHp(200);
        player.setMana(100);
        player.setManaRegen(25);
        player.setAtk(10);
        player.setMag(10);
        player.setDef(10);
        player.setRes(10);
        player.setSpd(10);
        player.setLuck(5);

        Opponent opponent = new Opponent(spellBook);

        opponent.setHp(200);
        opponent.setMana(100);
        opponent.setManaRegen(25);
        opponent.setAtk(10);
        opponent.setMag(10);
        opponent.setDef(10);
        opponent.setRes(10);
        opponent.setSpd(10);
        opponent.setLuck(5);

        EntityMenu em = new EntityMenu(player, opponent);
        System.out.println(em.getEntityMenu());

        player.addStatus("Burned");
        opponent.addStatus("Frozen");

        em = new EntityMenu(player, opponent);
        System.out.println(em.getEntityMenu());

    }
}

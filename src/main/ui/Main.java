package ui;

import model.Player;

public class Main {
    public static void main(String[] args) {

        Player player = new Player("test");

        player.setHp(200);
        player.setMana(100);
        player.setManaRegen(25);
        player.setAtk(10);
        player.setMag(10);
        player.setDef(10);
        player.setRes(10);
        player.setSpd(10);
        player.setLuck(5);

    }
}

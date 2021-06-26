package ui;

import model.Entity;

public class EntityMenu {

    private int playerHealth;
    private String playerHealthBar;
    private int opponentHealth;
    private String opponentHealthBar;
    private String playerStatuses;
    private String opponentStatuses;

    //EFFECTS: constructs the health bars of both opp and player
    public EntityMenu(Entity player, Entity opponent) {
        this.playerHealth = player.getHp();
        this.opponentHealth = opponent.getHp();
        this.playerHealthBar = "";
        this.opponentHealthBar = "";
        this.playerStatuses = "";
        this.opponentStatuses = "";

        for(int i=0; i<playerHealth; i++) {
            this.playerHealthBar += "|";
        }
        for(int i=0; i<opponentHealth; i++) {
            this.opponentHealthBar += "|";
        }

        for(String status : player.getStatus()) {
            this.playerStatuses = this.playerStatuses + status + " ";
        }
        for(String status : opponent.getStatus()) {
            this.opponentStatuses = this.opponentStatuses + status + " ";
        }
    }

    public String getEntityMenu() {
        String spaces = "";
        for (int i=0; i<=50; i++) {
            spaces += " ";
        }
        return playerHealthBar + spaces + opponentHealthBar + "\n" + playerStatuses + spaces + opponentStatuses;
    }
}

package ui;

import model.Entity;

public class EntityMenu {

    private int playerHealth;
    private int opponentHealth;
    private String playerName;
    private String opponentName;
    private String playerStatuses;
    private String opponentStatuses;

    //EFFECTS: constructs the health bars of both opp and player
    public EntityMenu(Entity player, Entity opponent) {
        this.playerHealth = player.getHp();
        this.opponentHealth = opponent.getHp();
        this.playerName = player.getName();
        this.opponentName = opponent.getName();
        this.playerStatuses = "";
        this.opponentStatuses = "";

        for(String status : player.getStatus()) {
            this.playerStatuses = this.playerStatuses + status + " ";
        }
        for(String status : opponent.getStatus()) {
            this.opponentStatuses = this.opponentStatuses + status + " ";
        }
    }

    public String getEntityMenu() {
        String spaces = "";
        String spaces2 = "";

        int spaceNum = 90 - (playerName.length() + String.valueOf(playerHealth).length() +
                opponentName.length() + String.valueOf(opponentHealth).length() + 2);
        int spaceNum2 = 90 - (playerStatuses.length() + opponentStatuses.length() - 1);

        for (int i=0; i<=spaceNum; i++) {
            spaces += " ";
        }
        for (int i=0; i<=spaceNum2; i++) {
            spaces2 += " ";
        }

        return playerName + " " + playerHealth + spaces + opponentHealth + " " + opponentName +
                "\n" + playerStatuses + spaces2 + opponentStatuses;
    }
}

package model;

import org.junit.jupiter.api.BeforeEach;

public class PlayerTest {

    private Player player;

    @BeforeEach
    private void setup() {
        this.player = new Player("Player");
    }
}

package minesweeper;

import processing.core.PApplet;

public class MainApp extends PApplet {
    private MinesweeperGame game;
    private float screenWidth = 600;
    private float screenHeight = 600;

    public static void main(String[] args) {
            PApplet.main(new String[]{"minesweeper.MainApp" });
    }

    public void settings() {
        size((int) screenWidth, (int) screenHeight);
    }

    public void setup() {
        game = new MinesweeperGame(screenWidth, screenHeight);
    }

    public void draw() {
        background(0);
        game.teken(this);
    }

    public void mousePressed() {
        game.detecteerGebruikersInput(this);
    }


}

package minesweeper;

import processing.core.PApplet;

public class MinesweeperGame {
    private Grid spelbord;
    private float screenWidth;
    private float screenHeight;

    public MinesweeperGame(float screenWidth, float screenHeight) {
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        spelbord = new Grid(screenWidth, screenHeight, 40);
    }

    public void teken(PApplet venster) {
        spelbord.teken(venster);
    }

    public void detecteerGebruikersInput(PApplet venster) {
        spelbord.klikGrid(venster);
    }
}

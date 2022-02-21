package minesweeper;

import processing.core.PApplet;

import java.util.Random;

public class Cell {
    private boolean isBomb;
    private boolean isRevealed;
    private float x, y, width, height;


    public Cell(float x, float y, float width, float height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        Random r = new Random();
        this.isBomb = r.nextInt(2) < 1;
        this.isRevealed = false;
    }

    public void teken(PApplet venster) {
        venster.rect(x, y, width, height);
        if(this.isRevealed) {
            if(this.isBomb) {
                venster.ellipse(this.x + (this.width / 2), this.y + (this.width / 2), this.width / 2, this.width / 2);
            }
        }
    }

    public boolean isMuisOver(float x, float y) {
        boolean muisOverHorizontaal = x > this.x && x < (this.x + this.width);
        boolean muisOverVerticaal = y > this.y && y < (this.y + this.width);
        return (muisOverHorizontaal && muisOverVerticaal);
    }

    public void reveal() {
        this.isRevealed = true;
    }

}

package minesweeper;

import processing.core.PApplet;

public class Grid {
    private Cell[][] cellGrid;
    private int nCellenRij;
    private int nCellenCol;

    public Grid(float screenWidth, float screenHeight, float cellWidth) {
        this.nCellenCol = (int) Math.floor( (screenHeight / cellWidth));
        this.nCellenRij = (int) Math.floor( (screenWidth / cellWidth));
        this.cellGrid = new Cell[nCellenRij][nCellenCol];
        setupGrid(cellWidth);
    }

    private void setupGrid(float cellWidth) {
        for(int i = 0; i < nCellenRij; i++) {
            for(int j = 0; j < nCellenCol; j++) {
                Cell cell = new Cell(i * cellWidth, j * cellWidth, cellWidth, cellWidth);
                cellGrid[i][j] = cell;
            }
        }
    }

    public void teken(PApplet venster) {
        for(int i = 0; i < nCellenRij; i++) {
            for (int j = 0; j < nCellenCol; j++) {
                cellGrid[i][j].teken(venster);
            }
        }
    }

    public void klikGrid(PApplet venster) {
        for(int i = 0; i < nCellenRij; i++) {
            for (int j = 0; j < nCellenCol; j++) {
                if (cellGrid[i][j].isMuisOver(venster.mouseX, venster.mouseY)) {
                    cellGrid[i][j].reveal();
                }
            }
        }
    }
}

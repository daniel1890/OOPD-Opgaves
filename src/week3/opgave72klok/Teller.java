package week3.opgave72klok;

class Teller{
    private int maximum;
    private int waarde;
    private float x, y, hoogte, breedte;
    MainApp app;

    Teller(MainApp app, int maximum, float x, float y, float breedte, float hoogte){
        this.app = app;
        this.maximum = maximum;
        waarde = 0;
        this.x = x;
        this.y = y;
        this.breedte = breedte;
        this.hoogte = hoogte;

    }

    void tik(){
        waarde = (waarde + 1) % maximum;
    }

    void tekenTeller(){
        app.rectMode(app.CENTER);
        app.noStroke();
        app.fill(0);
        app.rect(x, y, breedte, hoogte);

        app.fill(255, 0 , 0);
        app.textSize(hoogte);
        app.textAlign(app.CENTER);
        float verschuiving = (app.textAscent() - app.textDescent())/2;
        app.text(geefTijdNotatie(), x, y + verschuiving);
    }

    public int getWaarde() {
        return waarde;
    }

    public void setWaarde(int waarde) {
        this.waarde = waarde;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getHoogte() {
        return hoogte;
    }

    public void setHoogte(float hoogte) {
        this.hoogte = hoogte;
    }

    public float getBreedte() {
        return breedte;
    }

    public void setBreedte(float breedte) {
        this.breedte = breedte;
    }

    String geefTijdNotatie(){
        if (waarde < 10){
            return "0" + waarde;
        } else {
            return "" + waarde;
        }
    }

}
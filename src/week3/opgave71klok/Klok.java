package week3.opgave71klok;

class Klok{
    private Teller minutenTeller;
    private Teller urenTeller;

    public Klok(MainApp app, float x, float y, float breedte){
        float hoogte = breedte * 0.4f;
        urenTeller = new Teller(app, 24, x, y, breedte / 2, hoogte);
        minutenTeller = new Teller(app, 60, x + breedte / 2, y, breedte / 2, hoogte);
    }

    public void setTijd(int uren, int minuten){
        minutenTeller.setWaarde(uren);
        urenTeller.setWaarde(minuten);
    }

    public float getX() {
        return urenTeller.getX();
    }

    public void setX(float x) {
       urenTeller.setX(x);
       minutenTeller.setX(x + urenTeller.getBreedte());
    }

    public float getY() {
        return urenTeller.getY();
    }

    public void setY(float y) {
        urenTeller.setY(y);
        minutenTeller.setY(y);
    }

    public float getHoogte() {
        return urenTeller.getHoogte();
    }

    public void setHoogte(float hoogte) {
        urenTeller.setHoogte(hoogte);
        minutenTeller.setHoogte(hoogte);
    }

    public float getBreedte() {
        return urenTeller.getBreedte() + minutenTeller.getBreedte();
    }

    public void setBreedte(float breedte) {
        urenTeller.setBreedte(breedte / 2);
        minutenTeller.setBreedte(breedte / 2);
    }

    public void tik(){
        minutenTeller.tik();
        if (minutenTeller.getWaarde() == 0){
            urenTeller.tik();
        }
    }

    public void tekenKlok(){
        urenTeller.tekenTeller();
        minutenTeller.tekenTeller();
    }
}
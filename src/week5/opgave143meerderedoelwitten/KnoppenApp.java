package week5.opgave143meerderedoelwitten;

import java.util.ArrayList;
import processing.core.PApplet;

public class KnoppenApp extends PApplet {
	
	public static void main(String[] args) {
		PApplet.main(new String[] {"week5.opgave143meerderedoelwitten.KnoppenApp"});
	}
	
	private ArrayList<Knop> knoppen = new ArrayList<>();

	private IDoelwit licht;
	private IDoelwit tekstraam;
	private IDoelwit origineletekstraam;
	
	public void settings(){
		size(400, 400);	
	}
	
	public void setup() {

		licht = new Licht(this);
		tekstraam = new Tekstraam(this,"OOPD",250,250);
		origineletekstraam = new Tekstraam(this,"originele-tekst",150,150);


		Switch eenSwitch=new Switch(this,100,20,50,50);
		Switch tweeSwitch=new Switch(this,200,20,100,50);

		eenSwitch.voegDoelwitToe(licht);
		eenSwitch.voegDoelwitToe(tekstraam);
		tweeSwitch.voegDoelwitToe(licht);
		tweeSwitch.voegDoelwitToe(origineletekstraam);


		knoppen.add(eenSwitch);
		knoppen.add(tweeSwitch);
		
	}
	
	public void draw() {
		licht.teken();
		tekstraam.teken();
		origineletekstraam.teken();
		for (Knop k : knoppen) {
			k.tekenKnop();
		}
	}
	
	public void mousePressed() {
		for (Knop k : knoppen) {
			if (k.isMuisOverKnop()) {
				k.handelInteractieAf();
			}
		}
	}
}

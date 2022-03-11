package Week4.knoppenapp;

import processing.core.PApplet;

public class Licht implements IDoelwit {
	private PApplet app;
	private int kleur;
	private boolean isAan;
	
	public Licht(PApplet app) {
		this.app = app;
		kleur = 0;
	}

	@Override
	public void schakel() {
		if (kleur == 0) {
			kleur = 0xFFA4C739;
			isAan = false;
		}
		else {
			kleur = 0;
			isAan = true;
		}
	}
	
	public void tekenLicht() {
		app.background(kleur);
	}

	public boolean isAan() {
		return isAan;
	}
}
package Week4.knoppenapp;

import processing.core.PApplet;

public class DoelwitKnop extends Knop {

	private IDoelwit doelwit;
	
	public DoelwitKnop(PApplet app, IDoelwit doelwit, float x, float y, float breedte,
					   float hoogte) {
		super(app, x, y, breedte, hoogte);
		this.doelwit = doelwit;
	}

	public void doeKnopActie() {
		doelwit.schakel();
	}

}

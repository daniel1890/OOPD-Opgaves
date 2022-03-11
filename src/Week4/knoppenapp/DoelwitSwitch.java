package Week4.knoppenapp;

import processing.core.PApplet;

public class DoelwitSwitch extends Switch {
	
	private IDoelwit doelwit;
	
	public DoelwitSwitch(PApplet app, IDoelwit doelwit, float x, float y, float breedte,
			float hoogte) {
		super(app, x, y, breedte, hoogte);
		this.doelwit = doelwit;
	}
	
	@Override
	protected void doeKnopActie() {
		doelwit.schakel();
	}

}

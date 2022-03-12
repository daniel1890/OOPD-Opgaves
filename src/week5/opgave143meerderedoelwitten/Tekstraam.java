package week5.opgave143meerderedoelwitten;

import processing.core.PApplet;

public class Tekstraam implements IDoelwit{

	private PApplet app;
	private String string;
	private int x;
	private int y;
	private boolean isActief = false;
	
	
	public Tekstraam(KnoppenApp knoppenApp, String string, int i, int j) {
		this.app = knoppenApp;
		this.string = string;
		this.x = i;
		this.y = j;
	}

	@Override
	public void schakel() {
		isActief = !isActief;
	}

	@Override
	public void teken() {
		if (isActief) {
			app.text(string, x, y);
		}
	}
	
}

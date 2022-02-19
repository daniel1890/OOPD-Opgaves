package week3.opgave91lottomachine;

import java.util.ArrayList;

public class Scorebord {
	private ArrayList<Lottobal> glazen;
	private Lottobal reservebal;

	public Scorebord() {
		this.glazen = new ArrayList<>();
	}

	public void plaatsBal(Lottobal bal){
		glazen.add(bal);
	}
	
	public void maakLeeg(){
		this.glazen.clear();
	}
	
	public void plaatsBonusBal(Lottobal bal){
		this.reservebal = bal;
	}
		
	public void sorteerBallen(){
		for (int i = glazen.size(); i > 0; i--) {
			for (int j = 0; j < i-1; j++) {
				if (glazen.get(j).isNummerGroterDan(glazen.get(j+1))) {
					Lottobal bal = glazen.get(j);
					glazen.set(j, glazen.get(j + 1));
					glazen.set(j + 1, bal);
				}
			}
		}
	}
	
	public void printScorebord(){
		for(int i = 0; i < glazen.size(); i++) {
			System.out.println("Bal nummer: " + (i + 1) + ", getal op de bal: " + glazen.get(i).toString());
		}
		System.out.println("Bonus getal: " + this.reservebal.toString());
	}
}

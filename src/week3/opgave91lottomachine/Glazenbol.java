package week3.opgave91lottomachine;

import java.util.ArrayList;
import java.util.Random;

public class Glazenbol {
	private ArrayList<Lottobal> ballen;
	
	public void verzamelAlleBallen(){
		this.ballen = new ArrayList<>();

		for (int i = 1; i <= 45; i++) {
			Lottobal lottobal = new Lottobal(i);
			this.ballen.add(lottobal);
		}
	}
	
	public Lottobal schepBal(){
		Random r = new Random();
		int randomInt = r.nextInt(ballen.size());
		Lottobal randomBal = ballen.get(randomInt);
		ballen.remove(randomBal);
		return randomBal;
	}
}

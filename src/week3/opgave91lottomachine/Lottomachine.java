package week3.opgave91lottomachine;

public class Lottomachine {
	private Glazenbol glazenbol;
 	private Scorebord scorebord;

	public Lottomachine(){
		this.glazenbol = new Glazenbol();
		this.scorebord = new Scorebord();
	}

	public void voerTrekkingUit(){
		glazenbol.verzamelAlleBallen();
		scorebord.maakLeeg();

		for (int i = 0; i < 6; i++) {
			Lottobal lottobal = glazenbol.schepBal();
			scorebord.plaatsBal(lottobal);
		}
		scorebord.sorteerBallen();

		Lottobal bonusbal = glazenbol.schepBal();
		scorebord.plaatsBonusBal(bonusbal);

		scorebord.printScorebord();
	}
}

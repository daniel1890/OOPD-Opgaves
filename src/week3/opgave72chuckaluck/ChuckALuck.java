package week3.opgave72chuckaluck;

public class ChuckALuck {
    private Dobbelbeker dobbelbeker;
    private int ronde;
    private int saldo;
    private int geluksGetal;
    private int aantalWinnendeWorpen;

    public ChuckALuck(int saldo) {
        this.saldo = saldo;
        this.ronde = 0;
        this.dobbelbeker = new Dobbelbeker(3);
    }

    public void speelRonde(int geluksGetal, int inzet) {
        if(saldo >= inzet) {
            this.saldo -= inzet;
            this.geluksGetal = geluksGetal;
            this.aantalWinnendeWorpen = this.dobbelbeker.aantalGetallenGelijkAanGeluksGetal(geluksGetal);
            //int[] worp = this.dobbelbeker.dobbel();
//            for(int i = 0; i < 3; i++) {
//                if(worp[i] == geluksGetal) {
//                    this.aantalWinnendeWorpen ++;
//                }
//            }

            switch (this.aantalWinnendeWorpen) {
                case 0:
                    break;
                case 1:
                    this.saldo += inzet;
                    break;
                case 2:
                    this.saldo += (inzet * 2);
                    break;
                case 3:
                    this.saldo += (inzet * 10);
                    break;
            }
            this.ronde ++;
        } else{
            System.out.println("Niet genoeg saldo");
        }
    }

    @Override
    public String toString() {
        return "ChuckALuck{" +
                "dobbelbeker=" + dobbelbeker +
                ", ronde=" + ronde +
                ", saldo=" + saldo +
                ", geluksGetal=" + geluksGetal +
                ", aantalWinnendeWorpen=" + aantalWinnendeWorpen +
                '}';
    }
}

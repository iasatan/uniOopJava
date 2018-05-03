package tartalyos;

public abstract class Tarolo {
	private int terfogat; //1

	public Tarolo(int terfogat) { //1
		this.terfogat = terfogat;
	}
	
	public abstract boolean veszelyesE(); //1
	
	public int getTerfogat() { //1
		return terfogat;
	}

}

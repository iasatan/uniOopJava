package tartalyos;

public class Tartaly extends Tarolo { //1
	private double nyomas; 

	public Tartaly(int terfogat, double nyomas) {
		super(terfogat);
		this.nyomas = nyomas;
	} 												//1
	
	public boolean nagyobbNyomasu(Tartaly tartaly) {
		return nyomas>tartaly.nyomas;
	}

	@Override
	public boolean veszelyesE() { //1
		return getTerfogat()*nyomas>100;
	}
	@Override
	public String toString() { //1
		String message="Terfogat: "+getTerfogat()+", nyomás: "+nyomas;
		if(veszelyesE()) {
			return message+", veszelyes";
		}
		return message+", nem veszelyes";
	}
	
	public static Tartaly nagyobb(Tartaly tartaly1, Tartaly tartaly2) { //1
		if(tartaly1.getTerfogat()<tartaly2.getTerfogat()) {
			return tartaly2;
		}
		return tartaly1;
	}
	
}

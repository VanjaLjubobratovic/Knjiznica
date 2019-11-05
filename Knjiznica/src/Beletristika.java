
public class Beletristika extends Knjiga implements Posudba {

	public Beletristika(String ime, int br) {
		super(ime, br);
	}

	@Override
	public void posudi() {
		if(this.brPrimjeraka > 0)
			this.brPrimjeraka--;
		else System.out.println("Knjiga nije dostupna za posudbu");
	}

	@Override
	public void vrati() {
		this.brPrimjeraka++;
	}

	@Override
	public void naruci(int br) {
		this.brPrimjeraka += br;

	}

}

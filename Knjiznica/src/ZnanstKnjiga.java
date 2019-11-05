
public class ZnanstKnjiga extends Knjiga implements Kupnja {

	String znanost;
	int cijena;
	
	
	public ZnanstKnjiga(String ime, int br, String znanost) {
		super(ime, br);
		this.znanost = znanost;
	}

	@Override
	public void kupi() {
		if(this.cijena == 0) {
			System.out.println("Nije postavljena cijena");
			return;
		}
		if(this.brPrimjeraka > 0)
			this.brPrimjeraka--;
		else
			System.out.println("Knjiga nije dostupna");
	}

	@Override
	public void setCijena(int cijena) {
		this.cijena = cijena;
	}

	@Override
	public void naruci(int br) {
		this.brPrimjeraka += br;
	}

}

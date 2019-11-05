
public class ZbirkaZad extends Knjiga implements Kupnja, Posudba {
	
	String znanost;
	int cijena;
	

	public ZbirkaZad(String ime, int br, String znanost) {
		super(ime, br);
		this.ime = ime;
		this.znanost = znanost;
	}

	@Override
	public void posudi() {
		if(this.brPrimjeraka > 1)
			this.brPrimjeraka--;
		else System.out.println("Ne moze se posuditi zadnji primjerak");
	}

	@Override
	public void vrati() {
		this.brPrimjeraka++;
	}

	@Override
	public void kupi() {
		if(this.cijena == 0) {
			System.out.println("Nije postavljena cijena");
			return;
		}
		if(this.brPrimjeraka > 1)
			this.brPrimjeraka--;
		else System.out.println("Ne moze se kupiti zadnji primjerak");

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

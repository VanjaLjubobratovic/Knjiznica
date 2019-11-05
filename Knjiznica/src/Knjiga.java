
public abstract class Knjiga {
	
	int brPrimjeraka;
	String ime;
	
	public Knjiga(String ime, int br) {
		this.ime = ime;
		this.brPrimjeraka = br;
	}
	
	public abstract void naruci(int br);
}

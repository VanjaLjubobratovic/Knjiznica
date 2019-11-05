
public class Test {

	public static void main(String[] args) {
		
	/*	ZnanstKnjiga z1 = new ZnanstKnjiga("Matematika 2", 2, "Matematika");
		z1.kupi();
		z1.setCijena(30);
		z1.kupi();
		z1.kupi();
		System.out.println("Broj preostalih primjeraka: " + z1.brPrimjeraka);*/
		
		ZbirkaZad b1 = new ZbirkaZad("Fizika 1", 1, "Fizika");
		b1.setCijena(30);
		
		b1.posudi();
		b1.kupi();
		b1.naruci(2);
		System.out.println(b1.brPrimjeraka);
		b1.kupi();
		System.out.println(b1.brPrimjeraka);
	}

}

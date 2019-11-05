
public class Test {

	public static void main(String[] args) {
		
		ZnanstKnjiga z1 = new ZnanstKnjiga("Matematika 2", 2, "Matematika");
		z1.kupi();
		z1.setCijena(30);
		z1.kupi();
		z1.kupi();
		System.out.println("Broj preostalih primjeraka: " + z1.brPrimjeraka);
	}

}

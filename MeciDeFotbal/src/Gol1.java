public class Gol1 extends Exception {
	public Gol1(Minge m, String echipa) {
		super("Gol pentru " + echipa);
		System.out.println(getMessage());
		m.setX(50);
		m.setY(25);
	}

}
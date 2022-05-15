public class Gol2 extends Exception {
	public Gol2(Minge m, String echipa) {
		super("Gol pentru " + echipa);
		System.out.println(getMessage());
		m.setX(50);
		m.setY(25);
	}

}
public class Out extends Exception {
	public Out(Minge m) {
		super("Out");
		System.out.println(getMessage());
		if (m.getY() == 0)
			m.setY(1);
		if (m.getY() == 50)
			m.setY(49);
	}
}

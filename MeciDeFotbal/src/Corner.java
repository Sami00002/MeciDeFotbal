public class Corner extends Exception {
	public Corner(Minge m) {
		super("Corner");
		System.out.println(getMessage());
		if (m.getX() == 0)
			m.setX(1);
		if (m.getX() == 100)
			m.setX(99);
	}

}
import java.util.Random;

public class Minge {

	private int x;
	private int y;
	private Random randomGenerator;

	public Minge(int x, int y) {
		this.x = x;
		this.y = y;
		randomGenerator = new Random();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void suteaza() {
		setX(randomGenerator.nextInt(101));
		setY(randomGenerator.nextInt(51));
	}

}


public class Joc {
	private String echipa1;
	private String echipa2;
	Minge m;
	private int gol1 = 0;
	private int gol2 = 0;
	private int corner = 0;
	private int out = 0;

	public Joc(String echipa1, String echipa2) {
		this.echipa1 = echipa1;
		this.echipa2 = echipa2;
		m = new Minge(50, 25);
	}

	public void simuleaza() throws Corner, Gol1, Gol2, Out {

		if (m.getY() <= 0 || m.getY() >= 50) {
			throw new Out(m);
		}
		if (m.getX() <= 0 && m.getY() >= 20 && m.getY() <= 30) {
			throw new Gol1(m, echipa1);
		}
		if (m.getX() >= 100 && m.getY() >= 20 && m.getY() <= 30) {
			throw new Gol2(m, echipa2);
		}
		if (m.getX() <= 0
				|| m.getX() >= 100 && ((m.getY() >= 0 && m.getY() >= 20) || (m.getY() >= 30 && m.getY() <= 50))) {
			throw new Corner(m);
		}
	}

	public String getEchipa1() {
		return echipa1;
	}

	public void setEchipa1(String echipa1) {
		this.echipa1 = echipa1;
	}

	public String getEchipa2() {
		return echipa2;
	}

	public void setEchipa2(String echipa2) {
		this.echipa2 = echipa2;
	}

	public int getGol1() {
		return gol1;
	}

	public void setGol1(int gol1) {
		this.gol1 = gol1;
	}

	public int getGol2() {
		return gol2;
	}

	public void setGol2(int gol2) {
		this.gol2 = gol2;
	}

	public int getCorner() {
		return corner;
	}

	public void setCorner(int corner) {
		this.corner = corner;
	}

	public int getOut() {
		return out;
	}

	public void setOut(int out) {
		this.out = out;
	}

}

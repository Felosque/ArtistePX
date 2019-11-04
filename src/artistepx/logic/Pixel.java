package artistepx.logic;

public class Pixel {
	
	private int positionX;
	
	private int positionY;
	
	private int ColorR, colorG, colorB;

	public Pixel(int positionX, int positionY, int colorR, int colorG, int colorB) {
		super();
		this.positionX = positionX;
		this.positionY = positionY;
		this.ColorR = colorR;
		this.colorG = colorG;
		this.colorB = colorB;
	}
	
	public Pixel() {
		super();
	}

	public int getPositionX() {
		return positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public int getColorR() {
		return ColorR;
	}

	public int getColorG() {
		return colorG;
	}

	public int getColorB() {
		return colorB;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	public void setColorR(int colorR) {
		ColorR = colorR;
	}

	public void setColorG(int colorG) {
		this.colorG = colorG;
	}

	public void setColorB(int colorB) {
		this.colorB = colorB;
	}
	
}

package artistepx.logic;

public class ArtistePX {

	private PaintBrush paintBrush;
	
	public ArtistePX() {
		paintBrush = new PaintBrush();
	}

	public PaintBrush getPaintBrush() {
		return paintBrush;
	}

	public void setPaintBrush(PaintBrush paintBrush) {
		this.paintBrush = paintBrush;
	}
	
}

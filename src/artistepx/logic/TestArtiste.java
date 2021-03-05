package artistepx.logic;

import java.util.ArrayList;

public class TestArtiste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArtistePX px = new ArtistePX();
		ArrayList<Pixel> pixeles = new ArrayList<Pixel>();
		for (int i = 0; i < 20; i++) {
			pixeles.add(new Pixel(1, 1, 2, 4, 2));
		}
		px.savePixelArt("miPixelArte", pixeles);
		
		
		ArrayList<Pixel> cargadoPixel = px.viewPixelArt("./saves/miPixelArte.artpx");
		for (int i = 0; i < cargadoPixel.size(); i++) {
			System.out.println(cargadoPixel.get(i).toString());
		}
		
		
	}

}

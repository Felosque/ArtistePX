package artistepx.logic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArtistePX {

	
	public ArtistePX() {
		
	}
	

	public void savePixelArt(String nameArtPX, ArrayList<Pixel> pixels)
	{
		try {
			ObjectOutputStream writingFile = new ObjectOutputStream( 
	        new FileOutputStream("saves/"+nameArtPX+".artpx") );
	        writingFile.writeObject(pixels);
	        writingFile.close();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public ArrayList<Pixel> viewPixelArt(String nameArtPX){
		
		ArrayList<Pixel> pixels = new ArrayList<Pixel>();
		
		try {
			ObjectInputStream readingFile = new ObjectInputStream( 
	            new FileInputStream(nameArtPX) );
			pixels = (ArrayList<Pixel>) readingFile.readObject();
            readingFile.close();
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return pixels;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

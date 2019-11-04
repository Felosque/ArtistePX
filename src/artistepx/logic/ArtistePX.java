package artistepx.logic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class ArtistePX {

	
	public ArtistePX() {
		
	}
	

	public void savePixelArt(String nameArtPX, ArrayList<Pixel> pixels)
	{
		File pixelArt = new File("saves/"+nameArtPX+".artpx");
		try 
		{
			FileOutputStream archive = new FileOutputStream(pixelArt);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(archive));
			try 
			{
				bw.write("20-20");
				bw.newLine();

				for (int i = 0; i < pixels.size(); i++) {
					bw.write(pixels.get(i).getPositionX() + "-" + pixels.get(i).getPositionY() + "-" + 
							pixels.get(i).getColorR() + "-" +pixels.get(i).getColorG()+ "-"+ pixels.get(i).getColorB());
					bw.newLine();
				}
				
				bw.close();
				archive.close();
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public ArrayList<Pixel> viewPixelArt(String nameArtPX){
		
		ArrayList<Pixel> pixels = new ArrayList<Pixel>();
		
		try 
		{
			FileReader pixelArt = new FileReader(nameArtPX);
			BufferedReader br = new BufferedReader(pixelArt);
			String data;
			try 
			{
				data = br.readLine();
				while ( data != null) {
					
					String[] pixelData = data.split("\\-");
					
					Pixel pixel = new Pixel();
					pixel.setPositionX(Integer.parseInt(pixelData[0]));
					pixel.setPositionY(Integer.parseInt(pixelData[1]));
					pixel.setColorR(Integer.parseInt(pixelData[2]));
					pixel.setColorG(Integer.parseInt(pixelData[3]));
					pixel.setColorB(Integer.parseInt(pixelData[4]));
					
					pixels.add(pixel);
					
					data = br.readLine();
				}
				br.close();
				pixelArt.close();
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pixels;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

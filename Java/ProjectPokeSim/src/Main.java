import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Gotta Catch Them All :) ");
		
		String file = "pkmnDataWithFlavorText.csv";
		
		PokeList dex = storePokemon(file);
		
		DexFrame frame = new DexFrame();

		

	}
	
	
	
	
	public static PokeList storePokemon(String file) {
		BufferedReader reader  = null;
		String line = "";
		PokeList pokeList = new PokeList();
		int count = 0;
		try {
			reader = new BufferedReader(new FileReader(file));
			line = reader.readLine();
			while((line = reader.readLine()) != null && count < 3 ) {
				String[] row = line.split(",");
				Pokemon poke = new Pokemon(row);
				pokeList.addPokemon(poke);
				//System.out.println(Arrays.toString(row));
				count++;
			}	
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
			}
			catch (IOException e) {	
				e.printStackTrace();
			}
		}
		return pokeList;
	}

}

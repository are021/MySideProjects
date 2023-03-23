import java.util.ArrayList;
import java.util.HashMap;

public class PokeList{
	
	private HashMap<String, String[]> dexEntries;
	private String namesList[];
	static int pokeCount;
	
	
	public PokeList(){
		this.dexEntries = new HashMap<String,String[]>();
		namesList = new String[151];
		pokeCount = 0;
	}
	
	public void addPokemon(String name, String[] pokemon) {
		this.dexEntries.put(name, pokemon);
		namesList[pokeCount++] = name; 
//		System.out.println(namesList[pokeCount]);
//		pokeCount++;
	}
	
	public String[] getNames() {
		return this.namesList;
	}
	public HashMap<String,String[]> getDict(){
		return dexEntries;
	}
	
}

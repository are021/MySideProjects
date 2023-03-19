import java.util.ArrayList;
import java.util.HashMap;

public class PokeList{
	
	private HashMap<String, String[]> dexEntries;
	
	
	
	public PokeList(){
		this.dexEntries = new HashMap<String,String[]>();
	}
	
	public void addPokemon(String name, String[] pokemon) {
		this.dexEntries.put(name, pokemon);
	}
	
}

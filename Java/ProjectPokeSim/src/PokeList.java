import java.util.ArrayList;

public class PokeList{
	ArrayList<Pokemon> dexEntries = new ArrayList<Pokemon>();
	
	
	
	public PokeList(){
		this.dexEntries = new ArrayList<Pokemon>();
	}
	
	public void addPokemon(Pokemon pokemon) {
		this.dexEntries.add(pokemon);
	}
	
}

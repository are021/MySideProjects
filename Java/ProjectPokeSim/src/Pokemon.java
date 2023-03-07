
public class Pokemon {
	String abilities;
	String name;
	String desc;
	String type1;String type2;
	String id;
	
	public Pokemon(String[] data) {
		this.abilities = data[0];
		this.name = data[31];
		this.desc = data[42];
		this.type1 = data[37];
		this.type2 = data[38];
		this.id = data[33];
	}
	
	public String toString() {
		return this.id;
	}
	
}

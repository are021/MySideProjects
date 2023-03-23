import java.util.Arrays;

public class Pokemon {
	private String abilities;
	private String name;
	private String desc;
	private String type1;String type2;
	private String id;
	private String[] data;
	
	//Constructor
	public Pokemon(String[] data) {
		this.abilities = data[0];
		this.name = data[30];
		this.desc = data[41].replace('|', ',');
		this.type1 = data[36];
		this.type2 = data[37];
		this.id = data[32];
		this.data = new String[]{abilities,desc,type1,type2,id};
	}
	
	/*
	 * Getters 
	 */
	public String getName() {
		return this.name;
	}
	
	public String[] getData() {
		return this.data;
	}
	
	/*
	 * To String Function
	 */
	public String toString() {
		return this.name;
	}
	
}

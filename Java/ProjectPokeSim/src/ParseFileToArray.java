import java.util.ArrayList;

public class ParseFileToArray {
	ArrayList<String[]> dexEntries;
	
	public ParseFileToArray(){
		this.dexEntries = new ArrayList<String[]>();
	}
	public void addArray(String[] val) {
		this.dexEntries.add(val);
	}
	
}

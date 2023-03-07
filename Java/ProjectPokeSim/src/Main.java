import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Gotta Catch Them All :) ");
		
		String file = "pkmnDataWithFlavorText.csv";
		
		BufferedReader reader  = null;
		String line = "";
		
		try {
			reader = new BufferedReader(new FileReader(file));
			while((line = reader.readLine()) != null) {
				String[] row = line.split(",");
				
				System.out.println(row[0]);
				/*
				for(String val : row) {
					System.out.printf("%-10s", val);
				}
				*/
				System.out.println("Done Reading!");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}

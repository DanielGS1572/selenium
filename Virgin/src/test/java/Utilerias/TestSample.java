package Utilerias;
import java.io.IOException;
import java.util.ArrayList;

public class TestSample {

	public static void main(String[] args) {
		
		DataDriven dd = new DataDriven();
		ArrayList<String> data;
		try {
			data = dd.getData("Login");
			System.out.println(data.get(0));
			System.out.println(data.get(1));
			System.out.println(data.get(2));
			System.out.println(data.get(3));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

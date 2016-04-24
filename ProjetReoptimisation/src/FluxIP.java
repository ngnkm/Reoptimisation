import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FluxIP {
	
    private	BufferedReader bin = null;

// ouvre un fichier et le stock dans un buffer	
	public FluxIP(String name){

		try {
			InputStream fin = new FileInputStream(name);
			InputStreamReader rin = new InputStreamReader(fin);
			bin = new BufferedReader(rin);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
// methode qui renvoie le prochain flux (IP) correspondant du fichier name 	
	public Integer next(){
		String ligne;
		try {
			if((ligne = bin.readLine()) != null){
		    	String[] tr = ligne.split(".");
			    Integer IP = ((256*Integer.parseInt(tr[3]) + Integer.parseInt(tr[2]))*256 + Integer.parseInt(tr[1]))*256 + Integer.parseInt(tr[0]);
				return IP;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}
	

}

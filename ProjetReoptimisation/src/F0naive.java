import java.util.Set;
import java.util.TreeSet;


public class F0naive implements StreamingAlgo{
	private Set<Integer> IPstockage;
	private int count;

	//constructeur de la classe
	F0naive(){
		IPstockage = new TreeSet<Integer>();
		count = 0;
	}
	
// stocke les adresses IP distinctes	
	public void update(int token){
		if(IPstockage.add(token))
		count++;
	}
	
	//retourne le nombre de fichier distinct
	public int val(){
		return count;
	}

}

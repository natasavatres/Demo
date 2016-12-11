import java.util.LinkedList;

public class Izvrsi {
	public void ispisiSveStudente(LinkedList lista){
		if(lista==null){
			System.out.println("Nema liste.");
			return;
		}
		int i=0;
		while(i < lista.size()){
			System.out.println(lista.get(i).toString());
			i++;
		}
	}
}

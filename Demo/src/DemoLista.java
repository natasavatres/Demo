import java.util.LinkedList;

public class DemoLista {
	public LinkedList<Student> listaStudenata=new LinkedList<Student>();
	public void napraviListu(Student s){
		if(s==null){
			System.out.println("Nema studenta.");
			return;
		}
		listaStudenata.add(s);
	}
	
}

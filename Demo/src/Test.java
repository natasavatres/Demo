import java.util.LinkedList;

public class Test {
	public static void main(String args[]){
		DemoLista ds = new DemoLista();
		Izvrsi i = new Izvrsi();
		
		Student s=new Student("Pera","Peric",2014,"10/14");
		Student s1=new Student("Mira","Peric",2014,"12/14");
		Student s2=new Student("Zika","Peric",2014,"108/14");
		Student s3=new Student("Laza","Peric",2014,"107/14");
		
		ds.napraviListu(s);
		ds.napraviListu(s1);
		ds.napraviListu(s2);
		ds.napraviListu(s3);
		
		i.ispisiSveStudente(ds.listaStudenata);
		
	}
}

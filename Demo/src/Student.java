
public class Student {
	private String ime;
	private String prezime;
	private int godinaUpisa;
	private String brIndeksa;
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getGodinaUpisa() {
		return godinaUpisa;
	}
	public void setGodinaUpisa(int godinaUpisa) {
		this.godinaUpisa = godinaUpisa;
	}
	public String getBrIndeksa() {
		return brIndeksa;
	}
	public void setBrIndeksa(String brIndeksa) {
		this.brIndeksa = brIndeksa;
	}
	
	public String toString(){
		return "Ime: "+ime+"Prezime: " +prezime+"Godina upisa: "+godinaUpisa+"Broj indeksa: "+brIndeksa;
	}
}

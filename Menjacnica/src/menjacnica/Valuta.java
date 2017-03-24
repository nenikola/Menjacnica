package menjacnica;

import java.util.LinkedList;

public class Valuta {
	private String naziv;
	private String skracenNaziv;
	private LinkedList<Dan> kursevi=new LinkedList<Dan>();
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getSkracenNaziv() {
		return skracenNaziv;
	}
	public void setSkracenNaziv(String skracenNaziv) {
		this.skracenNaziv = skracenNaziv;
	}
	public LinkedList<Dan> getKursevi() {
		return kursevi;
	}
	public void setKursevi(LinkedList<Dan> kursevi) {
		this.kursevi = kursevi;
	}
	
	
}

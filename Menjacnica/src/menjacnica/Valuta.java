package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejs.interfejsMenjacnice;

public class Valuta implements interfejsMenjacnice {
	private String naziv;
	private String skracenNaziv;
	private LinkedList<Dan> kursevi=new LinkedList<Dan>();
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv!=null)
			this.naziv = naziv;
	}
	public String getSkracenNaziv() {
		return skracenNaziv;
	}
	public void setSkracenNaziv(String skracenNaziv) {
		if(skracenNaziv!=null && skracenNaziv.length()==3)
			this.skracenNaziv = skracenNaziv;
	}
	public LinkedList<Dan> getKursevi() {
		return kursevi;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kursevi == null) ? 0 : kursevi.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((skracenNaziv == null) ? 0 : skracenNaziv.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if(obj instanceof Valuta){
			Valuta other = (Valuta) obj;
			if(other.naziv.equals(this.naziv))
				return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "Valuta naziv=" + naziv + ", skracenNaziv=" + skracenNaziv + ", kursevi=" + kursevi ;
	}
	@Override
	public void dodajKurs(GregorianCalendar datum, double prodajni, double kupovni, double srednji) {

		Dan noviKurs=new Dan();
		noviKurs.setDatum(datum);
		noviKurs.setKupovniKurs(kupovni);
		noviKurs.setProdajniKurs(prodajni);
		noviKurs.setSrednjiKurs(srednji);
		this.kursevi.add(noviKurs);

	}
	@Override
	public void obrisiKurs(GregorianCalendar datum) {
		for(int i=0;i<this.kursevi.size();i++){
			if(this.kursevi.get(i).getDatum().equals(datum))
				this.kursevi.remove(i);
		}
	}
	@Override
	public Dan pronadjiKurs(GregorianCalendar datum) {
		for(int i=0;i<this.kursevi.size();i++){
			if(this.kursevi.get(i).getDatum().equals(datum))
				return this.kursevi.get(i);
		}
		return null;
	}
	
	
}

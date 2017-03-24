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
		return "Valuta [naziv=" + naziv + ", skracenNaziv=" + skracenNaziv + ", kursevi=" + kursevi + "]";
	}
	
	
}

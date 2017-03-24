package interfejs;

import java.util.GregorianCalendar;

import menjacnica.Dan;

public interface interfejsMenjacnice {
	public void dodajKurs(GregorianCalendar datum, double prodajni, double kupovni, double srednji);
	public void obrisiKurs(GregorianCalendar datum);
	public Dan pronadjiKurs(GregorianCalendar datum);
}

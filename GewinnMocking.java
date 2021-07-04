/**
 * Der 3. Teil der Einsendeaufgabe
 * Diese Klasse beinhaltet eine Methode welchen den Gewinn eines Produktes darstellt. Dabei wird eine MArge auf den Einkaufpreis(netto) draufgerechnet welche somit den Verkaufspreis entspricht.
 * Danach wird die Mehrwertsteuer vom Gewinn abgezogen.
 * 
 * @author Hanning Liu (901350) s82377@beuth-hochschule.de @date 01.07.21 @version v0.1
 *
 */
public class GewinnMocking {
	
	MargeMocking m = new MargeMocking();
	
	public double gewinnBerechnen (double einkauf) {
		
		double verkauf = m.marge(einkauf);  //Initialisierung von MargeMocking welche verhidnert werden soll.
		
		
		double gewinn = verkauf * 0.81; // 19% Mwst.
		
		
		return gewinn - einkauf; 
		
	}

}

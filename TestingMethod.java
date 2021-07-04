import java.text.DecimalFormat;
/** Der erste Teil der Einsendeaufgabe Testing aus dem Modul Softwaretechnik SoSe2021.
 * Wie abgesprochen, reiche ich diese Einsendeaufgabe verspätet nach.
 * 
 * Diese Klasse enthält fuenf Methoden, die den Umfang/Flaecheninhalt eines Rechteckes und eines Kreises ausrechnen sollen. Die letzte Methode berechnet eine Wurzel.
 * Bei dieser Methode habe ich eine Exception eingebaut, dass die Zahl unter der Wurzel nicht negativ sein darf.
 * 
 * @author Hanning Liu (901350) s82377@beuth-hochschule.de @date 01.07.21 @version v0.2
 **/


public class TestingMethod {

	/**
	 * Umfang eines Viereckes
	 * @param x Seitenlaenge
	 * @param y Seitenlaenge
	 * @return Umfang
	 */
	public double umfangViereck (int x, int y) {
		
		return 2 * x + 2 * y;
		
	}
	
	/**
	 * Flaeche eines Viereckes
	 * @param x Seitenlaenge
	 * @param y Seitenlaenge
	 * @return Flaeche
	 */
	public int flaecheViereck (int x, int y) {
		
		return x * y + 1; //BAD CODE - absichtlicher Fehler
		
	}
	
	DecimalFormat f = new DecimalFormat("#0.00");
	
	/**
	 * Umfang eines Kreises
	 * @param r Radius des Kreises
	 * @return Umfang
	 */
	public String umfangKreis (double r) {
		
		double d = 2 * Math.PI * r;
						
		return f.format(d);
		
	}
	
	/**
	 * Flaeche eines Kreises
	 * @param r Radius des Kreises
	 * @return Flaeche
	 */
	public String flaecheKreis (double r) {
		
		double d = r * r * Math.PI;
		
		return f.format(d);
		
	}
	
	/**
	 * einfache Wurzel
	 * Exception included bei w < 0
	 * @param w Zahl von der die Wurzel gezogen werden soll
	 * @return Wurzel
	 */
	public double wurzel (double w) {
		
		
			if (w < 0) {
	
				throw new IllegalArgumentException("Zahl darf nicht kleiner als 0 sein!");
				
			}
		
	
		return Math.sqrt(w);
			
	}
	

		
	
	
}

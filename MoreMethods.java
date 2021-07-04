/**
 * Der 2. Teil der Einsendeaufgabe
 * Eine Klasse welche verschiedene Methoden darstellt, dabei hatte ich anfangs die Zeichen in € Aufgabenstellung falsch verstanden und nachträglich noch hinzugefuegt.
 * Ich denke diese Methoden sind etwas abstrakt doch geht es nicht meiner Meinung nach nicht unbedingt um den Code sondern ums testen.
 * 
 * 	@author Hanning Liu (901350) s82377@beuth-hochschule.de @date 01.07.21 @version v0.4
 */
public class MoreMethods {
	
	/**
	 * Methode welche eine Zeichenausgabe mit dem Zeichen € hinten als Integer ausgibt.
	 * 
	 * @param eingabe Stringeingabe 
	 * @return Euro als Integer
	 */
	public int zeichenToEuro (String eingabe) {
			
		for (int i = 0; i < eingabe.length(); i++) {
										
			if(eingabe.charAt(i) == '€') {
					if (i == 0) {
						break; //Ausgabe 0, wenn vor dem Eurozeichen kein weiteres Zeichen steht.
					}
				String fertig = eingabe.substring(0, i);
				return Integer.parseInt(fertig);
									
			}else {
				continue;
				}
			
		}
		
		return 0;  //Ausgabe 0, wenn kein Eurozeichen zu finden ist.
	}
	
	/**
	 * Methode welche die Anzahl der Zeichen in Geld umrechnet 1:10
	 * 
	 * @param text String welche die Anzahl der Zeichen enthaelt
	 * @return Geld als double, welches das Honorar fuer alle Zeichen ausgibt
	 */
	public double zeichenToHonorar(String text) {
		
		double honorar = text.length();  // Zaehlen der Zeichen
		
		return honorar/10; // 10Cent pro Zeichen
	}
	
	/**
	 * Methode welche den uebergebenen String nach dem Wort 'picture' durchsucht und 
	 * bei jedem gefunden Wort hochzaehlt.
	 * 
	 * @param eingabe Stringtext
	 * @return Anzahl des gefundenen Wortes als Integer
	 */
	public int countPictures (String eingabe) {
		
		int anzahl = 0;
		
		String wort = "picture"; //Suchwort
		
		for (int i = 0; i < eingabe.length() - wort.length() + 1; i++) {
										
				if(eingabe.substring(i, i + wort.length()).toLowerCase().contains(wort)) { 
					
					i = i + wort.length()-1;
					anzahl++;
									
			}
			
		}
		
		return anzahl;
		
	}
	
	/**
	 * Gleiche Methode wie countPictures nur als Falschcode zum test des Bad Codes
	 * 
	 * @param eingabe
	 * @return
	 */
	public int countPicturesBadCode (String eingabe) {
		
		int anzahl = 0;
		
		String wort = "picture";
		
		for (int i = 0; i < eingabe.length() - wort.length() + 1; i++) {
										
				if(eingabe.substring(i, i + wort.length()).contains(wort)) {
					
					i = i + wort.length()-1; //Bad Code -> absichtlicher Fehler
					anzahl++;
									
			}
			
		}
		
		return anzahl;
		
	}


}

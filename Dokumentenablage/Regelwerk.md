# Rulebook für Schiffe versenken 
TM22 Software Engineering Team #2 

## Spielaufbau

-1 Spieler Modus 
	-2 Spieler Modus (Optional) 
-Spielfeld Rechteckig in Koodinaten unterteilt
	-Vertikal mit Zahlen
	-Horizontal mit Buchstaben  
	
	      A B C D E F G H I J 
	    * * * * * * * * * * * *
	1   *					   *	
	2   *				 	   *		
	3   *				 	   *
	4   *				  	   *
	5   *		 		  	   *
	6   *		  		   	   *
	7   *				   	   *
	8   *				  	   *
	9   *				   	   *
    10  *					   *
        * * * * * * * * * * * *

-Visualisierung

	min. über Konsole 
	GUI erwünscht
    
-Jedenfalls muss nach jedem Spielzug das gesammte Feld des Spielers (Eigene Schiffe inkl. treffer sed Gegners) und des Gegners (Versuchte Treffen und wirkliche Treffer) 

### Schiffe 
Bei jedem Spiel hat der Spieler folgende Schiffe zur Verfügung:

    - ein Schlachtschiff (5 Kästchen)
    - zwei Kreuzer (je 4 Kästchen)
    - drei Zerstörer (je 3 Kästchen)
    - vier U-Boote (je 2 Kästchen)
    
Optional kann die Funktion die Schiffe Zufällig auf dem Feld zu verteilen etabliert werden. 

## Spielablauf: 
1. Der Spieler wählt 1 oder 2 Spieler Modus. 
2. Vorbereitung:
    - Schiffe plazieren (manual or random)
    - Bei Manual werden die Kriterien für das plazieren angezeigt. 
    - Es müssen alle Schiffe verwendet werden. 
    - Die Schiffe dürfen sich nicht kreuzen oder überlappen. 
    - Schiffe dürfen nicht diagonal aufgestellt werden. 
    - Schiffe dürden keine Ausbuchtung besitzen. 
  
    - Es müssen alle Schiffe verwendet werden. 
    
 3. Spielzug
    - Bei einem Spielzug giebt der Spieler eine Koordinate (z.B. A7) an. 
    - Darauf hin erfolgt die Meldung "Treffen", wenn ein Schiff getroffen worden ist oder "Daneben" wenn kein Treffer erzielt worden ist. 
    - Falls das letzte Feld eines Schiffes getroffen wird erfolgt die Meldung "Treffer, Versenkt". 
    - Die Verwendeten Koordinatne werden auf einem Spielfeld angezeigt, inkl hervorhebung der Treffer und versenkten Schiffe. 
     

          A B C D E F G H I J 
	    * * * * * * * * * * * *
	1   *				#	   *	
	2   *				# 	   *		
	3   *				# 	   *
	4   *				#  	   *
	5   *		 		  	   *
	6   *		-  		   	   *
	7   *		X		   	   *
	8   *		X		  	   *
	9   *				   	   *
    10  *					   *
        * * * * * * * * * * * *

	Legende:
	- -kein Treffer 
	- X Treffer 
	- [#] Wenn Schiff versenkt ist
	
	- Nach jedem Spielzug wird der Spieler gewechselt. 
	- Eine Mehrfachnennung eines Feldes ist nicht möglich. 

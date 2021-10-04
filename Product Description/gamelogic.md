# Setup
1) Sprache einlesen
2) Schleife für 2 Spieler dh 2x mal
	a) Spieler erstellen
		- Name einlesen 

	b) Spielfeld generieren
		- ownFeld generieren
			- befühlen mit ~
		- zu Spieler zuordnen
		- gegnerischesFeld generieren 
			- befühlen mit ~
		- zu Spieler zuordnen 

	c) Fleet generieren
		- Größe der Flotte = int 
		- "Schiffe platziert" = 0 bis < Größe der Flotte

	d) Schleife Schiffe platziert for 0 bis < Größe Flotte 
		- Schiff generieren 
			- Größe des Schiffes einlesen 
			- Wahl der Startkoordinate
			- Wahl ob runter o nach rechts platzieren 
				- Shipfield generieren so oft wie 0 < Größe Schiff
				- entweder i o j der Koordinaten +1 (je nach Richtung des Schiffes 

		- Schiff überprüfen ob es in die Flotte passt
			- if yes:
				- Schiff zu Flotte hinzufügen
				- raise counter "Schiffe platziert" +1
			- else: 
				- delete schiff
				- counter bleibt gleich
				- go back to Schiff generieren

	e) ownSpielfeld ausgeben
	f) Ausgabe "Setup Player x is done"
3) Ausgabe "Setup of Game is complete"

# Move
1) Feststellen welcher Spieler dran ist
	a) opponent = targetPlayer
2) Einlesen Target Koordinaten
	a) Validierung ob valide Koordinaten
	b) Validierung ob auf die Koordinate scho geschoßen wurde
		- ob player.opponentField == ~ -> darf geschoßen werden
		- else -> zurück zu einlesen
3) auf Koordinate schießen
	a) Ergebnis checken
		- if getroffen
			- prüfen ob versenkt
			- Wert im OpponentField mit ergebnis (X o #) ersetzen
			- Ausgabe getroffen und oder versenkt
		- else 
			- Wert im OpponentField mit - ersetzen 
			- Ausgabe nicht getroffen 
4) Ausgabe opponentField 
5) Ausgabe "Device weitergeben" 		


# Closing
1) Statistik ausgeben 
2) abfrage weitere schritte
	- nochmal spielen
		- Deletion of Objekten außer Spieler an sich
	- statistik ausgeben 
	- Programm beenden
	- sprache ändern


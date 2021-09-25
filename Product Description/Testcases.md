# Testcases

| Number	  | Task | Precondition  | Kennzahl	  | Ergebnis	   | State  | Notes |  Bug-ID |

## [TC-32] Der User kann Schiffe zufällig vom Programm platzieren lassen
| Number	  | Task | Precondition  | Kennzahl	  | Ergebnis	   | State  | Notes |  Bug-ID |
| [TC-32.010] | Es muss Boolean welche den Platzierungsmodus (bool manShipPlacement) angibt auf TRUE sein
| [TC-32.020] | Es werden alle Schiffe plaziert 
| [TC-32.030] | Kein Schiff ragt über das Spielfeld 
| [TC-32.040] | Kein Schiff kreuzt ein anderes
| [TC-32.050] | Kein Schiff ist diagonal platziert 
| [TC-32.060] | Alle Schiffe (siehe TC-36) sind am Spielfeld verteilt. 
| [TC-32.070] | Die Verteilung ändert sich bei mehrmaligen automatischen Verteilen (min. 1 Schiff muss auf anderen Koordinaten positioniert sein)  
| [TC-32.080] | Die Verteilung erfolgt gemäß den Vorgaben (Regeln) 

## [TC-34] Dem User wird angezeigt wieviele gegnerische Schiffe er getroffen/versenkt hat
- [TC-34.010] Bei der Ausgabe des gegnerischen Feldes ist erkennbar, welche Schiffe der User getroffen & versenkt hat (siehe [TC-40]
- [TC-34.020] Zusätzlich zur Ausgabe des gegnerischen Feldes wird ein Counter mit Beschriftung "Getroffen: ", angezeigt welcher die Anzahl der getroffenen Schiffe als Zahl anzeigt 
- [TC-34.030] Zusätzlich zur Ausgabe des gegnerischen Feldes wird ein Counter mit Beschriftung "Versenkt: ", angezeigt welcher die Anzahl der versenkten Schiffe als Zahl anzeigt

## [TC-36] Dem User stehen verschieden Schiffe zum Spielen zu Verfügung
- [TC-36.010] Der User verfügt über 1 Flugzeugträger, welcher 5 Einheiten lang ist
- [TC-36.020] Der User verfügt über 2 Schlachtschiffe, welche 4 Einheiten lang sind
- [TC-36.030] Der User verfügt über 3 Zerstörer, welche 3 Einheiten lang sind
- [TC-36.040] Der User verfügt über 4 U-Boote, welche 2 Einheiten lang sind
- [TC-36.050] Die Felder der Schiffe haben zwei Zustände (Getroffen, nicht getroffen)
- [TC-36.060] Das Schiff wird darauf überprüft , ob es gesunken ist (alle Felder getroffen).
- [TC-36.070] Das Schiff hat zwei Zustände (floating, sunken)

## [TC-39] Der User sieht bei der Ausgabe des Spielfeldes die Achsenbeschriftung
- [TC-36.010] Es muss über eine Variable die Größe des Spielfeldes bekannt sein 
- [TC-36.020] Die horizontale Beschriftung ist alphabetisch fortlaufend, beginnt bei der ersten Spalte mit A und wird pro Spalte um einen Buchstaben im Alphabet hochgezählt.
- [TC-36.030] Die vertikale Beschriftung ist numerisch fortlaufend, beginnt in der ersten Zeile mit 1 und wird pro Zeile um 1 erhöht. 

## [TC-40] Dem User wird das Spielfeld und dessen aktueller Inhalt auf der Konsole ausgegeben
- [TC-40.010] Der User erhält sein Spielfeld und das gegnerische Feld in der gewählten Größe in der Konsole untereinander ausgegeben.
- [TC-40.020] Auf dem gegnerischen Feld werden getroffene Schiffe mit einem X angezeigt. 
- [TC-40.030] Auf dem gegnerischen Feld werden versenkte Schiffe mit einem # angezeigt.
- [TC-40.040] Auf dem gegnerischen Feld werden nicht getroffene Schüsse (Felder auf die bereits geschossen wurde, aber kein Schiff steht) mit - gekennzeichnet.
- [TC-40.050] Auf dem gegnerischen Feld werden noch nicht beschossene Felder mit ~ gekennzeichnet. 
- [TC-40.060] Auf dem eigenen Feld werden getroffene Schiffe mit einem X angezeigt. 
- [TC-40.070] Auf dem eigenen Feld werden versenkte Schiffe mit einem # angezeigt.
- [TC-40.080] Auf dem eigenen Feld werden Schüsse des Gegners, die nicht getroffenen mit - gekennzeichnet.
- [TC-40.090] Auf dem eigenen Feld werden leere Felder (ohne Schuss und ohne Schiff) mit ~ gekennzeichnet.
- [TC-40.100] Auf dem eigenen Feld werden vom Gegner nicht getroffene Schiffe mit 0 gekennzeichnet.

## [TC-42] Der User bekommt ein Standard-Spielfeld mit 10x10 im Default-Spielmodus
- [TC-42.010] Beim Starten des Default-Spielmodus wird als Größe des Spielfeldes 10 definiert.

## [TC-44] Der User versenkt das letzte gegnerische Schiff und beendet damit das Spiel
- [TC-44.010] Bei jedem Versenken eines gegnerischen Schiffes wird überprüft, ob es noch aktive ("schwimmende") Schiffe des Gegners gibt.
- [TC-44.020] Wenn es noch aktive Schiffe gibt, wird das Spiel fortgesetzt
- [TC-44.030] Gibt es keine aktive Schiffe mehr, erfolgt kein weiterer Spielzug.
- [TC-44.040] Der User wird über den Ausgang des Spieles textuell informiert (siege [TC-45.010]

## [TC-45] Der User erhält die Information, dass das Spiel beendet ist
- [TC-45.010] Es wird der gewählten Sprache sinngemäß die Meldung "Das Spiel ist nun beendet. XYZ hat gewonnen." ausgegeben.

## [TC-47] Der User erhält nach Beendigung des Spiels die Möglichkeit erneut zu Spielen
- [TC-47.010] Nach Spielbeendigungsmeldung (siehe US-45 // TC-45.030) erhält der User eine Taste/Eingabemöglichkeit "Erneut spielen" 
- [TC-47.020] Bei Wahl dieser Möglichkeit wird der User zum Startscreen weitergeleitet. 

## [TC-48] Der User erhält nach Beendigung des Spiels die Möglichkeit das Programm zu beenden 
- [TC-48.010] Nach Spielbeendigungsmeldung (siehe US-45 // TC-45.030) erhält der User eine Taste/Eingabemöglichkeit "Programm beenden"
- [TC-48.010] Bei Wahl dieser Möglichkeit wird das Programm beendet & geschlossen.

## [TC-49] Der User erhält Rückmeldung über das Ergebnis seines Schusses
- [TC-49.010] Es wird überprüft, ob der Schuss ein gegnerisches Schiff getroffen hat
- [TC-49.020] Wenn der User kein Schiff getroffen hat erfolgt die Meldung "Kein Treffer"
- [TC-49.030] Wenn ein Schiff getroffen wurde erfolgt die Meldung "Treffer!!"

## [TC-50] Der User erhält Rückmeldung ob er mit dem Schuss ein Schiff versenkt hat
- [TC-50.010] Es wird nach einem erfolgreichen Schuss (Schuss hat ein Schiff getroffen) überprüft, ob ein Schiff noch intakte Felder besitzt
- [TC-50.020] Wenn ein Schiff keine intakten Felder besitzt erfolgt die Meldung "Versenkt!!"

## [TC-51] Der User erhält Rückmeldung ob seine Eingaben über den Schuss valide sind
- [TC-51.010] Die Eingabe der Koordinaten wird eingelesen
- [TC-51.020] Die Koordinaten müssen sich am Spielfeld befinden, dh innerhalb der Spielgröße liegen.
- [TC-51.030] Die Koordinate darf in einem früheren Zug noch nicht beschossen worden sein.
- [TC-51.040] Bei einer falschen Eingabe erfolgt eine Fehlermeldung "Dieser Schuss war nicht gültig" & der User darf erneut schießen.
- [TC-51.050] Bei einer richtigen Eingabe erfolgt die Meldung "Schuss erfolgreich abgegeben."

## [TC-60] Dem User wird angezeigt welches Zeichen am Feld was bedeutet
- [TC-60.010] Dem User wird der Text "X ==> Schiff getroffen" angezeigt
- [TC-60.020] Dem User wird der Text "# ==> Schiff versenkt" angezeigt
- [TC-60.030] Dem User wird der Text "- ==> Schuss ins Wasser" angezeigt
- [TC-60.040] Dem User wird der Text "0 ==> Eigenes, ungetroffenes Schiff" angezeigt
- [TC-60.050] Dem User wird der Text "~ ==> Leeres Feld (eigenes Spielfeld)" angezeigt
- [TC-60.060] Dem User wird der Text "~ ==> Feld noch unbekannt (gegnerisches Spielfeld)" angezeigt

# Testcases

| Number	  | Task | Precondition  | Eingabedaten	  | Ergebnis	   | State  | Notes |  Bug-ID |

## [TC-32] Der User kann Schiffe zufällig vom Programm platzieren lassen
| Number	  | Task | Precondition  | Eingabedaten	  | Ergebnis	   | State  | Notes |  Bug-ID |
x| [TC-32.010] | Es muss Boolean welche den Platzierungsmodus (bool manShipPlacement) angibt auf TRUE sein
| TC-32.010   | 1 Suche die Funktion bool manShipPlacement 2 Funktion bool manShipPlacment aufrufen | Funktion bool manShipPlacement ist implementiert | Keine | 1 Funktion manShipPlacement im Programm-Code gefunden 2 Funktion manShipPlacement konnte aufgerufen werden und gibt den Wet TRUE aus | |  |  |
x| [TC-32.020] | Es werden alle Schiffe plaziert 
| TC-32.0.20  | 1 Funktion setFleet aufrufen  2 Koordinaten der gesetzten Schiffe auslesen | Funktion setFleet() ist implementiert und funktionsfähig | 1K 2K  | 1E Funktion setFleet konnte aufgerufen werden 2E Die Koordinaten der gesetzten Schiffe wurden ausgelesen |
x| [TC-32.030] | Kein Schiff ragt über das Spielfeld
| TC-32.0.20  | 1 Funktion setFleet aufrufen  2 Koordinaten der gesetzten Schiffe auslesen 3 Koordinaten der gesetzten Schiffe mit den max. Koordinaten des Spielfelds vergleichen | Funktion setFleet(), createField(size) sind implementiert und funktionsfähig | 1K 2K  | 1E Funktion setFleet konnte aufgerufen werden 2E Die Koordinaten der gesetzten Schiffe wurden ausgelesen 3 Die Koordinaten der gesetzten Schiffe liegen nicht ausserhalb des vorgegebenen Spielfelds | | | |
X| [TC-32.040] | Kein Schiff kreuzt ein anderes
| TC-32.040 | 1 Funktion printfleet aufrufen 2Arrays aus printfleet vergleichen, ob Werte doppelt vorhanden sind | 1P Funktion printFleet ist implementiert und funktionsfähig | 1E Funktion printFleet liefert Daten 2E keine Doppelten Werte vorhanden | | | |
X| [TC-32.050] | Kein Schiff ist diagonal platziert 
| TC-32.050 | 1 Funktion testNotDiagonalShip aufrufen 2 Ergebnis aus Funktion testNotDiagonalShip ablesen | PC: Funktion testNotDiagonalShip ist implementiert und funktionsfähig | 1E Funktion testNotDiagonalShip  wurde ausgeführt 2E Die Funktion testNotDiagonalShip gibt TRUE aus | | | |     
X| [TC-32.060] | Alle Schiffe (siehe TC-36) sind am Spielfeld verteilt. 
| TC-32.060 | 1  [welches Schiffe in der Flotte , Field AUsgabe , Prüfen ob Schiffe auch am SPielfeld vorhanden ]
| [TC-32.070] | Die Verteilung ändert sich bei mehrmaligen automatischen Verteilen (min. 1 Schiff muss auf anderen Koordinaten positioniert sein)  
| [TC-32.080] | Die Verteilung erfolgt gemäß den Vorgaben (Regeln) 

## [TC-34] Dem User wird angezeigt wieviele gegnerische Schiffe er getroffen/versenkt hat
- [TC-34.010] Bei der Ausgabe des gegnerischen Feldes ist erkennbar, welche Schiffe der User getroffen & versenkt hat (siehe [TC-40]
- [TC-34.020] Zusätzlich zur Ausgabe des gegnerischen Feldes wird ein Counter mit Beschriftung "Getroffen: ", angezeigt welcher die Anzahl der getroffenen Schiffe als Zahl anzeigt 
- [TC-34.030] Zusätzlich zur Ausgabe des gegnerischen Feldes wird ein Counter mit Beschriftung "Versenkt: ", angezeigt welcher die Anzahl der versenkten Schiffe als Zahl anzeigt

## [TC-36] Dem User stehen verschieden Schiffe zum Spielen zu Verfügung
| TC-36       | PC: Funktion printTestFleetComplete() wird benötigt | 1Task Funktion printTestFleetComplete() aufrufen | keine Eingabedaten | Ergebnis Flotte wird zurückgegeben | State : - | Note : - | BugID: - |
- [TC-36.010] Der User verfügt über 1 Flugzeugträger, welcher 5 Einheiten lang ist
- [TC-36.020] Der User verfügt über 2 Schlachtschiffe, welche 4 Einheiten lang sind
- [TC-36.030] Der User verfügt über 3 Zerstörer, welche 3 Einheiten lang sind
- [TC-36.040] Der User verfügt über 4 U-Boote, welche 2 Einheiten lang sind
- [TC-36.050] Die Felder der Schiffe haben zwei Zustände (Getroffen, nicht getroffen)

- 
- [TC-36.060] Das Schiff wird darauf überprüft , ob es gesunken ist (alle Felder getroffen).
| TC-36.060   | PC: Funktion printCheckIfSunk() ist implementiert und funktionsfähig | Funktion printCheckIfSunk() aufrufen | Eingabedaten: keine  | Ergebnis : printCheckIfSunk() gibt Ergebnisse zurück | State : - | Note : - | BugID: - | 
- [TC-36.070] Das Schiff hat zwei Zustände (floating, sunken)
| TC-36.070   | PC: Funktion printCheckIfSunk() ist implementiert und funktionsfähig | Funktion printCheckIfSunk() aufrufen | Eingabedaten: keine  | Ergebnis : printCheckIfSunk() gibt Ergebnisse zurück | State : - | Note : - | BugID: - |

## [TC-39] Der User sieht bei der Ausgabe des Spielfeldes die Achsenbeschriftung
X- [TC-39.010] Es muss über eine Variable die Größe des Spielfeldes bekannt sein
| TC-39.010   | PC: Field.size muss gesetzt sein | Task: mit Funktion printSizeOfField(Field) die Field.size ausgeben lassen | Eingabedaten : Field | Ergebnis : die Funktion printSizeOfField(Field) gibt die Feldgröße von Field aus | State : - | Note : - | BugID: - |
X- [TC-39.020] Die horizontale Beschriftung ist alphabetisch fortlaufend, beginnt bei der ersten Spalte mit A und wird pro Spalte um einen Buchstaben im Alphabet hochgezählt.
| TC-39.020   | PC: Funktion printTestField() muss vorhanden und funktionsfähig sein | Task: mit Funktion printTestField() das Field ausgeben lassen | Eingabedaten : - | Ergebnis : die Funktion printTestField() gibt das Feld mit den Achsenbeschriftungen aus | State : - | Note : - | BugID: - | 
X- [TC-39.030] Die vertikale Beschriftung ist numerisch fortlaufend, beginnt in der ersten Zeile mit 1 und wird pro Zeile um 1 erhöht.
| TC-39.030   | PC: Funktion printTestField() muss vorhanden und funktionsfähig sein | Task: mit Funktion printTestField() das Field ausgeben lassen | Eingabedaten : - | Ergebnis : die Funktion printTestField() gibt das Feld mit den Achsenbeschriftungen aus | State : - | Note : - | BugID: - |

## [TC-40] Dem User wird das Spielfeld und dessen aktueller Inhalt auf der Konsole ausgegeben
- [TC-40.010] Der User erhält sein Spielfeld und das gegnerische Feld in der gewählten Größe in der Konsole untereinander ausgegeben.
| TC-40.010   | PC: Funktion printOwnField() und printOpponentField() müssen vorhanden und funktionsfähig sein | Task: Funktion printOwnField() und printOpponentField() aufrufen | Eingabedaten : - | Ergebnis :  Funktion printOwnField() und printOpponentField() geben die Felder aus | State : - | Note : - | BugID: - |
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
| TC-44.020   | PC: Funktion existActiveShips() ist vorhanden und funktionsfähig | Task: Funktion existActiveShips() aufrufen | Eingabedaten: keine | Ergebnis : Funktion existActiveShips() gibt True zurück | State : - | Note : - | BugID: - |
- [TC-44.030] Gibt es keine aktive Schiffe mehr, erfolgt kein weiterer Spielzug.
| TC-44.030   | PC: Funktion existActiveShips() ist vorhanden und funktionsfähig | Task: Funktion existActiveShips() aufrufen | Eingabedaten: keine | Ergebnis : Funktion existActiveShips() gibt True zurück | State : - | Note : - | BugID: - |
- [TC-44.040] Der User wird über den Ausgang des Spieles textuell informiert (siehe [TC-45.010]


## [TC-45] Der User erhält die Information, dass das Spiel beendet ist
- [TC-45.010] Es wird der gewählten Sprache sinngemäß die Meldung "Das Spiel ist nun beendet. XYZ hat gewonnen." ausgegeben.
| TC-45.010   | PC: Funktion existActiveShips() ist vorhanden und funktionsfähig | Task: Funktion existActiveShips() aufrufen | Eingabedaten: keine | Ergebnis : Funktion existActiveShips() gibt FALSE zurück --> Es wird die Meldung "Das Spiel ist nun beendet. XYZ hat gewonnen." in der Konsole ausgegeben | State : - | Note : - | BugID: - |

## [TC-47] Der User erhält nach Beendigung des Spiels die Möglichkeit erneut zu Spielen
- [TC-47.010] Nach Spielbeendigungsmeldung (siehe US-45 // TC-45.010) erhält der User eine Taste/Eingabemöglichkeit "Erneut spielen"
| Number	  | Precondition | Task  | Eingabedaten	  | Ergebnis	   | State  | Notes |  Bug-ID |
| TC-47.010   | PC:  Funktion für [weiterspielen] oder [beenden] oder [highscore] ist implementiert und funktionsfähig | Task : Funktion aufrufen | Eingabedaten : ?! | Ergebnis : je nach Eingabe die Möglichkeit erhalten | State  | Notes |  Bug-ID |  
- [TC-47.020] Bei Wahl dieser Möglichkeit wird der User zum Startscreen weitergeleitet. 


## [TC-48] Der User erhält nach Beendigung des Spiels die Möglichkeit das Programm zu beenden 
- [TC-48.010] Nach Spielbeendigungsmeldung (siehe US-45 // TC-45.010) erhält der User eine Taste/Eingabemöglichkeit "Programm beenden"
| Number	  | Precondition | Task  | Eingabedaten	  | Ergebnis	   | State  | Notes |  Bug-ID |
| TC-48.010   | PC:  Funktion für [weiterspielen] oder [beenden] oder [highscore] ist implementiert und funktionsfähig | Task : Funktion aufrufen | Eingabedaten : ?! | Ergebnis : je nach Eingabe die Möglichkeit erhalten | State  | Notes |  Bug-ID |
- [TC-48.010] Bei Wahl dieser Möglichkeit wird das Programm beendet & geschlossen.

## [TC-49] Der User erhält Rückmeldung über das Ergebnis seines Schusses
- [TC-49.010] Es wird überprüft, ob der Schuss ein gegnerisches Schiff getroffen hat
| Number	  | Precondition | Task  | Eingabedaten	  | Ergebnis	   | State  | Notes |  Bug-ID |
| TC-49.010   | PC: Funktion checkIfShotHit() ist implementiert und funktionsfähig | Task : Funktion checkIfShotHit() aufrufen | Eingabedaten : ?! | Ergebnis : gibt zurück ob das Schiff durch den Schuss gehitet wurde | State  | Notes |  Bug-ID |
- [TC-49.020] Wenn der User kein Schiff getroffen hat erfolgt die Meldung "Kein Treffer"
| TC-49.020   | PC: Funktion checkIfShotHit() ist implementiert und funktionsfähig | Task : Funktion checkIfShotHit() aufrufen | Eingabedaten : ?! | Ergebnis : wenn die Funktion FALSE ergibt, die Meldung "Kein Treffer" ausgeben | State  | Notes |  Bug-ID |
- [TC-49.030] Wenn ein Schiff getroffen wurde erfolgt die Meldung "Treffer!!"
| TC-49.030   | PC: Funktion checkIfShotHit() ist implementiert und funktionsfähig | Task : Funktion checkIfShotHit() aufrufen | Eingabedaten : ?! | Ergebnis : wenn die Funktion TRUE ergibt, die Meldung "Treffer!!" ausgeben | State  | Notes |  Bug-ID |

## [TC-50] Der User erhält Rückmeldung ob er mit dem Schuss ein Schiff versenkt hat
- [TC-50.010] Es wird nach einem erfolgreichen Schuss (Schuss hat ein Schiff getroffen) überprüft, ob ein Schiff noch intakte Felder besitzt
| Number	  | Precondition | Task  | Eingabedaten	  | Ergebnis	   | State  | Notes |  Bug-ID |
| TC-50.010   | PC: Funktion checkIfShotHit()=TRUE | Task : Funktion checkWhichShipWasShot(Shot<der getroffen hat>)  | Eingabedaten : ?! | Ergebnis : Ship als Ergebnis ,   | State  | Notes |  Bug-ID |
| TC-50.011   | PC: Funktion checkWhichShipWasShot(Shot<der getroffen hat>)=<SHIP> | Task: checkIfSunk(Ship) aufrufen | Eingabedaten : <Ship> | Ergebnis : TRUE oder FALSE 
- [TC-50.020] Wenn ein Schiff keine intakten Felder besitzt erfolgt die Meldung "Versenkt!!"
| TC-50.020   | PC: Funktion checkIfSunk()=TRUE | Task: checkIfSunk(Ship) aufrufen | Eingabedaten : ?! | Ergebnis : wenn <TRUE> , die Meldung "Versenkt!!" ausgeben | State  | Notes |  Bug-ID |


## [TC-51] Der User erhält Rückmeldung ob seine Eingaben über den Schuss valide sind
- [TC-51.010] Die Eingabe der Koordinaten wird eingelesen
| Number	  | Precondition | Task  | Eingabedaten	  | Ergebnis	   | State  | Notes |  Bug-ID |
| TC-51.010   | PC: Funktion shootsAt(Coodinate, Player) ist implementiert und funktionsfähig | Task: Funktion shootsAt(Coodinate, Player) mit den Eingabedaten | Eingabedaten : ?! | Ergebnis :  | State  | Notes |  Bug-ID |
- [TC-51.020] Die Koordinaten müssen sich am Spielfeld befinden, dh innerhalb der Spielgröße liegen.
| Number	  | Precondition | Task  | Eingabedaten	  | Ergebnis	   | State  | Notes |  Bug-ID |
| TC-51.020   | PC: Funktion  | Task:  | Eingabedaten : ?! | Ergebnis :  | State  | Notes |  Bug-ID |
- [TC-51.030] Die Koordinate darf in einem früheren Zug noch nicht beschossen worden sein.
 | Number	  | Precondition | Task  | Eingabedaten	  | Ergebnis	   | State  | Notes |  Bug-ID |
| TC-51.030   | PC: Funktion  | Task:  | Eingabedaten : ?! | Ergebnis :  | State  | Notes |  Bug-ID |
- [TC-51.040] Bei einer falschen Eingabe erfolgt eine Fehlermeldung "Dieser Schuss war nicht gültig" & der User darf erneut schießen.
| Number	  | Precondition | Task  | Eingabedaten	  | Ergebnis	   | State  | Notes |  Bug-ID |
| TC-51.040   | PC: Funktion  | Task:  | Eingabedaten : ?! | Ergebnis :  | State  | Notes |  Bug-ID |
- [TC-51.050] Bei einer richtigen Eingabe erfolgt die Meldung "Schuss erfolgreich abgegeben."
| Number	  | Precondition | Task  | Eingabedaten	  | Ergebnis	   | State  | Notes |  Bug-ID |
| TC-51.050   | PC: Funktion  | Task:  | Eingabedaten : ?! | Ergebnis :  | State  | Notes |  Bug-ID |

## [TC-60] Dem User wird angezeigt welches Zeichen am Feld was bedeutet
- [TC-60.010] Dem User wird der Text "X ==> Schiff getroffen" angezeigt
- | TC-60.010 | PC: Funktion checkIfHit() ist implementiert und funktionsfähig | Task: Funktion checkIfHit() aufrufen und auf TRUE setzen | Eingabedaten : TRUE | Ergebnis : Die Funktion checkIfHit() wurde ausgeführt und die Meldung "X ==> Schiff getroffen" wird ausgegeben | State : - | Note : - | BugID: - |
- 
- [TC-60.020] Dem User wird der Text "# ==> Schiff versenkt" angezeigt
- | TC-60.020 | PC: Funktion checkIfSunk() ist implementiert und funktionsfähig | Task: Funktion checkIfSunk() aufrufen und auf TRUE setzen | Eingabedaten : TRUE | Ergebnis : Die Funktion checkIfHit() wurde ausgeführt und die Meldung "# ==> Schiff versenkt" wird ausgegeben | State : - | Note : - | BugID: - |
- 
- [TC-60.030] Dem User wird der Text "- ==> Schuss ins Wasser" angezeigt
- | TC-60.030 | PC: Funktion checkIfHit() ist implementiert und funktionsfähig | Task: Funktion checkIfHit() aufrufen und auf FALSE setzen | Eingabedaten : FALSE | Ergebnis : Die Funktion checkIfHit() wurde ausgeführt und die Meldung "- ==> Schuss ins Wasser" wird ausgegeben | State : - | Note : - | BugID: - |
- 
- [TC-60.040] Dem User wird der Text "0 ==> Eigenes, ungetroffenes Schiff" angezeigt
- | TC-60.040 | PC:  | Task:  | Eingabedaten : - | Ergebnis :  | State : - | Note : - | BugID: - |
- 
- [TC-60.050] Dem User wird der Text "~ ==> Leeres Feld (eigenes Spielfeld)" angezeigt
- | TC-60.050 | PC:  | Task:  | Eingabedaten : - | Ergebnis :  | State : - | Note : - | BugID: - |
- 
- [TC-60.060] Dem User wird der Text "~ ==> Feld noch unbekannt (gegnerisches Spielfeld)" angezeigt
- | TC-60.060 | PC:  | Task:  | Eingabedaten : - | Ergebnis :  | State : - | Note : - | BugID: - |

#language: de

@basic @worldgenerator
Funktionalität: Kartengenerierung
Als Administrator
Möchte ich einfache Karten erschaffen
Um die Spielwelt zu generieren

Szenario: Steppe
Angenommen die Welt ist auf 30 x 30 Felder begrenzt
Wenn ich eine "Grasland" generiere
Dann hat die Karte 900 Felder "Grasland"

Szenario: Wald
Angenommen die Welt ist auf 5 x 10 Felder begrenzt
Wenn ich eine "Wald" generiere
Dann hat die Karte 50 Felder "Wald"
Und 0 Felder "Grasland"

Szenario: Steppe mit Wald
Angenommen die Welt ist auf 30 x 30 Felder begrenzt
Wenn ich eine "Grasland" generiere
Und ich auf 15/15 einen kleinen See generiere
Dann hat die Karte 891 Felder "Grasland"
Und 1 Feld "See"
Und 8 Felder "Wald"
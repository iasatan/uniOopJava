Írja meg a 4 alapműveletet megvalósító Kalkulátor programot Java nyelven. 
Az elvégzendő műveletet és az operandusokat a felhasználó adja meg. 
A program a megadott művelettől függően végzi el a számítási feladatot. 
A művelet vizsgálatához használja a switch utasítást.
Az osztás művelet végrehajtásakor ügyeljen az operandusok típusára, és ne engedje a 0-val való osztást.
A felhasználói input megadását próbálja meg kétféleképpen:
- Külön olvassa be a két operandust (számok) és külön az operátort (char).
  Használja a Scanner osztály nextXXX metódusait.
- Egyetlen sztringként olvassa be az inputot space-el elválasztva a tagokat (pl.: 3 + 5). A beolvasott sztringet a space-ek mentén szét kell bontani tagokra a split metódussal, melynek
paramétere egy sztring (a tagoló karaktersorozat). Az eredmény egy sztring tömb, melynek egyes elemeit a megfelelő típusra konvertálva kapjuk meg az operandusokat (a csomagoló
osztályok parseXXX metódusait használva) és az operátort.

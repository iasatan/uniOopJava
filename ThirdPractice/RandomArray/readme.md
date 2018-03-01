Deklaráljon, majd foglaljon helyet egy 10 elemű int tömb számára.
- Töltse fel 1 és 50 közötti véletlenszámokkal a tömböt.
- Használja a java.util.Random osztályt! 
  Első lépés egy ilyen típusú objektum létrehozása a véletlenszám generátor inicializálásához:
  java.util.Random rand = new java.util.Random();
  Második lépés az osztály nextXXX metódusának hívása.
  Ezek a metódusok 0 és az argumentumként megadott szám által határolt, felülről nyitott intervallumból állítják elő a megfelelő típusú véletlenszámot.
  int random = rand.nextInt(50)+1;
- Használja a java.lang.Math osztály random() metódusát! 
  Ez a metódus a [0,1) felülről nyitott intervallumból egy lebegőpontos véletlenszámot ad vissza.
  A számtartományt a C-ből ismert (felsőhatár-alsóhatár+1)+alsóhatár képlettel adhatjuk meg.
  int random = (int )(Math.random() * 50) + 1;
- Írja ki a tömbelemeket fordított sorrendben. Figyelem! Itt nem tudja használni a foreach ciklust.
- Keresse meg a tömbben a legnagyobb páros számot. Figyelje meg mi a különbség, ha a for
ciklust, illetve ha a foreach ciklust használja!


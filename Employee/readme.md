# Objektum orientált programozás
## 4. gyakorlat, Osztálydefiníció, objektum létrehozás

1. Készítsen el egy Alkalmazott osztályt és egy Alkalmazott osztályt használó osztályt.

a) Az Alkalmazott osztályban
- van név és fizetés adattag (félnyilvánosak);
- van egy metódusa, amely egy paraméterként kapott értékkel megnöveli a fizetést;
- van egy metódusa, amely egy String-be összefűzi a nevet és a fizetést és ezt adja vissza.

Az Alkalmazott osztályt használó osztályban egy main metódus van, amelyben létrehozunk egy Alkalmazott objektumot: értéket adunk a tagjainak, kiírjuk az adatait, megemeljük a fizetését és újra kiírjuk az adatait.

b) Írjuk át az adattagokat private-ra és készítsünk setter metódusokat az adatok beállításához, és getter metódusokat az adatok lekérdezéséhez (adatrejtés). Írjuk át ennek megfelelően az Alkalmazott osztályt használó osztályt.

c) Egészítsük ki az Alkalmazott osztályt a következő metódusokkal
- adjon vissza igazat, ha a fizetés a paraméterként megadott határok közé esik, és hamisat ha nem;
- adja vissza a fizetendő adó értéket, ha az adókulcs 16% ;
- adjon vissza igazat, ha a fizetés nagyobb, mint egy paraméterként megadott másik alkalmazotté. Egészítsük ki az Alkalmazott osztályt használó osztályt úgy, hogy minden funkciót ki tudjunk próbálni.

d) Az Alkalmazott osztályt használó osztályban deklaráljunk és töltsünk fel adatokkal egy Alkalmazottakból álló tömböt.
- Állapítsuk meg, hogy kinek a legmagasabb a fizetése.
- Számoljuk meg, hogy hány alkalmazott fizetése esik egy megadott intervallumba.
- Számítsuk ki az alkalmazottak átlagfizetését.
- Számítsuk ki az alkalmazottak által befizetett adó összértékét.

#

# 6. gyakorlat
## Osztálydefiníció, statikus tagok, final tagok, függvénytúlterhelés, this, csomagok
1. Készítsen egy Alkalmazott osztályt név, kor és fizetés adatokkal.
- Legyen egy osztályszintű adattagja a nyugdíjkorhatár tárolására, értéke kezdetben legyen 65.
- Legyen 2 konstruktora. Az egyik a paraméterként kapott név, kor és fizetés értékekkel inicializálja az adattagokat. A másiknak csak a nevet és a kort kell megadni, a fizetés 10000*kor.
- Legyen metódusa, amely visszadja hány éve van még nyugdíjig.
+ Legyen metódusa, amely String-be összefűzve adja vissza az Alkalmazott adatait, hozzáfűzve a nyugdíjig hátrelevő éveinek számát is.
- Legyen metódusa, amely a paraméterként kapott értékre állítja be a nyugdíjkorhatárt.
- Legyen metódusa, amely a paraméterként kapott két Alkalmazott közül azt adja vissza, amelyiknek több éve van még hátra a nyugdíjig.

Készítsen egy futtatható osztályt, amely beolvas n számú alkalmazottat egy tömbbe.
- Írja ki az alkalmazottak adatait, majd módosítsa a nyugdíjkorhatárt és újra írja ki az alkalmazottak adatait.
- Írja ki azon alkalmazottak adatait, akiknek 5 évnél kevesebb van még hátra nyugdíjig.
- Írja ki azoknak az alkalmazottaknak az adatait, akiknek az átlagnál több éve van még hátra nyugdíjig.
- Rendezze az alkalmazottak tömbjét a nyugdíjig hátralévő évek alapján növekvő, majd pedig csökkentő sorrendbe.

Módosítsa az Alkalmazott osztály definícióját úgy, hogy ne az alkalmazott korát, hanem a születési dátumát tároljuk. Java 8-ban:<br>
import java.time.LocalDate;<br>
LocalDate birthday = LocalDate.of(1998,5,10); //year, month, day<br>
LocalDate currentDate = java.time.LocalDate.now();<br>
int currentYear = currentDate.getYear();<br>
A korát az aktuális év és a születési év különbségeként számítjuk. Módosítsa a metódusait és a futtatható osztályt ennek megfelelően.<br>
Készítsen egy metódust, amely String-be összefűzve kiírja az Alkalmazott nevét, korát és a születésnapját <br>
(Kiss Tamás, 34 : március 12.).<br>
String month = birthday.getMonth().name();<br>
int monthvalue = birthday.getMonthValue();<br>
int day = birthday.getDayOfMonth();<br>
A getMonth().name() metódus a hónap angol nevét adja vissza.<br>
Írjon konverziós metódust, amely a hónap sorszámának ismeretében visszaadja a magyar hónapnevet. A magyar hónapneveket 13 elemű String tömbben tároljuk, ahol a 0. indexű elemet nem használjuk.

Házi feladat:

a) Készítsen egy Személy osztályt az alábbi adatokkal: név, súly (egész, kilogramban megadva), magasság (valós, méterben megadva). Legyen egy metódusa, amely visszaadja a testtömeg indexet (tti=tomeg/(m*m)). Legyen egy metódusa, amely visszaad egy alkatot jellemző szöveget:<br/>
"sovány": tti<18,5<br/>
"kövér": tti>25<br/>
"normál": egyébként<br/>
Legyen egy metódusa, amely egy String-be összefűzi az adatokat és visszaadja azokat az alábbi alakban: név, súly, magasság, tti: alkat.
Készítsen egy futtatható osztályt, amelyben beolvassa egy személy adatait (név, súly, magasság) és kiírja azokat összefűzve a kiszámított testtömegindexel és alkattal.

b) Írjunk setter metódusokat az adatok beállításához, és getter metódusokat az adatok lekérdezéséhez (adatrejtés → ellenőrzött adathozzáférés).

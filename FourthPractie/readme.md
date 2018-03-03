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

2. Készítsen Könyv osztályt és egy Könyv osztályt használó osztályt.
a) A Könyv osztály adattagjai: cím, szerző, megjelenés éve, ára. Legyen egy metódusa, amely a paraméterként kapott százalékos értékkel növeli a könyv árát. Legyen egy metódusa, ami egy String-be összefűzi az adatokat és ezt adja vissza.
b) Írjunk setter metódusokat az adatok beállításához, és getter metódusokat az adatok lekérdezéséhez (adatrejtés → ellenőrzött adathozzáférés).

Házi feladat:

a) Készítsen egy Személy osztályt az alábbi adatokkal: név, súly (egész, kilogramban megadva), magasság (valós, méterben megadva). Legyen egy metódusa, amely visszaadja a testtömeg indexet (tti=tomeg/(m*m)). Legyen egy metódusa, amely visszaad egy alkatot jellemző szöveget: "sovány": tti<18,5
"kövér": tti>25
"normál": egyébként
Legyen egy metódusa, amely egy String-be összefűzi az adatokat és visszaadja azokat az alábbi alakban: név, súly, magasság, tti: alkat.
Készítsen egy futtatható osztályt, amelyben beolvassa egy személy adatait (név, súly, magasság) és kiírja azokat összefűzve a kiszámított testtömegindexel és alkattal.
b) Írjunk setter metódusokat az adatok beállításához, és getter metódusokat az adatok lekérdezéséhez (adatrejtés → ellenőrzött adathozzáférés).

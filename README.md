# Úkol (8. lekce) OOP
_Zadání_

Vytvořte projekt, kde si procvičíte jak objektový návrh, tak konstrukty v Javě.

Struktura
Máte následující struktury:

1. Školní třída (Jméno, Ročník, 1x Třídní Učitel, List Studentů)
2. Učitel (Jméno, Přijmení)
3. Student (Jméno, Přijmení, Rok narozené, Studentské číslo)

A vytvořte servisní třídy které provedou následující operace. Zkuste je ale navrhnout za použití konceptů OOP z osmé lekce. Např. použijte Interface, dědičnost, překrývaní metod, ...

1. Vypíše školní třídu v následujícím formátu:
```####################################
Třída: 4.C (ročník: 4)
Třídní učitel: Novák, Jan
Počet studentů: 3

####################################
# 1 # ID001 - Petr Svoboda (2011)
# 2 # ID123 - Milan Říha (2010)
# 3 # ID345 - Jindřich Nový (2012)
```

2. Vypíše školní třídu v následujícím formátu:
```4.C, Jan Novák
ID001, Petr Svoboda
ID123, Milan Říha
ID345, Jindřich Nový
```
3. Navhněte vlastní formát a zapište data do souboru
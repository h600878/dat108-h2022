DAT108 - F23 - 7. november 2022
-------------------------------

Hensikten med dette eksemplet er å vise at valgene vi tar i utformingen
av koden har betydning for testbarheten.

---

/bmi1 = BmiController1.java + bmi1.jsp

Her gjør vi "nesten alt" i BmiController1, dvs. både inputvalidering, 
feilmeldinger, beregning av BMI og avrunding til en desimal. 
Beregning av vektklasser gjøres direkte i JSP-en. FY!

Det er klin umulig å teste om noen av disse tingene er korrekte!

---

/bmi2 = BmiController2.java + bmi2.jsp

Første forsiktige forbedring er å fjerne beregninger fra JSP-en.
Men fremdeles:

Det er klin umulig å teste om noen av disse tingene er korrekte!

---

/bmi3 = BmiController3.java + bmi3.jsp

Vi lager hjelpemetoder for alle beregninger i Controlleren.

Nå kan vi teste om hjelpemetodene er korrekte! JIPPI!

Løsningen testes i BmiController3TestV1.java

Selve testklassen bør også fikses litt på, f.eks. flytting av
felles init-kode til en @BeforeAll-metode og bruk av konstanter for
gjentagende String-litteraler (test-data).

Da har vi BmiController3TestV2.java

Men det er jo litt unaturlig at alle disse beregningene gjøres i
BmiController3-klassen.

---

/bmi4 = BmiController4.java + bmi4.jsp

Vi innfører en BmiCalculator4.java og flytter beregningene dit.

Og vi tester mot denne i stedet i BmiCalculator4Test.java

Hva kan gjøres enda bedre?

Tester kan være ganske skjøre om man tester mot String-verdier, spesielt
om de tenkt å vises til brukeren. Hvis man ombestemmer seg på output kan
testene plutselig feile.

Ofte er det bedre å teste mot "harde" verdier i stedet. Enums kan være 
en god "erstatning" for String-verdier.

---

/bmi5 = BmiController4.java + bmi5.jsp

Innfører nå en Enum BmiVektklasse5.java som representerer de ulike
vektklassene.

Bruker denne i applikasjonen (og testene) i stedet.

Testen heter BmiCalculator5Test.java.

...

DA ER VI I MÅL MED EKSEMPLET.
















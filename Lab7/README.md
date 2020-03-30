## Ex1 – Speech-to-Text and Text-to-Speech
(Video: Lab7/Ex1/VIDEO-ex1.mp4)

Primul exercitiu contine doua butoane (“Listen it” si “Tap to open mic”) si un EditText.

Butonul de jos, “Tap to open mic”, implementeaza un convertor **Speech-to-Text**, 
adica deschide microfonul telefonului, asteapta sa i se comunice un text, apoi il afiseaza in EditText-ul de pe mijlocul ecranului. 

Butonul de sus, “Listen it”, permite utilizatorului sa asculte textul din EditText, deci face o conversie **Text-to-Speech**.

La prima rulare, aplicatia cere utilizatorului permisiunea de a folosi microfonul (“android.permission.RECORD_AUDIO”). 
Daca permisiunea este acceptata deja, aplicatia nu o mai cere in viitor. 

<img src="https://i.imgur.com/iU4ya7j.png" width="60"> 

## Ex2 – Android Fragments example
(Video: Lab7/Ex2/VIDEO-ex2.mp4)

Tutorialul prezinta unul dintre modurile in care putem folosi Fragment-urile in Android, adica pentru a schimba o portiune din UI.

Fragment-ul este un fel de sub-activitate, o componenta independenta, 
care poate fi refolosita in mai multe activitati diferite prin functionalitatile ei. 
Astfel, activitatea care se va folosi de Fragment trebuie sa extinda FragmentActivity-ul.

<img src="https://i.imgur.com/HNcml0w.png" width="60">  <img src="https://i.imgur.com/dOxV9if.png" width="60"> 

## Concluzii
Cu permisiunile a fost putin mai tricky, dar nu am avut nicio dificultate in realizarea laboratorului 😊

Consider ca atat conversiile, cat si Fragment-urile sunt niste concepte foarte utile dupa un mic efort de intelegere. 

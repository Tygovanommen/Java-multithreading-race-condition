#Java multithreading race conditiona

##Wat is multithreading?

Multithreading geeft je de mogelijkheid om meerdere processen tegelijk te laten uitvoeren om de CPU maximaal te gebruiken. 
Er zijn verschillende kleinere threads die samen tegelijk de CPU geheugen gebruiken.
Het is een soort van multitasken van processen. 

##Wanneer gebruik je meerdere threads?

Het is vooral bedoeld om taken uit te voeren zonder geblokeerd te worden.
Je kunt taken uitvoeren terwijl je bijvoorbeeld een formulier in aan het vullen bent en je word hier niet door geblokeerd.

##Veel voorkomende problemen bij mutithreaded

###Race conditions
Dit gebeurt wanneer er verschillende thread een stappen process tegelijk proberen uit te voeren. 
Wanneer thread 2 iets uitvoerd voordat thread 1 er iets mee heeft gedaan. 

**Voorbeeld**: Wanneer thread 2 de GUI opent terwijl thread 1 the GUI initialiseert.

###Deadlock
Dit gebeurt wanneer verschillende threads op elkaar aan het wachten zijn.
Wanneer thread 1 iets probeert te doen wat thread 2 al heeft gedaan. En thread 2 weer iets probeert te doen dat thread 1 heef gedaan.

###Starvation
Wanneer een process een lage priorteit heeft en nooit aan bot komt en dus blijf hangen.

##Stack en heap
- Objecten worden in de Heap opgeslagen. 
- Methodes worden in de stack uitgevoerd. 
Wanneer een methode een object wilt initialiseren wordt er een pointer naar het object in de heap gemaakt.

In het geval van multithreading worden er verschillende stacks gemaakt welke de beschikbaren geuheugen gebruiken.
Beide stacks zullen wijzen naar dezelfde heap.

##Race conditions voorkomen
Om race conditions te voorkomen moet je beter nadenken over je design van je architectuur.
De beste oplossing is om jee software zo stateless mogelijk maken. 
Maak je methodes niet gevoelig voor de staat van je programma.
Alle gegevens die je wilt gebruiken in je methode moeten doorgegeven worden als input en teruggegeven worden als uitvoer.

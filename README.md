# Java multithreading race condition

## Proof of concept
Deze repository is een simpele proof of concept van race conditions met twee oplossingen.

Een voorbeeld waar ik de synchronize oplossing heb toegepast is bij mijn chat room applicatie:<br>
[Java-socket-chatroom/chatController.java](https://github.com/Tygovanommen/Java-socket-chatroom/blob/master/user/src/guis/chatController.java)

Daarnaast heb ik ook nog een proof of concept test gemaakt voor Java multithreading:<br>
[Multi-threaded-tasks](https://github.com/Tygovanommen/multi-threaded-tasks)

## Onderzoek Multithreading

### Wat is multithreading?
<div align="right">
  <img alt="Deadlock image" src="https://github.com/Tygovanommen/Java-multithreading-race-condition/blob/main/deadlock.jpg">
</div>
Multithreading geeft je de mogelijkheid om meerdere processen tegelijk te laten uitvoeren om de CPU maximaal te gebruiken. 
Er zijn verschillende kleinere threads die samen tegelijk de CPU-geheugen gebruiken.
Het is een soort van multitasken van processen. 

### Wanneer gebruik je meerdere threads?

Het is vooral bedoeld om taken uit te voeren zonder geblokkeerd te worden.
Je kunt taken uitvoeren, terwijl je bijvoorbeeld een formulier in aan het vullen bent en je word hier niet door geblokkeerd.

### Veel voorkomende problemen bij multithreaded

#### Race conditions
Dit gebeurt wanneer er verschillende thread een stappen process tegelijk proberen uit te voeren. 
Wanneer thread B iets uitvoert voordat thread A er iets mee heeft gedaan. 

**Voorbeeld**: Wanneer thread B de GUI opent terwijl thread A the GUI initialiseert.

#### Deadlock
Dit gebeurt wanneer verschillende threads op elkaar aan het wachten zijn.
Wanneer thread A iets probeert te doen wat thread B al heeft gedaan. En thread B weer iets probeert te doen dat thread A heef gedaan.

#### Starvation
Wanneer een process een lage prioriteit heeft en nooit aan bot komt en dus blijf hangen.

### Stack en heap
- Objecten worden in de Heap opgeslagen. 
- Methodes worden in de stack uitgevoerd. 

Wanneer een methode een object wilt initialiseren wordt er een pointer naar het object in de heap gemaakt.

In het geval van multithreading worden er verschillende stacks gemaakt welke de beschikbare geheugen gebruiken.
Beide stacks zullen wijzen naar dezelfde heap.

### Race conditions voorkomen
Om race conditions te voorkomen moet je beter nadenken over je ontwerp van je architectuur.
Wat je kunt doen is je threads stap voor stap processen laten uitvoeren
De beste oplossing is om jee software zo stateless mogelijk maken. 
Maak je methodes niet gevoelig voor de staat van je programma.
Alle gegevens die je wilt gebruiken in je methode moeten doorgegeven worden als input en teruggegeven worden als uitvoer.
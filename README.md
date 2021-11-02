"SistemaDiVotoEScrutinioElettronico-ProgettoMaven " 
Le classe da noi create(Elettore e Scrutinatore) sono due classi concrete e mutabili le quali rappresentano le rispettive entitá.
-Elettore:
Per elettore abbiamo deciso di immaginare che questi sia un estenzione della classe utente la quale poi verrá estesa da una seconda classse:"Gestore".
La classe utente si occupperá di gestire la parte rellativa al login, operazione comune ad entrambi gli attori,avrá come attributi le credenziali(nome e pw) mentre le due sottoclassi andranno ad implementare le funzionalitá che li caratterizzano.
In questa classe in particolare abbiamo abbozzato il metodo votazione il quale permette all'Elettore ricevuta una scheda elettorale "Bianca" dal sistema di restituire una Lista di stringhe che rappresenta le sue prefereze, a seconda del tipo di voto scelte queste preferenze saranno interpretate in maniera differente dalla classe Scrutatore.
Non abbiamo ritenuto, al momento, l'inserimetno di altri metodi in quanto come sopra detto le operazioni di login saranno relative all'oggetto utente e le uniche azioni che elettore deve poter svolgere sul sistema sono appunto relativa alla votazione.
-Scrutatore:
Lo scrutatore é un entita creata dal gestore in concomitanza con la scelta del metodo di elezione del vincitore.
Questi una volta terminata la Sessione di voto crea lo scrutinatore selezionando il metodo di elezione tra quelli possibili(il quale rappresenta un attributo enumerabile della classe) e una collezzione(in questo caso una lista) dei voti raccolti dalla Sessione.
Abbiamo infine una stringa esito la quale permetterá nel caso si voglia tenere uno storico delle sessioni e dei relativi scrutigni di mantenere direttamente il risultato, il metodo getEsito ha appunto lo scopo di restituire direttamenete(se presente) l'esito del relativo scrutigno.
Il metodo CalcolaEsito ha lo scopo di calcolare, secondo la modalitá prestabilita, l'esito della sessione di voto; per farlo itererá sulla lista di Schede Compilate interpretandole a seconda della modalitá di voto che le caratterizza.



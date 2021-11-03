import java.util.List;

//OVERVIEW: classe concreta immutabile che rappresenta un Elettore, il quale estende la superclasse Utente. Esso ha una sola funzione, 
//          ovvero quella di votare.

public class Elettore extends Utente{
    //Non sono presenti variabili d'istanza per Elettore.

    //Costruttore che istanzia un nuovo Elettore
    public Elettore(){
        
    }   

    //EFFECTS: data in input una SchedaElettorale, l'utente puo' accedere al quesito e alla lista di opzioni tra cui votare. 
    //         Una volta votate, viene restituita una lista di stringhe conteneteuna nuova SchedaElettorale compilata in base a quello che l'Elettore ha scelto.
    public SchedaElettorale votazione(SchedaElettorale scheda){

    }
}

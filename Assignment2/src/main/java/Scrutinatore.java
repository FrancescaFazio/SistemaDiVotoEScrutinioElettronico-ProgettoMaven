import java.util.List;

//OVERVIEW: classe concreta che rappresenta uno scrutinatore. Esso viene definito da una lista di SchedeElettorali compilate, da un enumerabile
//          che indica il metodo di scelta del vincitore e infine da un esito definito mediante una stringa.

public class Scrutinatore{
    //Variabile d'istanza che rappresenta la lista di schede elettorali compilate.
    private List<SchedeElettorale> schedeCompilate;
    //Variabile d'istanza che rappresenta l'esito;
    private String esito;
    //Variabile d'istanza che rappresenta il metodo di scelta del vincitore.
    private enum metodoSceltaVincitore{
        maggioranza,
        maggioranza assoluta,
        referendum senza quorum,
        referendum con quorum
    }

    //Costruttore che istanzia un nuovo Scrutinatore.
    public Scrutinatore(List<SchedeElettorali> schedeCompilate, Enum metodoSceltaVincitore){

    }

    //EFFECTS: restituisce l'esito della votazione.
    public String getEsito(){

    }

    //MODIFIES: esito.
    //EFFECTS: in base al metodoSceltaVincitore, permette di calcolare l'esito della votazione e salvare il tutto all'interno della
    //         stringa esito.
    private void calcolaEsito(){
        
    }
}
package nikitaivanov.gestione_dispositivi.dipendenti;

import jakarta.persistence.*;

@Entity
@Table(name = "dipendenti")
public class Dipendenti {
    //Attributi
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    protected String name;
    protected String surname;
    protected String email;

    //Costruttori
    public Dipendenti(){}

    public Dipendenti(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }
    //Metodi

}

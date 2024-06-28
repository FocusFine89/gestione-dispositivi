package nikitaivanov.gestione_dispositivi.dispositivi;

import jakarta.persistence.*;
import nikitaivanov.gestione_dispositivi.dipendenti.Dipendenti;

@Entity
@Table(name = "dispositivi")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipologia_dispositivo")
public abstract class Dispositivi {
    //Attributi
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;
    protected String tipologia;

    @ManyToOne
    @JoinColumn(name = "dipendente", nullable = true)
    protected Dipendenti dipendente;

    //Costruttori
    public Dispositivi(){}

    public Dispositivi(String tipologia, Dipendenti dipendente) {
        this.tipologia = tipologia;
        this.dipendente = dipendente;
    }

    public Dispositivi(String tipologia) {
        this.tipologia = tipologia;
    }
    //Metodi


    public long getId() {
        return id;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public Dipendenti getDipendente() {
        return dipendente;
    }

    public void setDipendente(Dipendenti dipendente) {
        this.dipendente = dipendente;
    }

    @Override
    public String toString() {
        return "Dispositivi{" +
                "id=" + id +
                ", tipologia='" + tipologia + '\'' +
                ", dipendente=" + dipendente +
                '}';
    }
}

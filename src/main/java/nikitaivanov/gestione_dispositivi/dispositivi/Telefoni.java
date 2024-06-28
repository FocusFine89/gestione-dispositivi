package nikitaivanov.gestione_dispositivi.dispositivi;

import nikitaivanov.gestione_dispositivi.dipendenti.Dipendenti;

public class Telefoni extends Dispositivi{
    //Costruttori

    public Telefoni(String tipologia, Dipendenti dipendente) {
        super(tipologia, dipendente);
    }


    //Metodi

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public Dipendenti getDipendente() {
        return super.getDipendente();
    }

    @Override
    public void setDipendente(Dipendenti dipendente) {
        super.setDipendente(dipendente);
    }

    @Override
    public String getTipologia() {
        return tipologia;
    }

    @Override
    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    @Override
    public String toString() {
        return "Telefoni{" +
                "id=" + id +
                ", tipologia='" + tipologia + '\'' +
                ", dipendente=" + dipendente +
                '}';
    }
}

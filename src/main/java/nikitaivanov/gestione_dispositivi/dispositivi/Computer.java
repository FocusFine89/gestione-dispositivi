package nikitaivanov.gestione_dispositivi.dispositivi;

import nikitaivanov.gestione_dispositivi.dipendenti.Dipendenti;

public class Computer extends Dispositivi{
    //Attributi


    //Costruttori

    public Computer(String tipologia, Dipendenti dipendente) {
        super(tipologia, dipendente);
    }


    //Metodi


    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public String getTipologia() {
        return super.getTipologia();
    }

    @Override
    public void setTipologia(String tipologia) {
        super.setTipologia(tipologia);
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
    public String toString() {
        return super.toString();
    }
}

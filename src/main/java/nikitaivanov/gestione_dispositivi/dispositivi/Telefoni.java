package nikitaivanov.gestione_dispositivi.dispositivi;

public class Telefoni extends Dispositivi{
    //Attributi
    protected String tipologia;
    //Costruttori

    public Telefoni(String tipologia) {
        super(tipologia);
    }


    //Metodi

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
                '}';
    }
}

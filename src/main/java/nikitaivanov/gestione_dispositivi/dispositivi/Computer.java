package nikitaivanov.gestione_dispositivi.dispositivi;

public class Computer extends Dispositivi{
    //Attributi
    protected String tipologia;

    //Costruttori

    public Computer(String tipologia, String tipologia1) {
        super(tipologia);
        this.tipologia = tipologia1;
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
        return "Computer{" +
                "id=" + id +
                ", tipologia='" + tipologia + '\'' +
                '}';
    }
}

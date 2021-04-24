public class Epargne extends Compte{
    private float taux;

    public Epargne(){
        super();
    }
    public Epargne(int solde, float taux){
        super(solde);
        this.taux=taux;
    }

    public float getTaux(){
        return taux;
    }

    public void setTaux(float taux){
        this.taux=taux;
    }
    
    @Override
    public void depot(float mt){
        solde+=mt*(1+(taux/100));

    }
}
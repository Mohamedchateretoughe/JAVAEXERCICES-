public class Compte{
    private int solde;
    public Compte(){}
    public Compte(int solde){
        this.solde=solde;
    }
    public int getSolde(){
        return solde;
    }
    public void setSolde(int solde){
        this.solde=solde;
    }
    public void depot(float mont){
        solde+=mont;
    }

}
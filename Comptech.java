public class CompteCh extends Compte{
    private int frais;

    public CompteCh(){
        super();
    }
    public CompteCh(int solde, int frais){
        super(solde);
        this.frais=frais;
    }

    public int getFrais(){
        return frais;
    }

    public void setFrais(int frais){
        this.frais=frais;
    }
    
    @Override
    public void depot(float mont){
        solde+=mont-frais;
    }

    public void retrait(float mont){
        sodle-=mont+frais;
    }

    public void virement(float mont){

    }
}
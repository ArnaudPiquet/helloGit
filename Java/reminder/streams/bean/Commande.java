public class Commande{
    String name;
    double montant;
    Commande(){}
    Commande(String name,double montant){
        this.name = name;
        this.montant = montant;
    }

    private double getMontant(){
        return montant;
    }

    private void setMontant(double montant){
        this.montant = montant;
    }

    private String getName(){
        return this.name;
    }

    private void setName(String name){
        this.name = name;
    }
}
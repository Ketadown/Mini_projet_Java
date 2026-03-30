public class Pneus extends Produits {

    String type_pneus;

    double largeur;

    int diametre;

    Fabricant LeFabricant;



    public Pneus(String marque, double prixht,String type_pneus, double largeur,int diametre, Fabricant LeFabricant){

        super(marque, prixht);

        this.type_pneus=type_pneus;

        this.largeur=largeur;

        this.diametre=diametre;

        this.LeFabricant=LeFabricant;

    }

}


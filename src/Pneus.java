public class Pneus extends Produits {
    String type_pneus;
    double largeur;
    int diametre;
    Client idProprietaire;

    public Pneus(String marque, double prix_ht,String type_pneus, double largeur,int diametre, Client idProprietaire){
        super(marque, prix_ht);
        this.type_pneus=type_pneus;
        this.largeur=largeur;
        this.diametre=diametre;
        this.idProprietaire=idProprietaire;
    }
}


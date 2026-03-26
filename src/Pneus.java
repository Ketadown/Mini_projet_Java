public class Pneus {
    String type_pneus;
    double largeur;
    int diametre;
    Client idProprietaire;

    public Pneus(String type_pneus, double largeur,int diametre, Client idProprietaire){
        this.type_pneus=type_pneus;
        this.largeur=largeur;
        this.diametre=diametre;
        this.idProprietaire=idProprietaire;
    }
}


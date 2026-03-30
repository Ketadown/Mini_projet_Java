import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main() {

        ArrayList<Client> listeClients= new ArrayList<Client>();
        //Ajout de plusieurs clients dans la class clients :
        Client c1 = new Client(1,"Theam");
        Client c2 = new Client(2,"Ali Hassan");
        Client c3 = new Client(3,"Gong");
        Client c4 = new Client(4,"Zaoui");

        listeClients.add(c1);
        listeClients.add(c2);
        listeClients.add(c3);
        listeClients.add(c4);

        System.out.println("La liste des noms des clients : ");

        for(int i=0;i<listeClients.size();i++){
            System.out.println(listeClients.get(i).nom);
        }

        ArrayList<Pneus> listePneus= new ArrayList<Pneus>();

        // Modification de la création des pneus avec l'héritage, ajout  marque et prix

        Scanner sc = new Scanner(System.in);

        Pneus P1 = new Pneus("Michelin",33,"P1",13,22,c1);
        Pneus P2 = new Pneus("Continental",43,"P2",17,32,c1);
        Pneus P3 = new Pneus("Continental",32,"P3",11,23,c3);
        Pneus P4 = new Pneus("Viking",31,"P4",12,31,c4);
        Pneus P5 = new Pneus("Michelin",44,"P5",19,12,c2);

        listePneus.add(P1);
        listePneus.add(P2);
        listePneus.add(P3);
        listePneus.add(P4);
        listePneus.add(P5);

        System.out.println("Indiquez le nom du client dont vous voulez affichez les types de pneus commandé :");

        String nom_client = sc.nextLine();

        for(int i=0; i<listePneus.size(); i++) {
            if(listePneus.get(i).idProprietaire.nom.equals(nom_client)){
                System.out.println("Le client "+nom_client+" a commandé les pneus de type(s) : "+listePneus.get(i).type_pneus);
            }

        }

        //Test de l'héritage pour la class Pneus

        System.out.println("La marque du pneu 1 est de : "+P1.marque);
        System.out.println("Le prix du pneu 2 est de : "+P2.prix_ht+" €.");


    }
}
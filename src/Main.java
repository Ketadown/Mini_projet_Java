import java.util.ArrayList;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    static void main() {

        ArrayList<Fabricant> listeFabricants = new ArrayList<Fabricant>();

        //Ajout de plusieurs fabricants dans la class Fabricant :
        //Ajout des fabricants dans la BD

        Fabricant c1 = new Fabricant(1, "Theam");
        c1.sauvegarderEnBase();
        Fabricant c2 = new Fabricant(2, "Ali Hassan");
        c2.sauvegarderEnBase();
        Fabricant c3 = new Fabricant(3, "Gong");
        c3.sauvegarderEnBase();
        Fabricant c4 = new Fabricant(4, "Zaoui");
        c4.sauvegarderEnBase();


        listeFabricants.add(c1);
        listeFabricants.add(c2);
        listeFabricants.add(c3);
        listeFabricants.add(c4);


        System.out.println("La liste des noms des fabricants : ");


        for (int i = 0; i < listeFabricants.size(); i++) {

            System.out.println(listeFabricants.get(i).nom);

        }

        ArrayList<Pneus> listePneus = new ArrayList<Pneus>();


        // Modification de la création des pneus avec l'héritage, ajout marque et prix


        Scanner sc = new Scanner(System.in);


        Pneus P1 = new Pneus("Michelin", 33, "P1", 13, 22, c1);
        Pneus P2 = new Pneus("Continental", 43, "P2", 17, 32, c1);
        Pneus P3 = new Pneus("Continental", 32, "P3", 11, 23, c3);
        Pneus P4 = new Pneus("Viking", 31, "P4", 12, 31, c4);
        Pneus P5 = new Pneus("Michelin", 44, "P5", 19, 12, c2);


        listePneus.add(P1);
        listePneus.add(P2);
        listePneus.add(P3);
        listePneus.add(P4);
        listePneus.add(P5);


        System.out.println("Indiquez le nom du fabriquant dont vous voulez affichez les types de pneus fabriqué :");


        String nom_client = sc.nextLine();


        for (int i = 0; i < listePneus.size(); i++) {

            if (listePneus.get(i).LeFabricant.nom.equals(nom_client)) {

                System.out.println("Le fabriquant " + nom_client + " a fabriqué les pneus de type(s) : " + listePneus.get(i).type_pneus);

            }
        }


        //Test de l'héritage pour la class Pneus


        System.out.println("La marque du pneu 1 est de : " + P1.marque);

        System.out.println("Le prix du pneu 2 est de : " + P2.prix_ht + " €.");

        //Ajout d'une possibilité de saisie de nouvelles valeurs dans la class_pneu

        int reponse_admin=1;

        while(reponse_admin==1){

            System.out.println("Voulez-vous ajouter un pneu ? (1: Oui / 0: Non)");
            reponse_admin= sc.nextInt();
            sc.nextLine();

            System.out.println("Saisissez le type du pneu : ");
            String type_p = sc.nextLine();

            System.out.println("Saisissez la marque du pneu : ");
            String marque_p = sc.nextLine();

            System.out.println("Saisissez le montant du pneu : ");
            double prix = sc.nextDouble();
            sc.nextLine();

            System.out.println("Saisissez la largeur diametre : ");
            int largeur = sc.nextInt();
            sc.nextLine();

            System.out.println("Saisissez le diametre : ");
            int diametre = sc.nextInt();
            sc.nextLine();


            System.out.println("Rappel de la liste de fabricants : ");

            for (int i = 0; i < listeFabricants.size(); i++) {

                System.out.println(listeFabricants.get(i).idFabricant+" "+ listeFabricants.get(i).nom);

            }

            System.out.println("Veuillez attribuer une ID_fabricant au pneu : ");
            int id_fabricant_saisie=sc.nextInt();
            Fabricant fabricantChoisi = listeFabricants.get(id_fabricant_saisie-1);


            Pneus p = new Pneus(marque_p, prix,type_p,largeur,diametre, fabricantChoisi);

            System.out.println("Votre saisie a bien été  prise en compte ce pneu sera assigné au fabricant : "+p.LeFabricant.nom);
            listePneus.add(p);

            //Test :

            System.out.println("Liste de tout les différents types de nos pneus : ");

            for (int i = 0; i < listePneus.size() ; i++) {
                System.out.println(listePneus.get(i).type_pneus);
            }


        }}}





import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import streams.service.Utilitaire;

import streams.bean.Commande;

public class Main{
    public static void main(String[] args){
        System.out.println("Utilisation d'un stream filter");
        //Initialisation d'un liste de commande
        List<Commande> listCommande = new ArrayList();
        listCommande.add(new Commande("20190222",113.25));
        listCommande.add(new Commande("20190221",1024.12));
        listCommande.add(new Commande("20190220",168.99));
        listCommande.add(new Commande("20190102",31.00));
        listCommande.add(new Commande("20190201",1.25));
        listCommande.add(new Commande("20190205",9.52));
        listCommande.add(new Commande("20190215",100.17));
        listCommande.add(new Commande("20180908",11.5));

        /***
         * Methode AVANT java 8 
         * Recupere les commandes de fevrier 
         */
        List listeCommandeFevrier = new ArrayList<>();
        for(Commande commande : listCommande){
            if(commande.name.startsWith("201902")){
                listeCommandeFevrier.add(commande);
            }
        }
         /***
          * Methode avec utilisation des streams
          * .filter()
          */
        List listeCommandeStream = listCommande.stream()
          .filter(x -> x.name.startsWith("201902"))
          .collect(Collectors.toList());
    
        /////////////////////////////////////////////////
        // Zone 51
        
        System.out.println(new Utilitaire().getRandom(0, 100));

    } // Fin main
}
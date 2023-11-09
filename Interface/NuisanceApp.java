package Interface;

import java.util.ArrayList;
import java.util.List;

public class NuisanceApp {
    public static void main(String[] args) {
        // Test Person class
        Friend friend1 = new Friend("Juan", 27, Hobby.MUSIC);
        Friend friend2 = new Friend("Kate", 27, Hobby.SPORTS);
        Person friend3 = new Friend("Alex", 21, Hobby.MUSIC);

        System.out.println("3 Friends:");
        System.out.println("friend1: " + friend1);
        System.out.println("friend2: " + friend2);
        System.out.println("friend3: " + friend3);

        System.out.println("\nfriend1 equals friend2: " + friend1.equals(friend2));
        System.out.println("friend1 equals friend3: " + friend1.equals(friend3));

        Person newFriend = new Friend("Kate", 27, Hobby.SPORTS);
        System.out.println("friend2 equals new friend: " + friend2.equals(newFriend));

        // Test Telemarketer class
        Telemarketer telemarketer = new Telemarketer("Fritz", 25);
        System.out.println("\ntelemarketer: " + telemarketer);

        // Test Insect classes
        Mosquito mosquito = new Mosquito("Aedes vexans");
        PeskyMosquito peskyMosquito = new PeskyMosquito("Anopheles walkeri");
        Butterfly butterfly1 = new Butterfly("Swallowtail", List.of("yellow", "black", "blue"));
        Butterfly butterfly2 = new Butterfly(butterfly1); // Using the copy constructor

        System.out.println("\n4 Insects:");
        System.out.println(mosquito);
        System.out.println(peskyMosquito);
        System.out.println(butterfly1);
        System.out.println(butterfly2);

        // Test Nuisance interface
        Nuisance[] nuisances = {telemarketer, mosquito, peskyMosquito};
        
        System.out.println();

        System.out.println("3 Nuisances:");
        for (Nuisance nuisance : nuisances) {
            if (nuisance instanceof Mosquito) {
                System.out.println(((Mosquito) nuisance).buzz());
            } else if (nuisance instanceof PeskyMosquito) {
                System.out.println(((PeskyMosquito) nuisance).buzz());
                System.out.println(((PeskyMosquito) nuisance).bite());
            }
             	
         
          
           System.out.println(nuisance.annoy());
            System.out.println();
        }
   
    }
   
    }


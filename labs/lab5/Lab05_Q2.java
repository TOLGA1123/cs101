

import java.util.Random;
import java.util.Scanner;
public class Lab05_Q2 {
    // 36 index randomly select then 35 then 34... subtract the selected ones in deck by recreating string without these indexes.
    // value of string == ascii value   can not prevent if 5 card is the same
    public static void main(String[] args) {
        String startingDeck = "";
        for(double i = 0.5; i<9.5 ; i = i+0.25){
            startingDeck += String.valueOf(Math.round(i));
        } //r1=playercard1 r2=playercard2 r3=dealercard1 r4=dealercard2
          //r5=player new card r6=dealer new card
        System.out.println("Starting the game with the following deck:" );
        System.out.println(startingDeck);
        int r1 = 1; int r2 = 1;  Random rand = new Random();
        for(int j = 1; j<2 ; j++){
            rand = new Random();
            r1 = rand.nextInt(9)+1;
            r2 = rand.nextInt(9)+1;
        }
        //player's first two cards
        System.out.println("Dealer is now dealing cards...");
        System.out.println("Player's hand: " + r1 + r2); 
        int r3 = 1; int r4 = 1;
        for(int k = 1; k<2 ; k++){
            rand = new Random();
            r3 = rand.nextInt(9)+1;
            r4 = rand.nextInt(9)+1;
        }
        //dealer's first two cards
        System.out.println("Dealer's hand: " + r3 + "?");
        startingDeck = startingDeck.replaceFirst(String.valueOf(r1),"");
        startingDeck = startingDeck.replaceFirst(String.valueOf(r2),"");
        startingDeck = startingDeck.replaceFirst(String.valueOf(r3),"");
        startingDeck = startingDeck.replaceFirst(String.valueOf(r4),"");
        //System.out.println(startingDeck);
        Scanner in = new Scanner(System.in);  int psum = r1+ r2; int dsum = r3 + r4;
        boolean playersTurn = false;  String playersHand = String.valueOf(r1) + String.valueOf(r2);
        do{
            System.out.printf("Please enter your choice" +"\n 1) Hit" + "\n 2) Stand");
            System.out.println();
            int choice = in.nextInt(); 
            if(choice==1){
                System.out.println("Hit! Dealer is giving the player a card...");
                int r5 = rand.nextInt(9)+1;
                psum = psum + r5;
                playersHand += String.valueOf(r5);
                System.out.println("Players new hand is: " +playersHand);
                startingDeck = startingDeck.replaceFirst(String.valueOf(r5),"");
            }
            else if (choice==2){
                playersTurn = true;
                System.out.println("Stand! Player's turn is now over. Player's hand is sum to " + psum);
            }
        }
        while(psum<21 && !playersTurn );
        if(psum==21){
            System.out.println("Player scored 21. Player wins!");
        }
        else if (psum>21){
        System.out.println("Player scored over 21. Player lost!");
        }
            boolean dealersTurn = false;   String dealersHand = String.valueOf(r3) + String.valueOf(r4);
            do{
                
                int r6 = rand.nextInt(9)+1;
                dsum = dsum + r6;
                dealersHand += String.valueOf(r6);
                System.out.println("Dealer's hand: " + dealersHand);
                startingDeck = startingDeck.replaceFirst(String.valueOf(r6),"");
                if(dsum==21){
                    System.out.println("Dealer scored 21. Dealer wins!");
                }
                else if(dsum>21){
                    System.out.println("Dealer scored over 21. Dealer lost!");
                }
                else if(psum<dsum){
                    dealersTurn = true;
                    System.out.println("Dealer scored more than player. Dealer wins!");
                }
            }
            while(dsum<21 && !dealersTurn && psum<21);
        System.out.printf("\nEnding the game with the following deck:" + "\n" +startingDeck);
        in.close();
    }
    
}

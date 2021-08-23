import java.io.*;
import java.util.*;

class Dice{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(6);
        System.out.println("This is Dice Rolling game!");
        while(true) 
        {   System.out.println("Press enter to roll dice");
            String ch=in.nextLine();
            if(number==1)
            {
                System.out.println(" ____________");
                System.out.println("|            |");
                System.out.println("|            |");
                System.out.println("|     O      |");
                System.out.println("|            |");
                System.out.println("|____________|");
            }
            if(number==2)
            {
                System.out.println(" ____________");
                System.out.println("|            |");
                System.out.println("|            |");
                System.out.println("|   O   O    |");
                System.out.println("|            |");
                System.out.println("|____________|");
            }
            if(number==3)
            {
                System.out.println(" ____________");
                System.out.println("|            |");
                System.out.println("|            |");
                System.out.println("|  O  O  O   |");
                System.out.println("|            |");
                System.out.println("|____________|");
            }
            if(number==4)
            {
                System.out.println(" ____________");
                System.out.println("|            |");
                System.out.println("|   O   O    |");
                System.out.println("|            |");
                System.out.println("|   O   O    |");
                System.out.println("|____________|");
            }
            if(number==5)
            {
                System.out.println(" ____________");
                System.out.println("|            |");
                System.out.println("|  O     O   |");
                System.out.println("|     O      |");
                System.out.println("|  O     O   |");
                System.out.println("|____________|");
            }
            if(number==6)
            {
                System.out.println(" ____________");
                System.out.println("|            |");
                System.out.println("|   O    O   |");
                System.out.println("|   O    O   |");
                System.out.println("|   O    O   |");
                System.out.println("|____________|");
            }
        }
    }
}

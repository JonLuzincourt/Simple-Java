//Provided by: Jonathan Luzincourt
//Email Address: jluzinc000@citymail.cuny.edu
//File: application.java
import java.util.Scanner;

public class Main {
    //power function is used to find the smallest power of two to the number 
    //and stores it inside n.
    public static int power(int n){
        int count = 0;
            if(n > 0 && (n & (n-1)) == 0){
                return n;
            }//Case where n is 0
            while(n != 0){
                n >>= 1; //shifts n to the right by 1 if negative
                count += 1;
            }
            return 1 << count; //shifts to the left and returns count
        }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //User inserts age and program determines the stage of life.
        System.out.println("How old are you?");
        int age = input.nextInt();
        if(age < 13){
            System.out.println("You are young.");
        }else if(age < 20 && age >= 13){
            System.out.println("You are a teenager.");
        }else{
            System.out.println("You are an adult.");
        }
        //User inputs favorite color that program has and compares it to things
        //in life. If user inputs a color the program doesin't recognize it will
        //repeat until the user inputs one that is.
        while(true){
        System.out.println("What is your favorite color?");
        String favcolor = input.next();
        if("green".equalsIgnoreCase(favcolor)){
            System.out.println("Color of the Nature!");
            break;
        }else if("blue".equalsIgnoreCase(favcolor)){
            System.out.println("Color of the Sky!");
            break;
        }else if("yellow".equalsIgnoreCase(favcolor)){
            System.out.println("Color of the Sun!");
            break;
        }else if("red".equalsIgnoreCase(favcolor)){
            System.out.println("Color of the Rose!");
            break;
        }else if("orange".equalsIgnoreCase(favcolor)){
            System.out.println("Color of the Tiger!");
            break;
        }else if("pink".equalsIgnoreCase(favcolor)){
            System.out.println("Color of the Spring!");
            break;
        }else if("grey".equalsIgnoreCase(favcolor)){
            System.out.println("Color of the Brain!");
            break;
        }else{
        System.out.println("Color is not listed, please insert another color.");
            }
        } 
        
        System.out.println("Insert a number.");
        int m;
        m = input.nextInt();
        System.out.println("Smallest power of 2 to " + m + " is " + power(m));
        int t = power(m);
        //If the smallest power of the user input is less than 100 the program
        //does arithmetic to print out '*' and ' ' to create a circle.
        if (t < 100){
                for(int i = 0; i < t; i++){
                    for(int j = 0; j < t; j++){
                        double fij = Math.pow((t/2 -i),2) + Math.pow((t/2 -j),2);
        //Math.pow is used to find the power of an integer.                
                        double k =Math.sqrt(fij);
                        if(k < t/2){
                            System.out.print('*');
                        }else{
                            System.out.print(' ');
                        }
                    }
                    System.out.println(); //Prints a new line
                }
            }
    }
}

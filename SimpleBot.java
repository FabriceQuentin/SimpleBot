package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) {
        greet("Aid", "2018"); // change it as you need
        remindName();
        guessAge();
        count();
        test();
        // ...
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        System.out.println("");
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        // write your code here
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        int rep =0;
            while (rep != 2){
                rep = scanner.nextInt();
                System.out.println("Please, try again.");
            }
            
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}
/*import java.util.*;
public class Mestests {
    public static void main(String[] args) {
        System.out.println("Hello!");
        int number = 200;             // it has a value
        int low = 100, high = 200;   // borders

        boolean inRange = (number > low && number < high); 
        System.out.println(inRange);
     }

}*/
 /* 
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String result ="";
        for (int i=a;a<b && i<=b;i++){
           
            if(i%3!=0){
                if (i%5!=0){
                System.out.println(i); 
                }  
                else if(i%5==0){
                System.out.println("Buzz");    
                }    
            }

            else if(i%5!=0){
                if (i%3==0){
                System.out.println("Fizz"); 
                }        
            }
            
            else if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
        
        }
       
         char caract = result.charAt(); //System.out.println(result);
        int j = 0;
        for(j=0;j<caract.length;j++){
            System.out.println(result.charAt(j));
        }
}
}
*/

 /*import java.util.Scanner;

 class Main {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         // start coding here
 
         int a = scanner.nextInt();
         int b = scanner.nextInt();
         String result ="";
        
         for (int i=a;a<b && i<=b;i++){
             if(i%3==0 && i%5==0){
                 System.out.println("FizzBuzz");
             }  
             else if(i%5==0){
                 System.out.println("Buzz");    
             }    
             else if (i%3==0){
                     System.out.println("Fizz"); 
                 }        
             
             
             else{
                 System.out.println(i);
             }
         
         }
        
     }
 }*/
 



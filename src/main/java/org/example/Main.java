package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calcuclator();
    }
    private static void Calcuclator(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int first = scan.nextInt();
        System.out.println("Enter second number:");
        int second = scan.nextInt();
        int action =0;
        while(action != 5) {
            System.out.println("What to do?\n 1.Plus\n 2.Minus\n 3.Multiplication\n 4.Division\n 5.Stop\n");
            action = scan.nextInt();
            switch (action) {
                case 1:
                    System.out.printf("Result: %f\n",  Plus(first, second));
                    break;
                case 2:
                    System.out.printf("Result: %f\n",  Minus(first, second));
                    break;
                case 3:
                    System.out.printf("Result: %f\n",  Multiplication(first, second));
                    break;
                case 4:
                    System.out.printf("Result: %f\n",  Division(first, second));
                    break;
            }
        }
    }
    private static double Plus(int first, int second){
        return first + second;
    }
    private static double Minus(int first, int second){
        return first-second;
    }
    private static double Multiplication(int first, int second){
        return first*second;
    }
    private static double Division(int first, int second){
        return first / second;
    }
}


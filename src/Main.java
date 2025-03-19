import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int input1;
        int input2;
        String name;

        hello();

        System.out.println("Type in a number");
        number = sc.nextInt();
        positiveOrNegative(number);

        System.out.println("Type in another number");
        number = sc.nextInt();
        sc.nextLine();
        positiveOrZeroOrNegative(number);

        System.out.println("Tell me, who is this drink for?");
        name = sc.nextLine();
        bartender(name);

        System.out.println("Give me a number");
        input1 = sc.nextInt();
        System.out.println("What number do you want to add");
        input2 = sc.nextInt();
        sum(input1, input2);

        evenOddChecker(sc);
        bonus.grader(sc);


    }

    public static void hello() {
        System.out.println("Hello, world!");
    }

    public static void positiveOrNegative(int number) {
        if (number > 0) {
            System.out.println("This number is positive!");
        } else {
            System.out.println("This number is negative!");
        }
    }

    public static void positiveOrZeroOrNegative(int number) {
        if (number > 0) {
            System.out.println("This number is positive!");
        } else if (number == 0) {
            System.out.println("This number is zero!");
        } else {
            System.out.println("This number is - negative!");
        }
    }

    public static void bartender(String name) {
        switch (name) {
            case "Jeroen":
                System.out.println(name + " wants a whiskey on the rocks");
                break;
            case "Henk":
                System.out.println(name + " wants a Bacardi cola");
                break;
            case "Mitch":
                System.out.println(name + " wants a Beer");
                break;
            case "Mark":
                System.out.println(name + " wants an Gin and Tonic");
                break;
            case "Jack Sparrow":
                System.out.println(name + " wants a bottle of rum");
                break;
            default:
                System.out.println("I Dont know your drink yet, but please do tell");
        }

    }
    public static void sum(int input1, int input2) {
        int sum = input1 + input2;
        System.out.println(input1 + " summed by " + input2 + " = " + sum);
    }

    public static void evenOddChecker (Scanner sc){
        int input3 = sc.nextInt();
        sc.nextLine();
        if (input3 % 2 == 0) {
            System.out.println("Het getal is even");
        } else {
            System.out.println("Het getal is oneven");
        }
    }



}

import java.util.Scanner;

public class BonusIfElse {

    public static void evenOddChecker(Scanner sc) {
        System.out.println("Voer een getal in");
        int number = sc.nextInt();
        sc.nextLine();
        int result = number % 2;
        if (result > 0){
            System.out.println("Het getal is even");
        } else {
            System.out.println("Het getal is oneven");
        }
    }


    public static void grader(Scanner sc) {
        System.out.println("Wat is je cijfer?");
        int grade = sc.nextInt();
        sc.nextLine();
        switch (grade) {
            case 1:
            case 2:
                System.out.println("Je hebt een F gehaald, dat is een onvoldoende");
            case 3:
            case 4:
                System.out.println("Je hebt een D gehaald, dit is een onvoldoende");
            case 5:
            case 6:
                System.out.println("Je hebt een C gehaald, dit is een voldoende");
            case 7:
            case 8:
                System.out.println("Je hebt een B gehaald, nette voldoende!");
            case 9:
            case 10:
                System.out.println("Je hebt een A, wauw");
            default:
                System.out.println("Dit cijfer klopt niet");
        }
    }

    public static void highestNumber(Scanner sc) {
        System.out.println("Voer een getal in");
        int numberOne = sc.nextInt();
        sc.nextLine();
        System.out.println("Voer nog een getal in");
        int numberTwo = sc.nextInt();
        sc.nextLine();
        if (numberOne > numberTwo) {
            System.out.println(numberOne + "is het hoogste getal");
        } else if (numberOne < numberTwo) {
            System.out.println(numberTwo + "is het hoogste getal");
        } else {
            System.out.println("De getallen zijn even hoog");
        }
    }

    public static void positiveNegativeZero(Scanner sc) {
        int number = sc.nextInt();
        sc.nextLine();
        if (number > 0) {
            System.out.println("Dit getal is positief");
        } else if (number == 0) {
            System.out.println("Dit getal is nul!");
        } else {
            System.out.println("Dit getal is negatief");
        }
    }

    public static void age(Scanner sc) {
        int age = sc.nextInt();
        sc.nextLine();
        if (age >= 70) {
            System.out.println("Je bent een senior");
        } else if (age > 18) {
            System.out.println("Je bent een volwassene");
        } else {
            System.out.println("Je bent een kind");
        }
    }

    public static void textLength(Scanner sc) {
        String text = sc.nextLine();
        if (text.length() < 10) {
            System.out.println("kort");
        } else if (text.length() < 20) {
            System.out.println("middellang");
        } else {
            System.out.println("lang");
        }
    }

    public static void leapYearOrNot(Scanner sc) {
        int year = sc.nextInt();
        sc.nextLine();
        if (year % 4 != 0) {
            System.out.println("Het is geen schrikkeljaar");
        } else {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Het is een schrikkeljaar!");
                } else {
                    System.out.println("Het is geen schrikkeljaar");
                }
            } else {
                System.out.println("Het is een schrikkeljaar!");
            }
        }

    }


}

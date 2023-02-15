import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {

        // Type obj = new Type(argument), scanner will help us read the integer as user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number1:");
        int number1 = scanner.nextInt();
        System.out.println(" The number you entered is=  " + number1);//append with string
        System.out.print("Enter Number2:");
        int number2 = scanner.nextInt();
        System.out.println(" The number you entered is=  " + number2);


        System.out.println(" Choices available are ");
        System.out.println(" 1-Add");
        System.out.println(" 2-Subtract");
        System.out.println(" 3-Multiply");
        System.out.println(" 4-Divide");

        System.out.print("Enter Choice:");
        int choice = scanner.nextInt();

        System.out.println("Your choices are");
        System.out.println("Number1 " + number1);
        System.out.println("Number2 " + number2);
        System.out.println("Choice " + choice);
        performOperationsUsingSwitch(number1, number2, choice);
        System.out.println(SwitchExcercisesRunner.determineNameOfDay(2));

    }



    private static void performOperationsUsingSwitch(int number1, int number2, int choice) {
        switch (choice) {
            case 1:
                System.out.println("Result " + (number1 + number2));
                break;
            case 2:
                System.out.println("Result " + (number1 - number2));
                break;
            case 3:
                System.out.println("Result " + (number1 * number2));
                break;
            case 4:
                System.out.println("Result " + (number1 / number2));
                break;
            default:
                System.out.println("Invalid Operation");
                break;
                // Switch works on byte , short , char , and int primitive data types. Enum,string, char, byte, short, integer.
            //The switch statement doesn't accept arguments of type long, float, double,boolean or any object besides String.


        }
    }
}
        /*if (choice == 1) {
            System.out.println("Result " + (number1 + number2));
        } else if (choice == 2) {
            System.out.println("Result " + (number1 - number2));
        } else if (choice == 3) {
            System.out.println("Result " + (number1 * number2));
        } else if (choice == 4) {
            System.out.println("Result " + (number1 / number2));
        }
        else{
            System.out.println("Invalid Operation");

        }
    }
}*/

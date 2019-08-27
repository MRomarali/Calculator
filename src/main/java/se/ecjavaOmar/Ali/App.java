package se.ecjavaOmar.Ali;

/**
 * Hello world!
 *
 */
        import java.util.Scanner;

    public class App
    {
        public static void main(String[]args) {
            boolean asLongAs = true;
            double tal1 = 0, tal2 = 0;
            String result = ""; String result2 = ""; String result3 = "";
            Scanner input = new Scanner(System.in);


            while (asLongAs) {
                try {
                    System.out.println("Enter a number");
                    tal1 = Double.parseDouble(input.nextLine());
                    System.out.println("Enter expression + - * /");
                    result = input.nextLine();
                    System.out.println("Enter a number");
                    tal2 = Double.parseDouble(input.nextLine());
                }catch (NumberFormatException e){
                    System.out.println("incorrect values");

                }
                switch (result){
                    case "+":
                        System.out.println(addition(tal1,tal2));
                        break;
                    case "-":
                        System.out.println(subtraction(tal1,tal2));
                        break;
                    case "*":
                        System.out.println(multiplication(tal1,tal2));
                        break;
                    case "/":
                        System.out.println(Division(tal1,tal2));
                        break;
                    default:
                        System.out.println("Something went wrong");
                        break;
                }
                System.out.println("continue calculating? Type: yes or no?");
                result2 = input.nextLine();
                if (result2.contains("Yes") || result2.contains("yes")) {
                    System.out.println("Are you sure?");
                    result3 = input.nextLine();
                }
                if (result2.contains("No") || result2.contains("no")) {
                    System.out.println("bye!");
                    asLongAs = false;
                }

            }
        }

        public static double addition(double tal1, double tal2)
        {
            return  tal1 + tal2;
        }
        public static double subtraction(double tal1, double tal2){
            return  tal1 - tal2;
        }
        public static double multiplication(double tal1, double tal2){
            return  tal1 * tal2;
        }
        public static double Division(double tal1, double tal2){
            if (tal2 == 0) {
                System.out.println(" You know that you cant divide a number with 0 ");
            }
            return  tal1 / tal2;
        }
    }





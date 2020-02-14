package MainPackage_17; //1 positivo

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main_M3_17 {

    static Scanner keyboard = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("0.000");

    public static void main(String[] args) {
        int euro;
        String euro1;
        float euro2;
        char letter;
        System.out.println("Author:Claudio Quiñones");
        int option = -1;
        keyboard.useDelimiter("\n");
        do {
            userMenu();
            option = keyboard.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Insert amount of Euro:");
                    euro = keyboard.nextInt();
                    functionIntFloat(euro);
                    break;
                case 2:
                    System.out.println("Insert amount of Euro:");
                    euro = keyboard.nextInt();
                    functionIntDouble(euro);
                    break;
                case 3:
                    System.out.println("Insert amount of Euro:");
                    euro = keyboard.nextInt();
                    functionIntString(euro);
                    break;
                case 4:
                    System.out.println("Insert amount of Euro:");
                    euro1 = keyboard.next();
                    functionStringInt(euro1);
                    break;
                case 5:
                    System.out.println("Insert amount of Euro:");
                    euro2 = keyboard.nextFloat();
                    functionFloatInt(euro2);
                    break;
                case 6:
                    System.out.println("Insert amount of Euro:");
                    euro2 = keyboard.nextFloat();
                    functionFloatString(euro2);
                    break;
                case 7:
                    System.out.print("Insert character:");
                    letter = (keyboard.next()).charAt(0);
                    functionChar(letter);
                    break;
                case 8:
                    System.out.print("Insert name:");
                    String str = keyboard.next();
                    String result = functionStringBinary(str);
                    System.out.println(result+"\n");
                    break;
                case 9:
                    int numch;
                    do{
                    System.out.println("Number from 0 to 255");
                    numch = keyboard.nextInt();
                   }while (numch > 255 || numch < 0);
                    String result9 = functionIntChar(numch);
                    System.out.println(numch+" = " + result9);
                    break;
                case 10:
                    functionCharInt();
                    break;
                default:
                    System.out.println("Option not available :(");
            }
            /*System.out.println("Press any key to continue.");
            String key = keyboard.next();*/
        } while (option != 0);
    }

    private static void userMenu() {
        System.out.println("Option1- Int-Float:");
        System.out.println();
        System.out.println("Option2- Int-Double:");
        System.out.println();
        System.out.println("Option3- Int-String");
        System.out.println();
        System.out.println("Option4- String - Int");
        System.out.println();
        System.out.println("Option5- Float - Int");
        System.out.println();
        System.out.println("Option6- Float - String");
        System.out.println();
        System.out.println("Option7- Char");
        System.out.println();
        System.out.println("Option8- Char - Binary");
        System.out.println();
        System.out.println("Option9- Int - Char");
        System.out.println();
        System.out.println("Option10- Char - Int");
        System.out.println();
        System.out.print("\nSelect an option:");
    }

    //function receives int, gives float
    private static Float functionIntFloat(int euro) {
        float result = 0;
        result = (float) euro / 0.91f;//cast
        System.out.println("Euro: " + euro + "€" + " = " + result + " dollar.");
        System.out.println();
        return result;
    }

    private static double functionIntDouble(int euro1) {
        double result = 0;
        result = (double) euro1 / 0.91;
        System.out.println("Euro: " + euro1 + "€" + " = " + result + " dollar.");
        System.out.println();
        return result;
    }

    private static String functionIntString(int euro) {
        //DecimalFormat df = new DecimalFormat("0.000");
        String result = Integer.toString(euro);
        //String result= "0";
        //result= String.valueOf(euro/0.91);
        System.out.println("Euro: " + euro + "€" + " = " + result + " dollar.");
        System.out.println();
        return result;
        //return df.format(result);
    }

    private static Integer functionStringInt(String euro1) {
        int result = Integer.parseInt(euro1);
        System.out.println("Euro: " + euro1 + "€" + " = " + result + " dollar.");
        System.out.println();
        return result;
    }

    private static Integer functionFloatInt(float euro2) {
        int result = 0;
        result = (int) (euro2 / 0.91);//cast
        System.out.println("Euro: " + euro2 + "€" + " = " + result + " dollar.");
        System.out.println();
        return result;
    }

    private static String functionFloatString(float euro2) {
        String result = Float.toString(euro2);
        System.out.println("Euro: " + euro2 + "€" + " = " + result + " dollar.");
        System.out.println();
        return result;
    }

    private static void functionChar(char chr) {
        String letterB = Integer.toBinaryString(chr);
        System.out.println(chr + " = " + letterB);
    }

    private static String functionStringBinary(String str1) {
        String result = "";
        char ch = ' ';
        for (int i = 0; i < str1.length(); i++) {
            ch = str1.charAt(i);
            result += Integer.toBinaryString(ch) + " ";
        }
        return result;
    }

    private static String functionIntChar(int numch) {
    String aChar = new Character((char)numch).toString();
    return aChar; 
    }
    
    private static void functionCharInt() {
        System.out.println("----------");
        for(int i=0; i<255; i++){
            System.out.println(i + "\t"+Integer.toString(i,16)+" = " + (char)i);
        }

    }
}

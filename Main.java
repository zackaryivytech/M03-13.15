import java.math.BigInteger;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigInteger rational1Numerator;
        BigInteger rational1Denominator;

        BigInteger rational2Numerator;
        BigInteger rational2Denominator;



        String input;

        System.out.print("Enter first rational number: ");
        input = scanner.nextLine();

        int i = 0;

        while(true){

            if(input.charAt(i) == ' ')
                break;
            i++;
        }
        rational1Numerator = BigInteger.valueOf(Integer.parseInt(input.substring(0,i)));
        rational1Denominator = BigInteger.valueOf(Integer.parseInt(input.substring(i+1,input.length())));


        System.out.print("\nEnter second rational number: ");
        input = scanner.nextLine();

        while(true){

            if(input.charAt(i) == ' ')
                break;
            i++;
        }

        rational2Numerator = BigInteger.valueOf(Integer.parseInt(input.substring(0,i)));
        rational2Denominator = BigInteger.valueOf(Integer.parseInt(input.substring(i+1,input.length())));


        //Find common denominator
        BigInteger commonDenominator = rational1Denominator.multiply(rational2Denominator);


        //Convert
        BigInteger multiple = commonDenominator.divide(rational1Denominator);
        BigInteger prevNumerator1 = rational1Numerator;
        rational1Numerator = rational1Numerator.multiply(multiple);

        multiple = commonDenominator.divide(rational2Denominator);
        BigInteger prevNumerator2 = rational2Numerator;
        rational2Numerator = rational2Numerator.multiply(multiple);


        //Add
        System.out.print("\n" + rational1Numerator + "/" + commonDenominator + " + " + rational2Numerator + "/" + commonDenominator + " = " + (rational1Numerator.add(rational2Numerator)) + "/" + commonDenominator);

        //Subtract
        System.out.print("\n" + rational1Numerator + "/" + commonDenominator + " - " + rational2Numerator + "/" + commonDenominator + " = " + (rational1Numerator.subtract(rational2Numerator)) + "/" + commonDenominator);

        //Multiply
        System.out.print("\n" + prevNumerator1 + "/" + rational1Denominator + " * " + prevNumerator2 + "/" + rational2Denominator + " = " + (prevNumerator1.multiply(prevNumerator2)) + "/" + commonDenominator);

        //Divide
        System.out.println("\n" + prevNumerator1 + "/" + rational1Denominator + " / " + prevNumerator2 + "/" + rational2Denominator + " = " + (prevNumerator1.multiply(rational2Denominator)) + "/" + (rational1Denominator.multiply(prevNumerator2)));

        System.out.println(prevNumerator2 + "/" + rational2Denominator + " is " + prevNumerator2.doubleValue() / rational2Denominator.doubleValue());
    }





}
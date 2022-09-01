import java.text.DecimalFormat;
import java.util.Scanner;

class main{
    public static void main (String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter bill amount");
        Double bill = myObj.nextDouble();

        System.out.println("Please eneter tip percentage:");
        Double tip = myObj.nextDouble();

        double tipAmount = bill*(tip/100);

        DecimalFormat df = new DecimalFormat("###.##");

        System.out.println("You should tip " + df.format(tipAmount));
        System.out.println("Your new total will be " + df.format(bill+tipAmount));
    }
}
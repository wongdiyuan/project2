import java.util.Scanner;
class Isipadu
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.print("\nIsipadu sebuah silinder:");
double jejari=input.nextDouble();
double tinggi=input.nextDouble();
double isipadu=input.nextDouble();
System.out.println("\njejari ialah:"+jejari);
System.out.println("\nTinggi ialah:"+tinggi);
System.out.println("\nIsipadu ialah:"+isipadu);
System.out.println("\nIsipadu silinder ialah:"+isipadu*jejari*jejari*tinggi);
}
}
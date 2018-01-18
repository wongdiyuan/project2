import java.util.Scanner;
class Solan1
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.print("\nJejari ialah:");
double jejari=input.nextDouble();

System.out.print("\n pi ialah:");
double pi=input.nextDouble();

System.out.print("\nIsipadu ialah");
double isipadu=input.nextDouble();

System.out.println("\nIsipadu sfera ialah:"+isipadu*pi*jejari*jejari*jejari);
}
}
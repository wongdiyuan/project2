import java.util.Scanner;
class Purata
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.print("nom1 ialah:");
int nom1=input.nextInt();
System.out.print("nom2 ialah:");
int nom2=input.nextInt();
System.out.print("nom3 ialah:");
int nom3=input.nextInt();

double purata=(nom1+nom2+nom3)/3;

System.out.println("\n"+nom1);
System.out.println("\n"+nom2);
System.out.println("\n"+nom3);
System.out.println("\n"+purata);
}
}

import java.util.Scanner;
class Latihan
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.print("\nNama?:");
String nama=input.next();

System.out.print("\nUmur?:");
int umur=input.nextInt();

System.out.print("\nNombor kegemaran?:");
double nomborkegemaran=input.nextDouble();

System.out.print("\nSuka membaca atau tidak?:");
boolean membaca=input.nextBoolean();


System.out.println("\n"+nama);
System.out.println("\n"+umur);
System.out.println("\n"+nomborkegemaran);
System.out.println("\n"+membaca);

}
}
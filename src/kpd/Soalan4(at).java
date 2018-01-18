import java.util.Scanner;
class Luas1
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.print("\nLuas sebuah taman permaian:");
double panjang=input.nextDouble();
double lebar=input.nextDouble();
System.out.println("\nLebar ialah:"+lebar);
System.out.println("\nPanjang ialah:"+panjang);
System.out.println("\nLuas taman permaian ialah:"+panjang*lebar);
}
}
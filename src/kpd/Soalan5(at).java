import java.util.Scanner;
class Luas2
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.print("\nLuas kawasan dinding bangunan:");
double panjang=input.nextDouble();
double lebar=input.nextDouble();
System.out.println("\nLebar ialah:"+lebar);
System.out.println("\nPanjang ialah:"+panjang);
System.out.println("\nLuas kawasan dinding bangunan ialah:"+panjang*lebar);
}
}
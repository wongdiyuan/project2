import java.util.Scanner;
class Latihan1
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.print("\nHarga Baju.Polis:");
double polis=input.nextDouble();

System.out.print("\nHarga Baju.Bomba:");
double bomba=input.nextDouble();

System.out.print("\nHarga Baju.Pertahanan Awam:");
double awam=input.nextDouble();


System.out.println("\nMengira jumlah harga barang yang dibeli:"+polis+bomba+awam);
}
}
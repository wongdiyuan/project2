import java.util.Scanner;
class Derma
{
public static void main(String args[])
{
String jenis_darah;
Scanner input=new Scanner(System.in);
System.out.print("\nMasukkan jenis darah penderma:A,B,AB,O");

jenis_darah=input.next();

if(jenis_darah=A)
System.out.println("\nA=Menderma kepada A dan AB sahaja");
else if(jenis_darah=B)
System.out.println("\nB=Menderma kepada B dan AB sahaja");
}
else(jenis_darah=AB)
{
System.out.println("\nAB=Menderma kepada AB sahaja");
}
else(jenis_darah=O)
{
System.out.println("\nO=Menderma kepada A,B,AB dan O sahaja");
}
else
{
System.out.println("\nInput yang dimasukkan tidak dapat diterima");
}}}
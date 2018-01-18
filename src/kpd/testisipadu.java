import java.util.Scanner;
class isipadu
{
    public static void main(String args[])
    {
Scanner input=new Scanner(System.in);
System.out.print("\nAnda memilih pengiraan yang mana?K-Kuboid/S-Silinder:");
char pilihan=input.next().CharAt(0);
System.out.print("\nPanjang:");
double panjang=input.nextDouble();
System.out.print("\nLebar:");
double lebar=input.nextDouble();
System.out.print("\nTinggi:");
double tinggi=input.nextDouble();
System.out.print("\nJejari:");
double jejari=input.nextDouble();

double pi=3.142;
double isipaduK=panjang*lebar*tinggi;
double isipaduS=pi*jejari*jejari*tinggi;

switch("isipadu"){
    case:"K";
("isipadu.K");
break;
/*   case:S"
(*/"isipadu.S");
break;
    default:
        ("Sila memasukkan simbol K/S sahaja!");
}
    }


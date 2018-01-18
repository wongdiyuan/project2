import java.util.Scanner;
class Sfera
{
public static void main(String args[])
{
double jejari,pi,isipadu;
pi=3.142;
Scanner input=new Scanner(System.in);
System.out.print("\nMasukkan jejari sfera:");

jejari=input.nextDouble();

isipadu=4/3*pi*jejari*jejari*jejari;

if(jejari>=1)

System.out.println(isipadu);
else
System.out.println("\nIsipadu tidak boleh dikira");	
}
}
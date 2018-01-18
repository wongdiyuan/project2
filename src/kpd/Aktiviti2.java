import java.util.Scanner;
class gred
{
public static void main(String args[])
{
char sains,math;
Scanner input=new Scanner(System.in);
System.out.print("\nMasukkan gred sains:");
sains=input.nextChar();

System.out.print("\nMasukkan gred math:");
math=input.nextChar();

if(math==sains)
System.out.println("\nGred yang diperolehi adalah sama");
else
System.out.println("\nGred yang diperolehi tidak sama");
}
}
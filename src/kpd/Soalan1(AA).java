import java.util.Scanner;
class Aturcara
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.print("Memaparkan nama kelas:");
String kelas=input.next();

System.out.print("Memaparkan bilangan pelajar:");
int pelajar=input.nextInt();

System.out.print("Memaparkan nama guru:");
String guru=input.next();

System.out.println("\n"+kelas);
System.out.println("\n"+pelajar);
System.out.println("\n"+guru);
}
}

import java.util.Scanner;
public class convertor
{
public static void main(String[] args)
{
Scanner c = new Scanner(System.in);
System.out.println("Input the number of minutes:");
int minutes = c.nextInt();
int year = minutes/525600;
int fdays = minutes%525600;
int day = fdays/1440;

System.out.println(minutes+" is approximately "+year+" years and "+day+" days");
}
} 
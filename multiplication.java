import java.util.*;
public class multiplication
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.print("Enter a number:");
int num=input.nextInt();
for(int i=0;i<=10;i++)
{
System.out.println(i+"x"+num+"="+(i*num));
}
}
}
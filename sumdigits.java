import java.util.*;
public class sumdigits
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.print("Enter the integer:");
long num=input.nextLong();
System.out.println("The sum of the digits is:"+digits(num));
}
public static int digits(long n)
{
int sum=0;
while(n!=0)
{
sum+=n%10;
n/=10;
}
return sum;
}
}
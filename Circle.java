import java.util.*;
class Circle
{
public static void main(String[] args)
{
Double r,area,perimeter;
Scanner input=new Scanner(System.in);
System.out.println("enter the radius");
r=input.nextDouble();
area=Math.PI*r*r;
perimeter=2*Math.PI*r;
System.out.println();
System.out.println("Area of a circle ="+area);
System.out.println("Perimeter of a circle ="+perimeter);
}
}
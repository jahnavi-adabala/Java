import java.util.*;
class SquareRoot
{
public static void main(String args[])
{
double a=2.3,b=4,c=5.6;
double root1,root2;
determinant=b*b-4*a*c;
if(determinant>0)
{
root1 =(-b+math.sqrt(determinant))/(2*a);
root2 =(-b-math.sqrt(determinant))/(2*a);
System.out.println("The roots are real ");
System.out.println("root1=%.2f and root2=%.2f",root1,root2);
}
else if(determinant=0)
{
root1 = root2 =(-b)/(2*a);
System.out.println("The roots are equal");
System.out.println("root1 = root2 =%.2f",root1);
}
else{
double real=-b/(2*a);
double imaginary=math.sqrt(-determinant)/(2*a);
System.out.println("root1=%.2f+%.2fi",real,imaginary);
System.out.println("root2=%.2f-%.2fi",real,imaginary);
}}}



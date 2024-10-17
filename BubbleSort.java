import java.util.*;
class BubbleSort
{
public static void main(String args[])
{
int n,i,j,temp;
System.out.println("Enter the size of the array:");
Scanner s = new Scanner(System.in);
n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter the elements in the array:");
Scanner a = new Scanner(System.in);
for(i=0;i<n;i++)
a[i]=s.nextInt();
for(i=0;i<n;i++)
{
for(j=0;j<n-i-1;j++)
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
for(i=0;i<n;i++)
System.out.println("The sorted list is:",a[i]);
}
}

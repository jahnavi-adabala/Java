import java.util.*;
class Binary
{
    public static void main(String args[])
    {
int n;
System.out.println("Enter the size of the array:");
Scanner s=new scanner(system.in);
n = s.nextInt();
int a[]=new int[n];
System.out.println("Enter the elements in the array:");
for(i=0;i<n;i++)
a[i]=s.nextInt();
int key;
System.out.println("Enter the Key Element:");
Scanner s=new scanner (system.in);
key = s.nextInt();
}
class Binary()
Int Binary(low high, key pos)
{
low=0;
high=n-1;
mid=(low+high)/2;
int pos=0;
if(low<high)
{
if(key==mid)
{
System.out.println("The key element is found at the mid position");
}
else if(key>mid)
{
high=mid-1;
System.out.println("The Key element is found at %d",pos);
}
else if(key<mid)
{
low=low+1;
System.out.println("The Key element is found at %d",pos);
}
else
return -1;
}
if(low>high)
{
System.out.println("The Key element is not found");
}
}
}







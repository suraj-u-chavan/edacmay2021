
import java.util.*;
class Ass5
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
System.out.println("enter the number for the table");
	int a= sc.nextInt();

	System.out.println("Table For  is: "+a);
	for(int i=0; i<11; i++)
	{
		System.out.println(a+"*"+i+"="+a*i);
	}
}
}

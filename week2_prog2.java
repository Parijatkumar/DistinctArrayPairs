import java.util.Scanner;
class week2_prog2 {
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter size of array: ");
		int size=sc.nextInt();
		System.out.println("Enter the elements: ");
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Output: {");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(a[i]>a[j])
				{
					if(count>0)
					System.out.print(",");
					System.out.print("("+a[i]+","+a[j]+")");
					count++;
				}
			}
		}
		System.out.print("} \n");

	}
}
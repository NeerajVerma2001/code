import java.util.Scanner;
class Palindrome
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE VALUE :");
		int no=s.nextInt();
		int temp=no;
		int rem,rev=0;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
			if(no==rev)
			{
				System.out.println("no. is palindrome");
			}
			else
			{
				System.out.println("no. is not palindrome");
			}
		
	}
}
		
package year;
import java.util.Scanner;
public class year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the year");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a%4==0)
		{
			System.out.println(" leap year");
		}
		else
		{
			System.out.println(" not aleap year");
		}

	}

}

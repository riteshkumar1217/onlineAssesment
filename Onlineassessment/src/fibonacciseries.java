
public class fibonacciseries {

	public static void main(String[] args) {
		int n=29;
		boolean flag=false;
		for(int i=2;i<n/2;i++)
		{
			if(n%2==0)
			{
				flag=true;
				break;
			}
			
		}
		if(!flag)
		{
			System.out.println("no is prime");
		}
		else
		{
			System.out.println("NO is not prime");
		}
	}

}

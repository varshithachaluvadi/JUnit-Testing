package numbers;

public class Prime {

	public int checkPrime(int n)
	{
		int i;
		for(i=2;i<n;i++)
		{
			if(n%i!=0)
				return 0;
		}
		return 1;
	}
}

class P 
{
	public static void main(String[] args) 
	{
		int i = 10, j = 10, k = 20;
		System.out.println(i > j && i > k);
		System.out.println(i == j && i > k);
		System.out.println(i == j && i == k);
		System.out.println(i == j && i >= k);
		System.out.println(i <= j && i >= k);
		System.out.println(i != j && i >= k);
		System.out.println(i != j && i <= k);
		System.out.println(i == j && i <= k);
		System.out.println(i == j && i > k);
		System.out.println(i == j && i < k);
		System.out.println(i != j && i < k);
	}
}

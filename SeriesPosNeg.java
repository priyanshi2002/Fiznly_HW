package doWhileLoop;

public class SeriesPosNeg {
	public static void main(String agrs[])
	{
		int i=1;
		do {
			if(i%2==0) {
			System.out.println(-i);
			}else {
				System.out.println(i);
			}
			i++;
	}while(i<=10);
		
}
}

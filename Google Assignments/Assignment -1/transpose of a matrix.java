import java.util.Scanner;
class Main
{
	public static void transpose(int A[][], int B[][])
	{
		int i, j;
		for (i = 0; i < N; i++)
			for (j = 0; j < N; j++)
				B[i][j] = A[j][i];
	}
	
	public static void main (String[] args)
	{
    Scanner sc = new Scanner(System.in);
    int A[][] = new int[r][c];
    int r = sc.nextInt();
    int c = sc.nextInt();
    for (i = 0; i < N; i++)
		{
			for (j = 0; j < N; j++){
        A[i][j] = sc.nextInt();
      }
    }
		int B[][] = new int[r][c], i, j;
		transpose(A, B);
		for (i = 0; i < N; i++)
		{
			for (j = 0; j < N; j++)
			System.out.print(B[i][j] + " ");
    }
			System.out.println();
	}
}

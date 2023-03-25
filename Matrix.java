import java.util.Scanner;
public class Matrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in rows and columns: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array1 = new int[n][m];
        int[][] array2 = new int[n][m];
        int[][] array3 = new int[n][m];
        int i,j;
        System.out.println("Enter elements of first matrix: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                array1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                array2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Addition matrix: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                array3[i][j] = array1[i][j] + array2[i][j];
                System.out.print(array3[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
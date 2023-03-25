import java.util.Scanner;
public class Arraycopy
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements in the array: ");
        int s = sc.nextInt();
        String[] name = new String[s];
        int i;
        System.out.println("Enter the array elements: ");
        for(i=0;i<s;i++)
        {
            name[i] = sc.next();
        }
        String[] copied = new String[s];
        for(i=0;i<s;i++)
        {
            copied[i] = name[i];
        }
        System.out.println("Copied array: ");
        for(i=0;i<s;i++)
        {
            System.out.print(copied[i]+" ");
        }
    }
}
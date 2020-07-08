import java.util.*; 
import java.io.*; 
public class Main
{ 
    public static void main(String args[]) 
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int a[] = new int[n]; 
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int i = 0; 
        long sum = 0; 
        for (i = 0; i < n; i++) { 
            sum += a[i]; 
        } 
        long x = sum / n; 
        if (x * n == sum) 
            System.out.println(x); 
        else
            System.out.println("-1"); 
    } 
} 

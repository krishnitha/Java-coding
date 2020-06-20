import java.util.*; 
class Count 
{ 
    public static int countSetBits(int n) 
    { 
        int count = 0; 
        while (n != 0) { 
            count++; 
            n &=(n-1); 
        } 
        return count; 
    } 
    public static int FlippedCount(int a, int b) 
    { 
        return countSetBits(a ^ b); 
    } 
}
public class Main
{  
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Count C = new Count();
        System.out.print(C.FlippedCount(a, b)); 
    } 
}

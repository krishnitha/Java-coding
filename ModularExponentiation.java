import java.util.*;
import java.io.*; 
class Main 
{ 
    static int power(int x, int y, int p) 
    { 
        int res = 1; 
        x = x % p;  
       if (x == 0) return 0; 
        while (y > 0) 
        { 
            if((y & 1)==1) 
                res = (res * x) % p; 
            y = y >> 1;  
            x = (x * x) % p;  
        } 
        return res; 
    } 
    public static void main(String args[]) 
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x, yand p");
        int x = sc.nextInt(); 
        int y = sc.nextInt(); 
        int p = sc.nextInt(); 
        System.out.println("Power is " + power(x, y, p)); 
    } 
}

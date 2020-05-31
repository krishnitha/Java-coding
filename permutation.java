import java.util.*;
class npr
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++)
        {
            int n=sc.nextInt();
            int r=sc.nextInt();
            int npr=fact(n)/fact(n-r);
            System.out.println(+npr);
        }
    }
    static int fact(int n)
    {
        int i,f=1;
        for(i=1;i<=n;i++)
        {
           f=f*i;
        } 
        return f;
    }
}

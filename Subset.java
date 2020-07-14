import java.util.*; 
class Main
{ 
    static int subsetSum(int arr[], int n, int i, int sum, int count) 
    { 
        if (i == n)  
        { 
            if (sum == 0)  
            { 
                count++; 
            } 
            return count; 
        } 
        count = subsetSum(arr, n, i + 1, sum - arr[i], count); 
        count = subsetSum(arr, n, i + 1, sum, count); 
        return count; 
    } 
    public static void main(String[] args) 
    { 
        int arr[] = { 2, 3, 5, 6, 8, 10 }; 
        int sum = 10; 
        int n = arr.length; 
        System.out.print(subsetSum(arr, n, 0, sum, 0)); 
    } 
}

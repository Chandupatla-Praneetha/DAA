/*write a java program to find sum of N natural numbers using recursion. 

sample output:
Enter n: 6                                                                      
Sum = 21                                                                        
        

*/
import java.util.*;
class SumNaturalRecursion
{
    static int sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            return n+sum(n-1);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        int result = sum(n);
        System.out.print("Sum = "+result);
        sc.close();
    }
}
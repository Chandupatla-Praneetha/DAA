/*write a java program to reverse a number using recursion.

sample output:
Enter a number: 1236                                                            
Reverse = 6321

*/
import java.util.*;
class ReverseNumberRecursion
{
    static void reverse(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.print(n%10);
        reverse(n/10);
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        reverse(n);
        sc.close();
        
    }
}
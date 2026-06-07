import java.util.*;
class q8
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int i,r,rev=0;
        for(i=n;i!=0;i=i/10)
        {
            r=i%10;
            rev=rev*10+r;
        }
        if(n==rev)   System.out.println("PALINDROME");
        else   System.out.println("NOT PALINDROME"); 
    }
}
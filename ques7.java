import java.util.*;
class q7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int i,r,pro=1;
        for(i=n;i!=0;i=i/10)
        {
            r=i%10;
            pro=pro*r;
        }
        System.out.println("Product = "+pro);
    }
}
import java.util.*;
public class add {
    public static void main(String[] args)
    {
        int i,n=0,s=0;
        {
            System.out.println("enter  five digits:");

        }
        for(i=0;i<5;i++)
        {
            Scanner in = new Scanner(System.in);
            n = in.nextInt();
            s +=n;
        }
        System.out.println("the sum of  five number is: " +s );
    }
}

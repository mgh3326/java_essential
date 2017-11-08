import java.util.Scanner;
import java.util.StringTokenizer;

public class q_4 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringTokenizer st=new StringTokenizer(s,"+");
        int num=st.countTokens();
        int total=0;
        for(int i=0; i<num;i++)
        {
            total+=Integer.parseInt(st.nextToken().trim());
        }
        System.out.println("합은 "+total);
//        for(int i=0;i<st.countTokens();i++)
//        {
//            System.out.println(st.nextToken());
//        }
    }
}

import java.util.Scanner;

public class q_2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        while(true) {
            String s=sc.nextLine();
            int temp = 1;
            if(s.equals("exit"))
            {
                break;
            }
            if (s.length() == 0)//아무것도 입력 안할경우
            {
                System.out.println("공백을 입력하셨습니다.");
                continue;
            }

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    temp++;
                }
            }
            System.out.println("어절 개수는 " + temp);
        }
    }
}

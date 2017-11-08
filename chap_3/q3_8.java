//컴퓨터와 사용자의 가위바위보 게임 프로그램을 작성하라.
//사용자가 입력하고 <Enter> 키를 치면,
//컴퓨터는 랜덤하게 가위, 바위, 보 중 하나를 선택한다.
//그리고 누가 이겼는지 출력한다.
//"그만"을 입력하면 게임을 종료한다.
import java.util.Scanner;

public class q3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[] = {"가위", "바위", "보"};
        String var;
        int tmp;//0이 무승부 1은 사용자의 승리, 2는 컴퓨터의 승리, -1은 배열의 가지고 있지 않은 다른 값이 입력되는 경우로 사용 하였습니다.
        int n;
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        while (true) {
            System.out.print("가위 바위 보!>>");
            var=sc.next();//사용자로 부터 입력 받습니다.
            n = (int) (Math.random() * 3);//0,1,2중에 랜덤 정수 리턴
           if((var.equals("가위")&&str[n].equals("보"))||//사용자가 컴퓨터를 이기는 경우
              (var.equals("바위")&&str[n].equals("가위"))||
              (var.equals("보")&&str[n].equals("바위")))
             tmp=1;
           else if((var.equals("가위")&&str[n].equals("가위"))||//사용자와 컴퓨터 비기는 경우
                   (var.equals("바위")&&str[n].equals("바위"))||
                   (var.equals("보")&&str[n].equals("보")))
            tmp=0;
           else if((var.equals("가위")&&str[n].equals("바위"))||//컴퓨터가 사용자를 이기는 경우
                   (var.equals("바위")&&str[n].equals("보"))||
                   (var.equals("보")&&str[n].equals("가위")))
               tmp=2;
            else if(var.equals("그만"))//그만이 입력되는 경우
            {
                System.out.println("프로그램을 종료합니다.");
                break;//break 를 통해서 종료 하도록 하였습니다.
            }
            else
                tmp=-1;//가위 바위 보 그만을 제외한 다른 문자열이 입력되는 경우
            System.out.print("사용자 = "+var+", 컴퓨터 = "+str[n]+", ");
            if(tmp==0)
            {
                System.out.println("무승부 입니다.");
            }
            else if(tmp==1)
                System.out.println("사용자가 이겼습니다.");
            else if(tmp==2)
                System.out.println("컴퓨터가 이겼습니다.");
            //else if(tmp==-1)
            else//가위 바위 보 그만을 제외한 다른 문자열이 입력되는 경우
            {
                System.out.println("\n가위 바위 보 혹은 그만을 입력해주세요.");
            }
        }
        sc.close();
    }
}
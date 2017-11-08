import java.util.Scanner;

public class q2_2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x,y;//사용자로 부터 받을 x,y 좌표를 선언했습니다.
        int xUnderLimit=50,yUnderLimit=50,xOverLimit=100,yOverLimit=100;//x,y 좌표의 한계를 뜻하는 변수를 선언하고 값을 입력해주었습니다.
        System.out.print("점 (x,y)의 좌표를 입력하세요>> ");
        x=sc.nextInt();//x,y 좌표를 사용로 부터 입력 받습니다.
        y=sc.nextInt();
        System.out.print("점 ("+x+","+y+")은 (50, 50)과 (100,100)의 사각형 내에 ");
        if((x>xUnderLimit&&x<xOverLimit&&y>yUnderLimit&&y<yOverLimit))//사각형에 내에  있을 조건 ==> x,y 변수가 x,y 좌표의 한계(50,50),(100,100)사이에 있는지
        {//사각형 선에 좌표가 있는 경우에는 내부에 없는 경우로 했습니다.
            System.out.println("있습니다.");
        }
        else
            System.out.println("없습니다.");
    }
}

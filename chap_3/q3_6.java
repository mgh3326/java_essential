// 영어와 한글의 짝을 이루는 2개의 배열을 만들고,
// 사용자로부터 영어 단어를 입력 받아 한글을 출력하는 프로그램을 작성하라.
// "exit"을 입력 하면 프로그램을 종료하라.
import java.util.Scanner;

public class q3_6 {
    public static void main(String[] args)
    {

        String eng[]={"student","love","java","happy","future"};// 짝을 이루는 영어 배열
        String kor[]={"학생","사랑","자바","행복한","미래"};// 짝을 이루는 한글 배열
        String var;
        int tmp;// exit 을 입력 받으면, -2가 되면서 종료가 되도록 하였고, -1이면 배열에 없는 단어가 입력된 경우로 하였고, 1~5는 배열의 몇번째 인지를 기억하는 변수로 사용됩니다.
        Scanner sc = new Scanner(System.in);
        while(true) {
            tmp = -1;
            System.out.print("영어 단어를 입력하세요>>");
            var = sc.next();// 사용자로부터 영어 단어를 입력 받습니다.
            for (int i = 0; i < eng.length; i++) {
                if (var.equals(eng[i]))// 배열에 영어 단어가 있는 경우
                    tmp = i;
                else if(var.equals("exit"))//exit 이 입력되는 경우
                    tmp=-2;

            }
            if (tmp == -1)
                System.out.println("그런 영어 단어가 없습니다.");
            else if(tmp==-2)
            {
                System.out.println("프로그램을 종료합니다.");
                break;// 종료 하기 위해 break 를 사용하였습니다.
            }
            else {
                System.out.println(kor[tmp]); // 한글 단어 출력
            }
        }
        sc.close();//최종적으로 Scanner를 닫습니다.
    }
}

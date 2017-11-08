//정수 10개를 입력 받아 배열에 저장한 후, 배열을 검색하여 3의 배수만 골라 출력하는 프로그램을 작성하라.

import java.util.InputMismatchException;//정수가 입력되지 않아 예외 발생
import java.util.Scanner;
public class q3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] day = {'일', '월', '화', '수', '목', '금', '토'};//일, 월, 화, 수, 목, 금, 토로 초기화된 문자 배열 day를 선언하였습니다.
        int num;
        while(true) {
            try {
                System.out.print("정수를 입력하세요>>");
                num = sc.nextInt();//사용자로부터 정수를 입력받습니다.
                if(num<0)//음수가 입력되면 프로그램이 종료됩니다.
                {
                    System.out.println("프로그램을 종료합니다...");
                    break;
                }
            } catch (InputMismatchException e) {//정수가 입력되지 않았을때, 예외 발생 하도록 하였습니다.
                //System.out.println(e.getMessage());
                System.out.println("경고! 수를 입력하지 않았습니다.");
                sc.next();//입력 스트림에 있는 정수가 아닌 토큰을 버린다.
                continue;//예외가 발생 하였을 때(정수가 입력되지 않았을 때)다시 while 문의 처음으로 돌아가도록 합니다.
            }
            System.out.println(day[num%7]);//사용자로부터 입력 받은 정수를 7(배열 day의 크기)로 나눈 나머지를 인덱스로 하여 배열 day에 저장된 문자를 출력합니다.
        }
        sc.close();//최종적으로 Scanner를 닫습니다.
    }
}

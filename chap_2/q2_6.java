import java.util.Scanner;

public class q2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;//num 입력 받을 정수
        System.out.print("1~99 사이의 정수를 입력하세요>> ");
        num = sc.nextInt();
        int first=num/10; //first 입력된 정수의 첫째자리
        int second=num%10; //second 입력된 정수의 둘째자리
        if (num > 99||num<1) {//입력된 정수가 1~99의 범위를 만족 하지 않으면 프로그램을 종료 하도록 하였습니다.
            System.out.println("1~99 사이의 정수가 아니므로 프로그램을 종료합니다.");
        } else {
            if ((first==3||first==6||first==9)&&(second==3||second==6||second==9)) {//첫째자리 숫자와 둘째자리 숫자가 모두 (3,6,9) 만족할 때, 박수 짝짝이 출력 되도록 하였습니다.
                System.out.println("박수짝짝");
            } else if ((first==3||first==6||first==9)||(second==3||second==6||second==9)) {//첫째자리 숫자 혹은 둘째 자리 숫자 중 에서는 하나만 (3,6,9) 만족할 때, 박수 짝이 출력 되도록 하였습니다.
                System.out.println("박수짝");
            } else//위에 두 조건이 만족 되지 않을 땐, 박수 없음이 출력 되도록 하였습니다.
                System.out.println("박수없음");
        }
    }
}

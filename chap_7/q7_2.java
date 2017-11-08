import java.util.*;
public class q7_2 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>(5);//크기가 5인 ArrayList 생성

        Scanner sc = new Scanner(System.in);
        System.out.print("빈 칸으로 분리하여 5 개의 학점을 입력(A/B/C/D/F)>>");
        for(int i=0;i<5;i++)//ArrayList의 add 함수를 이용하여 값 입력
            a.add(sc.next());
        for(int i=0;i<a.size();i++) {
            switch (a.get(i)) {//ArrayList의 get 함수를 이용하여 값을 출력하고 switch문을 활용하여 출력문을 생성
                case "A" : System.out.print("4.0 ");break;
                case "B" : System.out.print("3.0 ");break;
                case "C" : System.out.print("2.0 ");break;
                case "D" : System.out.print("1.0 ");break;
                case "F" : System.out.print("0.0 ");break;
                default: System.out.print("(입력 범위 초과) ");
            }
        }
        System.out.println();
    }
}
import java.util.*;
public class q7_2 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>(5);//ũ�Ⱑ 5�� ArrayList ����

        Scanner sc = new Scanner(System.in);
        System.out.print("�� ĭ���� �и��Ͽ� 5 ���� ������ �Է�(A/B/C/D/F)>>");
        for(int i=0;i<5;i++)//ArrayList�� add �Լ��� �̿��Ͽ� �� �Է�
            a.add(sc.next());
        for(int i=0;i<a.size();i++) {
            switch (a.get(i)) {//ArrayList�� get �Լ��� �̿��Ͽ� ���� ����ϰ� switch���� Ȱ���Ͽ� ��¹��� ����
                case "A" : System.out.print("4.0 ");break;
                case "B" : System.out.print("3.0 ");break;
                case "C" : System.out.print("2.0 ");break;
                case "D" : System.out.print("1.0 ");break;
                case "F" : System.out.print("0.0 ");break;
                default: System.out.print("(�Է� ���� �ʰ�) ");
            }
        }
        System.out.println();
    }
}
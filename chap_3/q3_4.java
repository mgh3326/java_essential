import java.util.InputMismatchException;//������ �Էµ��� �ʾ� ���� �߻�
import java.util.Scanner;
public class q3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] day = {'��', '��', 'ȭ', '��', '��', '��', '��'};//��, ��, ȭ, ��, ��, ��, ��� �ʱ�ȭ�� ���� �迭 day�� �����Ͽ����ϴ�.
        int num;
        while(true) {
            try {
                System.out.print("������ �Է��ϼ���>>");
                num = sc.nextInt();//����ڷκ��� ������ �Է¹޽��ϴ�.
                if(num<0)//������ �ԷµǸ� ���α׷��� ����˴ϴ�.
                {
                    System.out.println("���α׷��� �����մϴ�...");
                    break;
                }
            } catch (InputMismatchException e) {//������ �Էµ��� �ʾ�����, ���� �߻� �ϵ��� �Ͽ����ϴ�.
                //System.out.println(e.getMessage());
                System.out.println("���! ���� �Է����� �ʾҽ��ϴ�.");
                sc.next();//�Է� ��Ʈ���� �ִ� ������ �ƴ� ��ū�� ������.
                continue;//���ܰ� �߻� �Ͽ��� ��(������ �Էµ��� �ʾ��� ��)�ٽ� while ���� ó������ ���ư����� �մϴ�.
            }
            System.out.println(day[num%7]);//����ڷκ��� �Է� ���� ������ 7(�迭 day�� ũ��)�� ���� �������� �ε����� �Ͽ� �迭 day�� ����� ���ڸ� ����մϴ�.
        }
        sc.close();//���������� Scanner�� �ݽ��ϴ�.
    }
}

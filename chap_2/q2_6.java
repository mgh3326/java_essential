import java.util.Scanner;

public class q2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;//num �Է� ���� ����
        System.out.print("1~99 ������ ������ �Է��ϼ���>> ");
        num = sc.nextInt();
        int first=num/10; //first �Էµ� ������ ù°�ڸ�
        int second=num%10; //second �Էµ� ������ ��°�ڸ�
        if (num > 99||num<1) {//�Էµ� ������ 1~99�� ������ ���� ���� ������ ���α׷��� ���� �ϵ��� �Ͽ����ϴ�.
            System.out.println("1~99 ������ ������ �ƴϹǷ� ���α׷��� �����մϴ�.");
        } else {
            if ((first==3||first==6||first==9)&&(second==3||second==6||second==9)) {//ù°�ڸ� ���ڿ� ��°�ڸ� ���ڰ� ��� (3,6,9) ������ ��, �ڼ� ¦¦�� ��� �ǵ��� �Ͽ����ϴ�.
                System.out.println("�ڼ�¦¦");
            } else if ((first==3||first==6||first==9)||(second==3||second==6||second==9)) {//ù°�ڸ� ���� Ȥ�� ��° �ڸ� ���� �� ������ �ϳ��� (3,6,9) ������ ��, �ڼ� ¦�� ��� �ǵ��� �Ͽ����ϴ�.
                System.out.println("�ڼ�¦");
            } else//���� �� ������ ���� ���� ���� ��, �ڼ� ������ ��� �ǵ��� �Ͽ����ϴ�.
                System.out.println("�ڼ�����");
        }
    }
}

// ����� �ѱ��� ¦�� �̷�� 2���� �迭�� �����,
// ����ڷκ��� ���� �ܾ �Է� �޾� �ѱ��� ����ϴ� ���α׷��� �ۼ��϶�.
// "exit"�� �Է� �ϸ� ���α׷��� �����϶�.
import java.util.Scanner;

public class q3_6 {
    public static void main(String[] args)
    {

        String eng[]={"student","love","java","happy","future"};// ¦�� �̷�� ���� �迭
        String kor[]={"�л�","���","�ڹ�","�ູ��","�̷�"};// ¦�� �̷�� �ѱ� �迭
        String var;
        int tmp;// exit �� �Է� ������, -2�� �Ǹ鼭 ���ᰡ �ǵ��� �Ͽ���, -1�̸� �迭�� ���� �ܾ �Էµ� ���� �Ͽ���, 1~5�� �迭�� ���° ������ ����ϴ� ������ ���˴ϴ�.
        Scanner sc = new Scanner(System.in);
        while(true) {
            tmp = -1;
            System.out.print("���� �ܾ �Է��ϼ���>>");
            var = sc.next();// ����ڷκ��� ���� �ܾ �Է� �޽��ϴ�.
            for (int i = 0; i < eng.length; i++) {
                if (var.equals(eng[i]))// �迭�� ���� �ܾ �ִ� ���
                    tmp = i;
                else if(var.equals("exit"))//exit �� �ԷµǴ� ���
                    tmp=-2;

            }
            if (tmp == -1)
                System.out.println("�׷� ���� �ܾ �����ϴ�.");
            else if(tmp==-2)
            {
                System.out.println("���α׷��� �����մϴ�.");
                break;// ���� �ϱ� ���� break �� ����Ͽ����ϴ�.
            }
            else {
                System.out.println(kor[tmp]); // �ѱ� �ܾ� ���
            }
        }
        sc.close();//���������� Scanner�� �ݽ��ϴ�.
    }
}

//��ǻ�Ϳ� ������� ���������� ���� ���α׷��� �ۼ��϶�.
//����ڰ� �Է��ϰ� <Enter> Ű�� ġ��,
//��ǻ�ʹ� �����ϰ� ����, ����, �� �� �ϳ��� �����Ѵ�.
//�׸��� ���� �̰���� ����Ѵ�.
//"�׸�"�� �Է��ϸ� ������ �����Ѵ�.
import java.util.Scanner;

public class q3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[] = {"����", "����", "��"};
        String var;
        int tmp;//0�� ���º� 1�� ������� �¸�, 2�� ��ǻ���� �¸�, -1�� �迭�� ������ ���� ���� �ٸ� ���� �ԷµǴ� ���� ��� �Ͽ����ϴ�.
        int n;
        System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
        while (true) {
            System.out.print("���� ���� ��!>>");
            var=sc.next();//����ڷ� ���� �Է� �޽��ϴ�.
            n = (int) (Math.random() * 3);//0,1,2�߿� ���� ���� ����
           if((var.equals("����")&&str[n].equals("��"))||//����ڰ� ��ǻ�͸� �̱�� ���
              (var.equals("����")&&str[n].equals("����"))||
              (var.equals("��")&&str[n].equals("����")))
             tmp=1;
           else if((var.equals("����")&&str[n].equals("����"))||//����ڿ� ��ǻ�� ���� ���
                   (var.equals("����")&&str[n].equals("����"))||
                   (var.equals("��")&&str[n].equals("��")))
            tmp=0;
           else if((var.equals("����")&&str[n].equals("����"))||//��ǻ�Ͱ� ����ڸ� �̱�� ���
                   (var.equals("����")&&str[n].equals("��"))||
                   (var.equals("��")&&str[n].equals("����")))
               tmp=2;
            else if(var.equals("�׸�"))//�׸��� �ԷµǴ� ���
            {
                System.out.println("���α׷��� �����մϴ�.");
                break;//break �� ���ؼ� ���� �ϵ��� �Ͽ����ϴ�.
            }
            else
                tmp=-1;//���� ���� �� �׸��� ������ �ٸ� ���ڿ��� �ԷµǴ� ���
            System.out.print("����� = "+var+", ��ǻ�� = "+str[n]+", ");
            if(tmp==0)
            {
                System.out.println("���º� �Դϴ�.");
            }
            else if(tmp==1)
                System.out.println("����ڰ� �̰���ϴ�.");
            else if(tmp==2)
                System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
            //else if(tmp==-1)
            else//���� ���� �� �׸��� ������ �ٸ� ���ڿ��� �ԷµǴ� ���
            {
                System.out.println("\n���� ���� �� Ȥ�� �׸��� �Է����ּ���.");
            }
        }
        sc.close();
    }
}
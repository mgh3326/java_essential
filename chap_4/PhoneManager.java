//�̸�(name)�� ��ȭ��ȣ(tel) �ʵ�, ������ �� �ʿ��� �޼ҵ带 ���� Phone Ŭ������ �ۼ��ϰ�,
// ���� ���� ��ʿ� ���� �۵��ϵ��� main()�� ���� PhoneManager Ŭ������ �ۼ��϶�.
// �� ����� ��ȭ��ȣ�� �ϳ��� Phone ��ü�� �ٸ���.
import java.util.Scanner;

//������ �̸�(name �ʵ�)�� ��ȭ��ȣ(tel �ʵ�)�� ���� Phone Ŭ�����̴�.
//�̸��� ��ȭ��ȣ�� �Է¹޾� 2���� Phone ��ü�� �����ϰ�,
//����ϴ� main �޼ҵ带 �ۼ��϶�.
class Phone {
    private String name, tel;

    public Phone(String name, String tel) {//name�� tel�� �Ű������� ����ϴ� ������
        this.name = name;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }//name�� return�ϴ� �뵵�� �Լ�

    public String getTel() {
        return tel;
    }//tel�� return�ϴ� �뵵�� �Լ�


}
public class PhoneManager {
    public static void main(String[] args)
    {
        System.out.print("�ο���>>");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String name[]=new String[num];
        String tel[]=new String[num];
        Phone [] p;
        p=new Phone[5];
        for(int i=0;i<num;i++)
        {
            System.out.print("�̸��� ��ȭ��ȣ(��ȣ�� ���������� �Է�)>>");
            name[i]=sc.next();
            tel[i]=sc.next();
            p[i]=new Phone(name[i],tel[i]);//��ü �迭�� ����Ͽ� name1,tel1�� ����ϴ� PhoneŬ������ p[i]��� �ν��Ͻ� ����
        }
        System.out.println("����Ǿ����ϴ�...");
        while(true)
        {
            Boolean tmp=false;
            System.out.print("�˻��� �̸�>>");
            String word=sc.next();
            if(word.equals("exit"))
            {
                System.out.println("���α׷��� ����Ǿ����ϴ�.");
                break;
            }
            else
            {
                for(int i=0;i<num;i++)
                {
                    if(word.equals(p[i].getName()))//��ȣ�� �����Ѵٸ�
                    {
                        System.out.println(p[i].getName()+"�� ��ȣ�� "+p[i].getTel()+"�Դϴ�.");
                        tmp=true;
                        break;
                    }
                }
                if(tmp)//��ȣ�� �����Ѵٸ�(���� �ݺ����̶� tmp ��� ������ ����߽��ϴ�.
                    continue;
                System.out.println(word+" �� �����ϴ�.");//��ȣ�� ���� ��,
            }
        }
    }
}

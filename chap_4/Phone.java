import java.util.Scanner;

//������ �̸�(name �ʵ�)�� ��ȭ��ȣ(tel �ʵ�)�� ���� Phone Ŭ�����̴�.
//�̸��� ��ȭ��ȣ�� �Է¹޾� 2���� Phone ��ü�� �����ϰ�,
//����ϴ� main �޼ҵ带 �ۼ��϶�.
public class Phone {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�̸��� ��ȭ��ȣ �Է� >>");
        String name1 = sc.next();
        String tel1 = sc.next();
        System.out.print("�̸��� ��ȭ��ȣ �Է� >>");
        String name2 = sc.next();
        String tel2 = sc.next();
        Phone p1 = new Phone(name1, tel1);//name1,tel1�� ����ϴ� PhoneŬ������ p1�̶�� �ν��Ͻ� ����
        Phone p2 = new Phone(name2, tel2);//name1,tel1�� ����ϴ� PhoneŬ������ p2��� �ν��Ͻ� ����
        System.out.println(p1.getName()+"�� ��ȣ "+p1.getTel());
        System.out.println(p2.getName()+"�� ��ȣ "+p2.getTel());
    }
}
import java.util.Scanner;

public class q2_2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x,y;//����ڷ� ���� ���� x,y ��ǥ�� �����߽��ϴ�.
        int xUnderLimit=50,yUnderLimit=50,xOverLimit=100,yOverLimit=100;//x,y ��ǥ�� �Ѱ踦 ���ϴ� ������ �����ϰ� ���� �Է����־����ϴ�.
        System.out.print("�� (x,y)�� ��ǥ�� �Է��ϼ���>> ");
        x=sc.nextInt();//x,y ��ǥ�� ���� ���� �Է� �޽��ϴ�.
        y=sc.nextInt();
        System.out.print("�� ("+x+","+y+")�� (50, 50)�� (100,100)�� �簢�� ���� ");
        if((x>xUnderLimit&&x<xOverLimit&&y>yUnderLimit&&y<yOverLimit))//�簢���� ����  ���� ���� ==> x,y ������ x,y ��ǥ�� �Ѱ�(50,50),(100,100)���̿� �ִ���
        {//�簢�� ���� ��ǥ�� �ִ� ��쿡�� ���ο� ���� ���� �߽��ϴ�.
            System.out.println("�ֽ��ϴ�.");
        }
        else
            System.out.println("�����ϴ�.");
    }
}

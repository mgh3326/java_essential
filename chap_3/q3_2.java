//���� 10���� �Է� �޾� �迭�� ������ ��, �迭�� �˻��Ͽ� 3�� ����� ��� ����ϴ� ���α׷��� �ۼ��϶�.
import java.util.Scanner;
public class q3_2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];//���� 10���� �Է� ���� �迭�� ���� �Ͽ����ϴ�.
        System.out.print("���� 10�� �Է�>>");
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();//���� 10���� �迭�� �����մϴ�.
        }
        for(int i=0;i<10;i++)
        {
            if(arr[i]%3!=0)//�迭�� �˻��Ͽ� 3�� ����� ��󳻼� ����մϴ�.
                continue;//3�� ����� �ƴϸ� for ������ ���ư����� continue �� ����Ͽ����ϴ�.
            System.out.print(arr[i]+" ");
        }
        sc.close();//���������� Scanner�� �ݽ��ϴ�.
    }
}

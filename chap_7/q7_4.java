import java.util.*;

public class q7_4 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>(10);//ũ�Ⱑ 10�� ���� ���� �ٷ�� ���׸� ���� ����
        Scanner sc=new Scanner(System.in);

        System.out.print("2000~2009����� 1�� ������ Ű(cm)�� �Է�\n>>");
        for(int i=0;i<v.capacity();i++)//10���� ũ�⸦ ���Ϳ� �Է�
        {
            v.add(sc.nextInt());
        }
        int max=v.get(1)-v.get(0);//���� 1��° ���� 0��° ���� ���̸� max�� �ʱⰪ���μ� max ����
        int val=0;
        for(int i=1;i<v.size()-1;i++)
        {
            if(max<v.get(i+1)-v.get(i)) {
                //���� i ���϶� v.get(i+1)-v.get(i)�� max���� ũ�ٸ� v.get(i+1)-v.get(i)�� max������ �ϰ�
                //i���� �ݺ��� �ۿ��� ���� ���� val ������ �־����ϴ�.
                max = v.get(i + 1) - v.get(i);
                val=i;
            }
        }
            System.out.println("���� Ű�� ���� �ڶ� �⵵�� "+(val+2000)+"�� "+max+"cm");//��¹�
    }
    }


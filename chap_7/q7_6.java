import java.util.*;

public class q7_6 {
    public static void main(String[] args) {
        HashMap<String, Integer> point = new HashMap<String, Integer>();//�̸��� ����Ʈ�� �Է��� �ܾ��� ������ �ϴ� point �̸��� �� HashMap �÷��� ����
        Scanner sc=new Scanner(System.in);
        String name;//�̸�
        int num;//����Ʈ
        System.out.println("** ����Ʈ ���� ���α׷��Դϴ�. **");
        while(true) {
            System.out.print("�̸��� ����Ʈ �Է�>>");
            name=sc.next();//�̸� �Է�
            if(name.equals("exit"))//���� �̸��� exit�� �ԷµǸ� while���� ������ ���α׷��� ����ǰ� �Ͽ����ϴ�.
                break;
            num=sc.nextInt();//����Ʈ �Է�
            if(point.containsKey(name))//���� point HashMap�� key �߿��� �̸� name�� �����Ѵٸ�
                // num�� ��(����Ʈ) ���� ���������� �Ͽ����ϴ�.
                num+=point.get(name);
            point.put(name,num);
            //potin �ؽøʿ� ��� �ִ� ��� (key,value) �� ���
            Set<String> keys=point.keySet();//��� Ű�� Set �÷��ǿ� �޾ƿ�
            Iterator<String> it=keys.iterator();//Set�� �����ϴ� iterator ����
            while(it.hasNext()) {
                String key = it.next();//Ű
                int value = point.get(key);//��
                System.out.print("(" + key + "," + value + ")");//��¹�
            }
            System.out.println();
        }
    }
}
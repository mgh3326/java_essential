interface AdderInterface{
    int add(int x,int y);//x�� y�� �� ����
    int add(int n);//1���� n ������ ���� �� ����, n�� 0���� ū ���� ����
}
class Myadder implements AdderInterface { //AdderInterface �������̽��� ���
    public int add(int x, int y) {
        return x + y;
    } 
    public int add(int n) {
        int temp=0;
        for(int i=0;i<n;i++)
        {
            temp+=i+1;
        }
        return temp;
    }
    public static void main(String[] args){
        Myadder adder=new Myadder();//adder ��� ��ü ����
        System.out.println(adder.add(5,10));
        System.out.println(adder.add(10));
    }
}
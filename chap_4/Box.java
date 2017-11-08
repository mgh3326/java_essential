public class Box{
    private int width,height;//�ڽ��� �ʺ�� ����
    private char fillChar;//�ڽ��� �׸��� �� ����ϴ� ����
    public Box(){//�Ű� ���� ���� ������, 10x1�� �ڽ� ����
    /*this.width=10;
    this.height=1;*/
    this(10,1);
    }
    public Box(int width,int height){//�ʺ�,������ �� �Ű������� ���� ������
    this.width=width;//this ���۷����� �̿��϶�.
    this.height=height;//this ���۷����� �̿��϶�.
    }
    public void draw(){//�ڽ��� �׸��� �޼ҵ�
        for(int i=0;i<height;i++){
        for(int j=0;j<width;j++)
        {
            System.out.print(fillChar);
        }
        System.out.println();
        }
    }
    public void fill(char c){//�ڽ��� �׸��µ� ����ϴ� ���� ����
    fillChar=c;
    }
    public static void main(String[] args){
        Box a=new Box();
        Box b=new Box(20,3);
        a.fill('*');
        b.fill('%');
        a.draw();
        b.draw();
    }
}

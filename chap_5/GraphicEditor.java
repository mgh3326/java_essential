import java.util.Scanner;

abstract class Shape{//�߻� Ŭ����
    public abstract void draw();
}
class Line extends Shape{
    public void draw(){//�޼ҵ� �������̵�
        System.out.println("Line");
    }
}
class Rect extends Shape{
    public void draw(){//�޼ҵ� �������̵�
        System.out.println("Rect");
    }
}
class Circle extends Shape{
    public void draw(){//�޼ҵ� �������̵�
        System.out.println("Circle");
    }
}
public class GraphicEditor {
    static void paint(Shape p){//shape�� ��� ���� ��ü���� �Ű� ������ �Ѿ� �ü� ����
        p.draw();//p�� ����Ű�� ��ü�� �������̵��� draw() ȣ��. ���� ���ε�
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;//switch case ������ ���Ǵ� ����
        boolean end=false;//���� �ݺ����� Ż���ϱ� ���� ���Ǵ� ����
        Shape[] sh;// ��ü �迭 sh
        Shape[] temp;//��ü �迭 sh�� ���� �����ϱ� ���� �ӽ������� ���� �����ϰ� �Ǵ� ��ü �迭
        int size=0;//�迭�� ũ�⿡ ��� �Ǵ� ����
        sh=new Shape[1];//���� ũ�� 1�� ��ü �迭 ����
        while(true)
        {
            System.out.print("���� (1), ���� (2), ��� ���� (3), ���� (4) >>");
            num=sc.nextInt();
            switch (num)
            {
                case 1://����
                    System.out.print("���� ���� Line(1), Rect(2), Circle(3)>>");
                    num=sc.nextInt();
                    switch (num)//������ ���� ��ü �迭�� ��ü�� �Է�
                    {
                        case 1: sh[size]=new Line();
                            break;
                        case 2: sh[size]=new Rect();
                            break;
                        case 3: sh[size]=new Circle();
                            break;
                        default:
                            System.out.println("1,2,3 �߿��� �Է� ���ּ���.");
                            continue;//�ٸ� ���� �Է� �Ǵ� ��쿡 �ٽ� ���� �Է� �޵��� �Ͽ����ϴ�.
                    }
                    size++;//�迭�� ũ�⸦ �÷��ݴϴ�.
                    temp=new Shape[size];//�迭�� ���� �ӽ������� ����
                    for(int i=0;i<size;i++)
                    {
                        temp[i]=sh[i];
                    }
                    sh=new Shape[size+1];//��ü �迭�� size +1 ũ��� ���� ���� ����
                    for(int i=0;i<size;i++)
                    {
                        sh[i]=temp[i];
                    }
                    break;
                case 2://����
                    System.out.print("������ ������ ��ġ>>");
                    num=sc.nextInt();
                    if(num>size)//����
                    {
                        System.out.println("������ �� �����ϴ�.");
                        break;
                    }
                    for(int i=num;i<size;i++)//���� �Ϸ��� �� �κк��� ���� ������ ���ʴ�� �־ ���� �Ϸ��� ���� ���� �ϵ��� �Ͽ����ϴ�.
                    {
                        sh[i-1]=sh[i];
                    }
                    size--;//ũ�⸦ �ϳ� ���Դϴ�.
                    break;
                case 3://��� ����
                    for(int i=0;i<size;i++)//���
                    {
                        paint(sh[i]);
                    }
                    break;
                case 4:System.out.println("����");
                    end=true;
                    break;
                default:
                    break;
            }
            if(end)//�����ΰ�?
                break;
        }
    }
}

class Point{//2���� ���� �� ���� ǥ���ϴ� Point Ŭ����
    private int x,y;
    public Point(int x,int y) { this.x=x; this.y=y;}//������
    public int getX() {return x;}//x�� ��ȯ �ϴ� �Լ�
    public int getY() {return y;}//y�� ��ȯ �ϴ� �Լ�
    protected void move(int x,int y){this.x=x; this.y=y;}//���� �̵������ִ� �Լ�
}
public class ColorPoint extends Point{//Point�� ��� �޽��ϴ�.
    private String color;
    ColorPoint(int x,int y,String color)//������
    {
        super(x,y);
        this.color=color;
    }
    public String getColor() {return color;}//���� ������ ��ȯ���ִ� �Լ�
    public void setColor(String color)
    {
        this.color=color;
    }//���� ������ �ٲ��ִ� �Լ�
    public void setPoint(int x,int y)//���� �̵������ִ� �Լ�
    {
        move(x,y);
    }
    private void show()
    {
        System.out.println(getColor()+"������ ("+getX()+","+getY()+")");
    }
    public static void main(String[] args)
    {
        ColorPoint cp=new ColorPoint(5,5,"YELLOW");
        cp.setPoint(10,20);
        cp.setColor("GREEN");
        cp.show();
    }
}

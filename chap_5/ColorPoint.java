class Point{//2차원 상의 한 점을 표현하는 Point 클래스
    private int x,y;
    public Point(int x,int y) { this.x=x; this.y=y;}//생성자
    public int getX() {return x;}//x를 반환 하는 함수
    public int getY() {return y;}//y를 반환 하는 함수
    protected void move(int x,int y){this.x=x; this.y=y;}//점을 이동시켜주는 함수
}
public class ColorPoint extends Point{//Point를 상속 받습니다.
    private String color;
    ColorPoint(int x,int y,String color)//생성자
    {
        super(x,y);
        this.color=color;
    }
    public String getColor() {return color;}//색의 변수를 반환해주는 함수
    public void setColor(String color)
    {
        this.color=color;
    }//색의 변수를 바꿔주는 함수
    public void setPoint(int x,int y)//점을 이동시켜주는 함수
    {
        move(x,y);
    }
    private void show()
    {
        System.out.println(getColor()+"색으로 ("+getX()+","+getY()+")");
    }
    public static void main(String[] args)
    {
        ColorPoint cp=new ColorPoint(5,5,"YELLOW");
        cp.setPoint(10,20);
        cp.setColor("GREEN");
        cp.show();
    }
}

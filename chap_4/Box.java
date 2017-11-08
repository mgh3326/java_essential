public class Box{
    private int width,height;//박스의 너비와 높이
    private char fillChar;//박스를 그리는 데 사용하는 문자
    public Box(){//매개 변수 없는 생성자, 10x1의 박스 생성
    /*this.width=10;
    this.height=1;*/
    this(10,1);
    }
    public Box(int width,int height){//너비,높이의 두 매개변수를 가진 생성자
    this.width=width;//this 레퍼런스를 이용하라.
    this.height=height;//this 레퍼런스를 이용하라.
    }
    public void draw(){//박스를 그리는 메소드
        for(int i=0;i<height;i++){
        for(int j=0;j<width;j++)
        {
            System.out.print(fillChar);
        }
        System.out.println();
        }
    }
    public void fill(char c){//박스를 그리는데 사용하는 문자 설정
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

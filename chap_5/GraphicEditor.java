import java.util.Scanner;

abstract class Shape{//추상 클래스
    public abstract void draw();
}
class Line extends Shape{
    public void draw(){//메소드 오버라이딩
        System.out.println("Line");
    }
}
class Rect extends Shape{
    public void draw(){//메소드 오버라이딩
        System.out.println("Rect");
    }
}
class Circle extends Shape{
    public void draw(){//메소드 오버라이딩
        System.out.println("Circle");
    }
}
public class GraphicEditor {
    static void paint(Shape p){//shape을 상속 받은 객체들이 매개 변수로 넘어 올수 있음
        p.draw();//p가 가리키는 객체에 오버라이딩한 draw() 호출. 동적 바인딩
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;//switch case 문에서 사용되는 변수
        boolean end=false;//이중 반복문을 탈출하기 위해 사용되는 변수
        Shape[] sh;// 객체 배열 sh
        Shape[] temp;//객체 배열 sh를 새로 생성하기 전에 임시적으로 값을 저장하게 되는 객체 배열
        int size=0;//배열의 크기에 사용 되는 변수
        sh=new Shape[1];//먼저 크기 1로 객체 배열 생성
        while(true)
        {
            System.out.print("삽입 (1), 삭제 (2), 모두 보기 (3), 종료 (4) >>");
            num=sc.nextInt();
            switch (num)
            {
                case 1://삽입
                    System.out.print("도형 종류 Line(1), Rect(2), Circle(3)>>");
                    num=sc.nextInt();
                    switch (num)//종류에 따라 객체 배열에 객체가 입력
                    {
                        case 1: sh[size]=new Line();
                            break;
                        case 2: sh[size]=new Rect();
                            break;
                        case 3: sh[size]=new Circle();
                            break;
                        default:
                            System.out.println("1,2,3 중에서 입력 해주세요.");
                            continue;//다른 값이 입력 되는 경우에 다시 값을 입력 받도록 하였습니다.
                    }
                    size++;//배열의 크기를 늘려줍니다.
                    temp=new Shape[size];//배열의 값을 임시적으로 저장
                    for(int i=0;i<size;i++)
                    {
                        temp[i]=sh[i];
                    }
                    sh=new Shape[size+1];//객체 배열을 size +1 크기로 으로 새로 생성
                    for(int i=0;i<size;i++)
                    {
                        sh[i]=temp[i];
                    }
                    break;
                case 2://삭제
                    System.out.print("삭제할 도형의 위치>>");
                    num=sc.nextInt();
                    if(num>size)//오류
                    {
                        System.out.println("삭제할 수 없습니다.");
                        break;
                    }
                    for(int i=num;i<size;i++)//삭제 하려는 값 부분부터 다음 값들을 차례대로 넣어서 삭제 하려는 값을 삭제 하도록 하였습니다.
                    {
                        sh[i-1]=sh[i];
                    }
                    size--;//크기를 하나 줄입니다.
                    break;
                case 3://모두 보기
                    for(int i=0;i<size;i++)//출력
                    {
                        paint(sh[i]);
                    }
                    break;
                case 4:System.out.println("종료");
                    end=true;
                    break;
                default:
                    break;
            }
            if(end)//종료인가?
                break;
        }
    }
}

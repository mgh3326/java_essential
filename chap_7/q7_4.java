import java.util.*;

public class q7_4 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>(10);//크기가 10인 정수 값만 다루는 제네릭 벡터 생성
        Scanner sc=new Scanner(System.in);

        System.out.print("2000~2009년까지 1년 단위로 키(cm)를 입력\n>>");
        for(int i=0;i<v.capacity();i++)//10개의 크기를 벡터에 입력
        {
            v.add(sc.nextInt());
        }
        int max=v.get(1)-v.get(0);//먼저 1번째 값과 0번째 값의 차이를 max의 초기값으로서 max 선언
        int val=0;
        for(int i=1;i<v.size()-1;i++)
        {
            if(max<v.get(i+1)-v.get(i)) {
                //만약 i 값일때 v.get(i+1)-v.get(i)가 max보다 크다면 v.get(i+1)-v.get(i)을 max값으로 하고
                //i값을 반복문 밖에서 쓰기 위해 val 값으로 주었습니다.
                max = v.get(i + 1) - v.get(i);
                val=i;
            }
        }
            System.out.println("가장 키가 많이 자란 년도는 "+(val+2000)+"년 "+max+"cm");//출력문
    }
    }


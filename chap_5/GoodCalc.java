package app;//app 패키지
import lib.Calculator;//lib 패키지에 있는 Calculator 을 import 합니다.
public class GoodCalc extends Calculator{//Calculator 를 상속 받습니다.
    public int add(int a,int b){
        return a+b;
    }//합
    public int subtract(int a,int b){
        return a-b;
    }//차
    public double average(int[] a){//평균
        double sum=0;
        for (int i=0;i<a.length;i++)
            sum += a[i];
        return sum/a.length;
    }
    public static void main(String[] args){
        GoodCalc c=new GoodCalc();
        System.out.println(c.add(2,3));
        System.out.println(c.subtract(2,3));
        System.out.println(c.average(new int [] {2,3,4,}));
    }

}
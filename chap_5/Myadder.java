interface AdderInterface{
    int add(int x,int y);//x와 y의 합 리턴
    int add(int n);//1에서 n 까지의 정수 합 리턴, n은 0보다 큰 수로 가정
}
class Myadder implements AdderInterface { //AdderInterface 인터페이스를 상속
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
        Myadder adder=new Myadder();//adder 라는 객체 생성
        System.out.println(adder.add(5,10));
        System.out.println(adder.add(10));
    }
}
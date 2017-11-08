//정수 10개를 입력 받아 배열에 저장한 후, 배열을 검색하여 3의 배수만 골라 출력하는 프로그램을 작성하라.
import java.util.Scanner;
public class q3_2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];//정수 10개를 입력 받을 배열을 생성 하였습니다.
        System.out.print("정수 10개 입력>>");
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();//정수 10개를 배열에 저장합니다.
        }
        for(int i=0;i<10;i++)
        {
            if(arr[i]%3!=0)//배열을 검색하여 3의 배수만 골라내서 출력합니다.
                continue;//3의 배수가 아니면 for 문으로 돌아가도록 continue 를 사용하였습니다.
            System.out.print(arr[i]+" ");
        }
        sc.close();//최종적으로 Scanner를 닫습니다.
    }
}

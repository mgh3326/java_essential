import java.util.Scanner;

class q2_4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int money,var50000,var10000,c3,var1000,var100,var10;//money 돈의 액수를 뜻하는 변수이며, var50000은 50000원권의 갯수입니다. 그리고 var 뒤에 있는 숫자가 있는 변수는 숫자의 지폐 혹은 동전의 갯수를 뜻합니다.
        System.out.print("돈의 액수를 입력하세요>>");
        money=sc.nextInt();//money 라는 변수를 사용자로 부터 입력 받습니다.
        var50000=money/50000;//var50000 이라는 변수는 돈의 액수를 50000으로 나눈 몫의 값을 갖게 됩니다.
        money%=50000;//money 변수의 값은 50000원권의 갯수를 제외 시켜주기 위해 50000 으로 나눠준 나머지의 값을 갖도록 하였습니다.
        var10000=money/10000;//다른 돈의 갯수도 50000원권의 갯수를 구하는 방법과 동일합니다.
        money%=10000;
        c3=money/1000;
        money%=1000;
        var1000=money/500;
        money%=500;
        var100=money/100;
        money%=100;
        var10=money/10;
        money%=10;//money 의 값은 처음의 입력된 돈의 액수의 1의자리와 동일해지므로, 1원의 갯수와 동일하기 때문에, money 변수 자체를 1원의 갯수의 변수로 이용하였습니다.
        System.out.println("오만원 : "+var50000+"개, 만원 : "+var10000+"개, 천원 : "+c3+"개, 500원 : "+var1000+"개, 100원 : "+var100+"개, 10원 :"+var10+"개, 1원 : "+money+"개");

    }
}

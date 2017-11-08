import java.util.Scanner;

//다음은 이름(name 필드)과 전화번호(tel 필드)를 가진 Phone 클래스이다.
//이름과 전화번호를 입력받아 2개의 Phone 객체를 생성하고,
//출력하는 main 메소드를 작성하라.
public class Phone {
    private String name, tel;

    public Phone(String name, String tel) {//name과 tel을 매개변수로 사용하는 생성자
        this.name = name;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }//name을 return하는 용도의 함수

    public String getTel() {
        return tel;
    }//tel을 return하는 용도의 함수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름과 전화번호 입력 >>");
        String name1 = sc.next();
        String tel1 = sc.next();
        System.out.print("이름과 전화번호 입력 >>");
        String name2 = sc.next();
        String tel2 = sc.next();
        Phone p1 = new Phone(name1, tel1);//name1,tel1을 사용하는 Phone클래스의 p1이라는 인스턴스 생성
        Phone p2 = new Phone(name2, tel2);//name1,tel1을 사용하는 Phone클래스의 p2라는 인스턴스 생성
        System.out.println(p1.getName()+"의 번호 "+p1.getTel());
        System.out.println(p2.getName()+"의 번호 "+p2.getTel());
    }
}
//이름(name)과 전화번호(tel) 필드, 생성자 및 필요한 메소드를 가진 Phone 클래스를 작성하고,
// 다음 실행 사례와 같이 작동하도록 main()을 가진 PhoneManager 클래스를 작성하라.
// 한 사람의 전화번호는 하나의 Phone 객체로 다른다.
import java.util.Scanner;

//다음은 이름(name 필드)과 전화번호(tel 필드)를 가진 Phone 클래스이다.
//이름과 전화번호를 입력받아 2개의 Phone 객체를 생성하고,
//출력하는 main 메소드를 작성하라.
class Phone {
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


}
public class PhoneManager {
    public static void main(String[] args)
    {
        System.out.print("인원수>>");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String name[]=new String[num];
        String tel[]=new String[num];
        Phone [] p;
        p=new Phone[5];
        for(int i=0;i<num;i++)
        {
            System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>");
            name[i]=sc.next();
            tel[i]=sc.next();
            p[i]=new Phone(name[i],tel[i]);//객체 배열을 사용하여 name1,tel1을 사용하는 Phone클래스의 p[i]라는 인스턴스 생성
        }
        System.out.println("저장되었습니다...");
        while(true)
        {
            Boolean tmp=false;
            System.out.print("검색할 이름>>");
            String word=sc.next();
            if(word.equals("exit"))
            {
                System.out.println("프로그램이 종료되었습니다.");
                break;
            }
            else
            {
                for(int i=0;i<num;i++)
                {
                    if(word.equals(p[i].getName()))//번호가 존재한다면
                    {
                        System.out.println(p[i].getName()+"의 번호는 "+p[i].getTel()+"입니다.");
                        tmp=true;
                        break;
                    }
                }
                if(tmp)//번호가 존재한다면(이중 반복문이라서 tmp 라는 변수를 사용했습니다.
                    continue;
                System.out.println(word+" 이 없습니다.");//번호가 없을 때,
            }
        }
    }
}

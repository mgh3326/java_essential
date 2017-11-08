import java.util.*;

public class q7_6 {
    public static void main(String[] args) {
        HashMap<String, Integer> point = new HashMap<String, Integer>();//이름과 포인트를 입력을 단어의 쌍으로 하는 point 이름을 한 HashMap 컬렉션 생성
        Scanner sc=new Scanner(System.in);
        String name;//이름
        int num;//포인트
        System.out.println("** 포인트 관리 프로그램입니다. **");
        while(true) {
            System.out.print("이름과 포인트 입력>>");
            name=sc.next();//이름 입력
            if(name.equals("exit"))//만약 이름에 exit이 입력되면 while문을 나가고 프로그램이 종료되게 하였습니다.
                break;
            num=sc.nextInt();//포인트 입력
            if(point.containsKey(name))//만약 point HashMap의 key 중에서 이름 name이 존재한다면
                // num의 값(포인트) 값이 더해지도록 하였습니다.
                num+=point.get(name);
            point.put(name,num);
            //potin 해시맵에 들어 있는 모든 (key,value) 쌍 출력
            Set<String> keys=point.keySet();//모든 키를 Set 컬렉션에 받아옴
            Iterator<String> it=keys.iterator();//Set에 접근하는 iterator 리턴
            while(it.hasNext()) {
                String key = it.next();//키
                int value = point.get(key);//값
                System.out.print("(" + key + "," + value + ")");//출력문
            }
            System.out.println();
        }
    }
}
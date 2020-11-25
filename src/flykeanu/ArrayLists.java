package flykeanu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
ArrayList
 동적배열의 한 종류
 List 인터페이스르 구현해서 만든 컬렉션 프레임워크는
 각 요소의 저장순서가 유지되며
 중복으로 데이터를 저장할 수 있다
 크기가 늘어나면 새로운 배열을 생성하고
 기존의 요소들을 옮겨야 하는 복잡한 과정이 동반된다
 **/
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        //데이터 삽입 : add(대상)
        names.add("혜교");
        names.add("설현");
        names.add("수지");

        //특정 위치에 데이터를 추가하고 싶을때는 : add(위치, 대상)
        names.add(1, "수현");
        //요소 추출 : get(위치)
        System.out.println(names.get(1));

        //요소 수정 : set(위치, 대상)
        names.set(1, "윤아");
        System.out.println(names.get(1));

        //요소삭제 : remove(위치)
        names.remove(1);
        System.out.println(names.get(1));

        //요소 모두 삭제 : clear()
        /**
         데이터 검색하기
         배열에서 우ㅝㄴ하는 데이터를 찾는 방법은 2가지가 있다
         위치로 찾음 : contains, indexOf
         **/

        String[] game = {"스타크래프트", "디아블로", "워크래프트", "토탈워삼국"};

        // ArrayLists<String> games = (ArrayLists<String>) Arrays.asList(game);
        //실행시 다운캐스팅 오류발생, 문법에는 문제없음
        List<String> games = Arrays.asList(game);
        System.out.println(games);
        /**
         일반배열을 동적배열로 변환하려면
         Arrays 클래스와 asList 메서드를 활용한다
         **/
        /**
         컬렉션 자료구조에 저장된 데이터를 출력하려면
         foreach 구문을 사용한다
         **/
        for (String name : names) {
            System.out.println(name);
        }
        /**
         games 동적배열에서 '스타크래프트' 를 찾아봄
         **/
        for (int i = 0; i < games.size(); ++i) {
            if (games.get(i).equals("토탈워삼국")) {       //위치에 중점을 두고 찾음
                System.out.println((i + 1) + "번째에서 찾음");
                break;
            }
        }
        for (String g : games) {
            if (g.equals("디아블로")) {
                System.out.println("데이터 찾음");       //위치보다는 존재유무 확인
                break;
            }
        }
        if (games.contains("디아블로")) {
            System.out.println("데이터를 찾음!!!");
            //값 기반 검색
        }
        System.out.println(games.indexOf("디아블로"));
        //위치기반 검색

        /**
         게임정보에 대한 객체 생성
         **/
        GameInfo g1 = new GameInfo("디아블로", 35000);
        GameInfo g2 = new GameInfo("스타크래프트", 45000);
        GameInfo g3 = new GameInfo("워크래프트", 55000);
        GameInfo g4 = new GameInfo("토탈워삼국", 65000);

        //생성한 객체들을 동적배열에 저장한다
        List<GameInfo> games2 = new ArrayList<>();
        games2.add(g1);
        games2.add(g2);
        games2.add(g3);
        games2.add(g4);
        //'스타크래프트' 요소를 출력
        System.out.println(games2.get(1));
        /**주소값인 참조값으로만 저장되어 있기 때문에 주소출력됨
         그러므로 GameInfo 객체의 주소가 저장된다
         따라서 GameInfo 객체의 실제값을 출력하려면
         대상.변수명 OR 대상.getter를 이용해야 한다
         **/
        System.out.println(games2.get(1).name);
        System.out.println(games2.get(1).price);

        /**
         특정 요소를 검색하는 코드를 4가지 버전
         (for, foreach, contains, indexOf)
         으로 작성해보기
         **/
        for (int j = 0; j < games2.size(); ++j) {
            if (games2.get(j).name.equals("워크래프트")) {       //위치에 중점을 두고 찾음
                System.out.println((j + 1) + "번째에서 찾음");
                break;


            }
        }
        for (GameInfo shg : games2) {
            if (shg.name.equals("디아블로")) {
                System.out.println("데이터 찾음");       //위치보다는 존재유무 확인
                break;
            }
        }
        for (GameInfo shg : games2) {
            if (shg.name.contains("토탈워삼국")) {
                System.out.println("데이터를 찾음!!!");}
                //값 기반 검색
            }
            for (GameInfo shg : games2) {
                if (shg.name.indexOf("토탈워삼국") >= 0) {
                    System.out.println(games2.indexOf("데이터를 찾았습니다!!!"));
                } break;
                //위치기반 검색
            }


    }
}
class GameInfo{
    String name;
    int price;

    public GameInfo(String name, int price) {
        this.name = name;
        this.price = price;
    }

}

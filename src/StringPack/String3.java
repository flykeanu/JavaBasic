package StringPack;
/**
문자열 처리시 유용한 기능을 제공하는 메서드
 문자열 검색
indexOf(문자) : 지정한 문자 찾기 = 위치값 출력
 * */
public class String3 {
    public static void main(String[] args) {
        String str = "Hello World";
        int idx = str.indexOf('W');
        System.out.println(idx);
        idx = str.indexOf('?');  //해당하는 문자가 없다면 -1 을 출력한다
        System.out.println(idx);
        idx = str.indexOf("Hello");
        System.out.println(idx);

        //문자열 길이 : length
        System.out.println(str.length());

        //lastIndexOf(문자) : 지정한 문자 찾기, 위치값 출력
        str = "Hello, Hi noon";
        idx = str.lastIndexOf('H');
        System.out.println(idx);
        idx = str.lastIndexOf('n');
        System.out.println(idx);

        //문자 바꾸기 : replace
        //replace(찾을 문자열, 바꿀 문자열)
        str = "A*B*C*D";
        str = str.replace("*", "-");
        System.out.println(str);

        // 문자열 분리 : split
        //지정한 문자를 기준으로 문자열을 나눠 배열에 저장
        str = "201350050, 김태희, 경기도, 1985.3.22, 컴퓨터, 504";
        String[] result = str.split(",");         //가로안에는 구분자를 넣는다
        /**
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
**/

        for(String data : result){    //향상된 for 문
            System.out.println(data);
            /**
            향상된 for 문을 사용하면 배열을 쉽게 다룰 수 있다
            **/

        }

        /**
        문자열 추출 : substring
         substring(시작위치, 끝위치 -1 )
         **/

        str = "Hello, World!!";

        String word = str.substring(7, 12);
        System.out.println(word);

        System.out.println("여기부터 주민번호로 성별 구하는 부분입니다.");

        String jumin = "123456-1234567";
        String gender = jumin.substring(7,8);

        switch(gender){
            case "1" :
                System.out.println("남"); break;
            case "2" :
                System.out.println("여"); break;
            case "3" :
                System.out.println("남"); break;
            case "4" :
                System.out.println("여"); break;
        }


        str = "871014-1734321";
        String MoF = str.substring(7,8);
        System.out.println(MoF);

        if(MoF.equals("1") || MoF.equals("3")){
            System.out.println("당신은 남자군요 후훗");
        }
        else{
                System.out.println("당신은 여성분이시군요");

            }

        str = "871014-4734321";
        String MorF = str.substring(7,8);
        System.out.println(MorF);

        if(MorF.equals("1") || MorF.equals("3")){
            System.out.println("당신은 남자군요 후훗");
        }
        else{
            System.out.println("당신은 여성분이시군요! 꺄아~");

        }


        //지정한 위치의 문자 추출 : charAt

        str = "123456-1234567";
        System.out.println(str.charAt(7));

        //정규표현식에 따라 일치여부 확인 : maches
        //정규식 사용 가능 메서드 : split, replaceAll
        int num = 1234567;
        String str1 = String.format("%d", num);
        String str2 = "1234567";
        System.out.println(str1.matches(str2));


        str1 = String.format("%d", num);
        System.out.println(str1.matches(str2));
        /**
        id 나 password 정의 규칙을 만들때, 주로 활용한다
         for a instance, 대문자, 특수문자, 숫자 섞으라고 할때 활용한다
         **/
         System.out.println(str1.matches("[a-z].+"));
        System.out.println(str1.matches("[0-9].+"));

        /**
        정규표현식 regular expression
         특정한 규칙을 가진 문자열의 집합을 표현하기 위해 사용하는 형식언어
         [] : 문자 집합이나 범위를 나타낸다
         - :  두 문자 사이의 범위 표현이다
        *  : 0번 이상 무한개의 임의 문자를 반복한다
        + :  1번 이상 무한개의 임의 문자를 반복한다
        ? :  0개 또는 1개의 임의 문자를 반복한다

         {n, m} : 최소 n개 이상 m개 이하 반복
         {0-9}{3,4} : 123, 987, 1234, 9876

         ^ : 문자열 시작
         ^123 : 123으로 시작하는 문자열을 의미
         $123 : 123으로 끝나는 문자열을 의미
         . : 임의의 문자 하나를 의미한다
         .{3,    } : 문자의 최소길이는 3이다라는 뜻
         .{3,   9 } :  문자의 최소길이는 3이고 최대 길이는 9 이다.



         [0-9] : 숫자 집합
         [a-zA-Z] : 영문자 집합
        [가-힣]  : 한글 집합


         **/
        /**
        다음 문자열이 전화번호 형식에 맞게 작성되었는지 알아보는
         정규식을 작성하세요
         010-123-4567,      010-1234-4567

        **/

        String phone = "010-123-4567";
        String pattern1 = "[0-9]{3}-[0-9]{3}-[0-9]{4}";
        System.out.println(phone.matches(pattern1));

        phone = "010-123-4567";
        System.out.println(phone.matches(pattern1));

        phone = "010-1234-4567";
        System.out.println(phone.matches(pattern1));

        /**
         사용자의 아이디가 다음규칙에 적합하게 작성되었는지 확인하는 프로그램

         영문자 소문자 1
         대문자 1
         숫자
         특수기호
        **/

        String pattern2 = "[a-zA-Z0-9!]+"; //특수문자는 집합이 없고 모두 수작업으로 넣어야한다

        String uid = "abc123!XYZ";
        System.out.println(uid.matches(pattern2));

        uid = "123jkl";
        System.out.println(uid.matches(pattern2));

        //첫글자는 영문자 소문자/대문자로 시작하고
        //두번째부터는 영문자, 숫자, 특수기호()등이 포함된
        //6자리 이상 18자 이하의 id를 규정하는 프로그램을 만드시오

        String pattern3 = "^[a-zA-Z]{1}[a-zA-Z0-9!?@$]{5,17}";
        uid = "a12345678901234567";
        System.out.println(uid.matches(pattern3));
        uid = "123jkl";
        System.out.println(uid.matches(pattern3));


        }
        }








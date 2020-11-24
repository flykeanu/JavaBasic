/**
로그인 확인 프로그램
 인증용 id 와 password 를 하나 생성해둔다
 abc123, 987xyz
 1. Scanner 로 아이디, 비밀번호를 입력받은 뒤
 2. 아이디와 비밀번호가 틀리면 "가입되지 않은 사용자이거나 비밀번호가 틀립니다"
 a. id만 맞으면 "비밀번호가 틀립니다"
 b. id와 password가 모두 일치하면 "로그인 성공"
 **/

import java.util.Scanner;

public class LoginME {
    public static void main(String[] args) {

        String CorrectId = new String("abc123");
        String CorrectPass = new String("987xyz");

        String Cid = new String("");
        String Cpass = new String("");

        while (true) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ID를 어여빨리 그리고 정확하게 입력하시오.");
        Cid = sc.nextLine();

        System.out.println("Password를 어여빨리 그리고 정확하게 입력하시오.");
        Cpass = sc.nextLine();



            if (Cid.equals(CorrectId) && Cpass.equals(CorrectPass)) {

                System.out.println("로그인에 성공하였습니다. 축하축하, 경축경축");
                break;
            } else if (!Cid.equals(CorrectId) || Cpass.equals(CorrectPass)) {
                System.out.println("아이디가 틀립니다. 다시 입력하세요");
            } else if (Cid.equals(CorrectId) || !Cpass.equals(CorrectPass)) {
                System.out.println("비번이 틀립니다. 다시 입력하세요");
            } else {
                System.out.println("가입되지 않은 사용자입니다.");

            }

        }

    }
        }





package Member;

import java.sql.SQLException;
import java.util.ArrayList;

public class MemberCRUD {
    public static void isMemberJoin() throws SQLException {
        System.out.print("I D : \t");
        String id = InputScanner.getInstance().getScanner().next();

        if (MemberTable.getInstance().isExistsMember(id)) {
            System.out.println("이미 존재하는 아이디입니다.");
            return;
        }

        System.out.print("P W : \t");
        String pw = InputScanner.getInstance().getScanner().next();

        System.out.print("N A M E : \t");
        String name = InputScanner.getInstance().getScanner().next();

        System.out.print("A G E : \t");
        int age = InputScanner.getInstance().getScanner().nextInt();

        if (MemberTable.getInstance().insertData(id, pw, name, age)) {
            System.out.println("회원 가입에 성공하였습니다.");
        }
    }

    public static void isMemberLogin() throws SQLException {
        System.out.print("I D : \t");
        String id = InputScanner.getInstance().getScanner().next();

        System.out.print("P W : \t");
        String pw = InputScanner.getInstance().getScanner().next();
        Member member = MemberTable.getInstance().isLogin(id, pw);

        if (member == null) {
            System.out.println("로그인에 실패하였습니다.");
        } else {
            if (member.getIsValid()) {
                System.out.printf("%s [%d] 님 어서 오십시오.", member.getName(), member.getAge());
            } else {
                System.out.println("로그인에 실패하였습니다.");
            }
        }
    }

    public static void deleteMember() throws SQLException {
        System.out.print("I D : \t");
        final String id = InputScanner.getInstance().getScanner().next();

        System.out.print("P W : \t");
        final String pw = InputScanner.getInstance().getScanner().next();
        Member member = MemberTable.getInstance().isLogin(id, pw);
        if (member == null){
            System.out.printf("계정명이 없습니다.");
            return;
        }
        if (member.getIsValid()) {
            if (MemberTable.getInstance().deleteMember(member.getId(), pw)) {
                System.out.printf("계정 [ %s ] 이 삭제되었습니다.");
            } else {
                System.out.printf("계정 삭제에 실패하였습니다.");
            }
        }
    }

    public static void updateMember() throws SQLException {
        System.out.print("I D : \t");
        String id = InputScanner.getInstance().getScanner().next();

        System.out.print("P W : \t");
        String pw = InputScanner.getInstance().getScanner().next();
        Member member = MemberTable.getInstance().isLogin(id, pw);
        if (member.getIsValid()) {
            System.out.printf("%s [%d] 님 어서 오십시오.\n", member.getName(), member.getAge());

            System.out.println("변경할 이름과 나이를 입력하여 주시기 바랍니다.");

            System.out.print("N A M E : \t");
            String name = InputScanner.getInstance().getScanner().next();

            System.out.print("A G E : \t");
            int age = InputScanner.getInstance().getScanner().nextInt();

            if (MemberTable.getInstance().updateData(id, pw, name, age)) {
                System.out.println("입력하신 정보로 변경 완료되었습니다.");
                System.out.printf("[ID] : %s | [NAME] : %s | [AGE] : %d", id, name, age);
            } else {
                System.out.println("입력하신 정보로 변경 실패하였습니다.");
            }
        } else {
            System.out.println("로그인에 실패하였습니다.");
        }
    }

    public static void getMemberList() throws SQLException {
        ArrayList<Member> arrayMemberList = MemberTable.getInstance().getMemberList();

        for (Member member : arrayMemberList) {
            System.out.printf("[아이디] : %-20.10s [이름] : %-20.10s [나이] : %-2d\n", member.getId(),
                    member.getName(),
                    member.getAge());
        }
    }

    public static void searchMember() throws SQLException {
        System.out.println("검색할 아이디를 검색하여 주십시요.");
        System.out.print("I D : \t");
        String id = InputScanner.getInstance().getScanner().next();

        ArrayList<Member> members = MemberTable.getInstance().searchMember(id);

        if (members != null) {
            System.out.println("해당 아이디가 포함된 아이디가 모두 검색되었습니다.");
            for (Member member : members) {
                System.out.printf("[아이디] : %-20.10s [이름] : %-20.10s [나이] : %-2d\n", member.getId(),
                        member.getName(),
                        member.getAge());
            }
        } else {
            System.out.println("해당 아이디를 가진 회원을 찾지 못하였습니다.");
        }
    }
}

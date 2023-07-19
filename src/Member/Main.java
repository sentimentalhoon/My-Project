package Member;

import java.sql.SQLException;

public class Main {

    private final static int MEMBERJOIN = 'J';
    private final static int MEMBERLOGIN = 'L';
    private final static int MEMBERDELETE = 'D';
    private final static int MEMBERUPDATE = 'U';
    private final static int MEMBERLIST = 'I';
    private final static int MEMBERSEARCH = 'S';
    public static void main(String[] args) {
        try {
            MemberDAO.getInstance();
            while (true) {
                System.out.print("가입(J) 로그인(L) 삭제(D) 업데이트(U) 목록(I) 검색(S)\n선택>\t");
                String iString = InputScanner.getInstance().getScanner().next();
                int input = iString.toUpperCase().charAt(0);
                switch (input) {
                    case MEMBERJOIN:
                        MemberCRUD.isMemberJoin();
                        break;
                    case MEMBERLOGIN:
                        MemberCRUD.isMemberLogin();
                        break;
                    case MEMBERDELETE:
                        MemberCRUD.deleteMember();
                        break;
                    case MEMBERUPDATE:
                        MemberCRUD.updateMember();
                        break;
                    case MEMBERLIST:
                        MemberCRUD.getMemberList();
                        break;
                    case MEMBERSEARCH:
                        MemberCRUD.searchMember();
                        break;
                    default:
                        break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

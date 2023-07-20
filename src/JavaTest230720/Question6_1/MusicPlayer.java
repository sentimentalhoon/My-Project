package JavaTest230720.Question6_1;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayer {
    private static ArrayList<MusicVo> musicVoList;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            musicVoList = new ArrayList<MusicVo>();
            while (true) {
                print("==== 뮤직플레이어 ====\n1. 등록\t2. 목록\t3. 삭제\t4. 전체삭제\t5. 종료 >>");

                int selectNum = sc.nextInt();

                switch (selectNum) {
                    case 1:
                        musicVoList.add(case1(sc));
                        break;
                    case 2:
                        showList();
                        break;
                    case 3:
                        deleteSong(sc);
                        break;
                    case 4:
                        deleteList();
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                    println("정확한 숫자를 입력해 주세요!");
                        break;
                }
            }
        }
    }

    private static MusicVo case1(Scanner sc) {
        MusicVo musicvo = new MusicVo();
        println("==== 등록 ====");
        print("제목 : ");
        String title = sc.next();
        musicvo.setTitle(title);
        print("가수 : ");
        String singer = sc.next();
        musicvo.setSinger(singer);
        print("시간 : ");
        int playTime = sc.nextInt();
        musicvo.setPlayTime(playTime);
        return musicvo;
    }

    private static void showList() {
        println("==== 노래 목록 ====");
        for (MusicVo musicVo : musicVoList) {
            System.out.printf("1. 제목 : %s\t가수 : %s\t시간 : %d 초\n", musicVo.getTitle(), musicVo.getSinger(),
                    musicVo.getPlayTime());
        }
    }

    private static void deleteSong(Scanner sc) {
        println("==== 노래 삭제 ====");
        print("삭제하고 싶은 노래 번호 입력 :\t");
        int deleteNum = sc.nextInt();
        MusicVo musicVo = musicVoList.get(deleteNum - 1);
        System.out.printf("%s 노래를 삭제합니다.", musicVo.getTitle());
    }

    private static void deleteList() {
        println("==== 전체 노래 삭제 ====");
        print("전체 노래가 삭제되었습니다.");
        musicVoList.clear();
    }

    private static void println(String str) {
        System.out.println(str);
    }

    private static void print(String str) {
        System.out.print(str);
    }
}

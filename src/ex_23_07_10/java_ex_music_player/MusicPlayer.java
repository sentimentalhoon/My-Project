package ex_23_07_10.java_ex_music_player;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

public class MusicPlayer {
    private static final String relativePath = "java_ex_music_player\\data\\";

    private static int playType = 0;
    private static final int PLAY = 1;
    private static final int NEXT = 2;
    private static final int PREVIOUSLY = 3;
    private static final int STOP = 4;
    private static final int EXIT = 5;

    private static final Type MUSICLIST_TYPE = new TypeToken<List<MusicList>>() {
    }.getType();
    private static Gson gson;

    public static synchronized Gson getInstance() {
        if (gson == null)
            gson = new Gson();
        return gson;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            /**
             * 노래 데이타를 json 에서 읽어오는 방식으로 변경하였다.
             * data 폴더 안에 mp3, json 파일 존재
             */
            try (FileInputStream fileInputStream = new FileInputStream(relativePath + "musiclist.json")) {
                JsonReader reader = new JsonReader(new InputStreamReader(fileInputStream, "UTF-8"));
                ArrayList<MusicList> playlist = new ArrayList<MusicList>();
                playlist = getInstance().fromJson(reader, MUSICLIST_TYPE);
                MusicController musicControl = new MusicController(playlist);
                playList(musicControl);

                while (true) {
                    System.out.print("  [1]노래재생 [2]다음곡 [3]이전곡 [4]정지 [5]종료 >> ");
                    playType = sc.nextInt();
                    System.out.println();
                    if (!mp3Play(playType, musicControl)) {
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static boolean mp3Play(int playType, MusicController musicControl) {
        switch (playType) {
            case PLAY:
                musicControl.play();
                playInformation(musicControl);
                return true;
            case NEXT: {
                if (musicControl.getMp3PlayNumber() >= musicControl.getPlayListSize() - 1) {
                    System.out.println(ConsoleColor.RED_BACKGROUND_BRIGHT + "  #### 다음곡이 없습니다. 처음 곡으로 재생합니다. ####\n"
                            + ConsoleColor.RESET);
                }
                musicControl.next();

                playInformation(musicControl);
                return true;
            }
            case PREVIOUSLY: {
                if (musicControl.getMp3PlayNumber() <= 0) {
                    System.out.println(ConsoleColor.RED_BACKGROUND_BRIGHT + "  #### 이전곡 없습니다. 처음 곡으로 재생합니다.####\n"
                            + ConsoleColor.RESET);
                }
                musicControl.previous();

                playInformation(musicControl);
                return true;
            }
            case STOP: {
                musicControl.stop();
                System.out.println(
                        "================================================================\n"
                                + "  플레이어가 정지 되었습니다.\n"
                                + "================================================================\n");
                return true;
            }
            case EXIT: {
                musicControl.stop();
                System.out.println(
                        "================================================================\n"
                                + "  플레이어가 종료 되었습니다.\n"
                                + "================================================================\n");
                return false;
            }
            default:
                playList(musicControl);
                return true;
        }
    }

    private static void playInformation(MusicController musicControl) {
        System.out.printf(
                "======================== 재생 중인 노래 ========================\n"
                        + "  제목 : %20s | 가수 : %20s\n"
                        + "================================================================\n\n",
                musicControl.getPlayList().get(musicControl.getMp3PlayNumber()).getTitle(),
                musicControl.getPlayList().get(musicControl.getMp3PlayNumber()).getSinger());
    }

    private static void playList(MusicController musicControl) {
        System.out.println("======================== P L A Y L I S T =======================");
        for (MusicList musicList : musicControl.getPlayList()) {
            System.out.printf("  제목 : %20s | 가수 : %20s\n", musicList.getTitle(), musicList.getSinger());
        }
        System.out.println("================================================================\n");
    }
}
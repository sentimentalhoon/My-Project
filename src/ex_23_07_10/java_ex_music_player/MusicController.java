package ex_23_07_10.java_ex_music_player;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicController {
    private int mp3PlayNumber = 0;
    private ArrayList<MusicList> playList = new ArrayList<MusicList>();
    private MP3Player mp3Player;

    public MusicController(ArrayList<MusicList> playList) {
        this.playList = playList;
        this.mp3Player = new MP3Player();
    }

    public ArrayList<MusicList> getPlayList() {
        return this.playList;
    }

    public int getPlayListSize(){
        return this.playList.size();
    }

    public void setMp3PlayNumber(int mp3PlayNumber) {
        if (mp3PlayNumber < 0) {
            mp3PlayNumber = playList.size() - 1;
        } else if (mp3PlayNumber >= playList.size()) {
            mp3PlayNumber = 0;
        }
        this.mp3PlayNumber = mp3PlayNumber;
    }

    public int getMp3PlayNumber(){
        return this.mp3PlayNumber;
    }

    public MusicList play() {
        MusicList musicList = playList.get(mp3PlayNumber);

        if (isPlaying()) {
            mp3Player.stop();
        }

        mp3Player.play(musicList.getFilePath());

        return musicList;
    }

    public void stop() {
        if (isPlaying()) {
            mp3Player.stop();
        }
    }

    public MusicList previous() {
        setMp3PlayNumber(this.mp3PlayNumber - 1);
        return play();
    }

    public MusicList next() {
        setMp3PlayNumber(this.mp3PlayNumber + 1);
        return play();
    }

    public boolean isPlaying() {
        return mp3Player.isPlaying();
    }
}

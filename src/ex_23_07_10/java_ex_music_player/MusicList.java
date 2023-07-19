package ex_23_07_10.java_ex_music_player;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MusicList {
    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("singer")
    @Expose
    private String singer;

    @SerializedName("filePath")
    @Expose
    private String filePath;

    public MusicList(String title, String singer, String filePath) {
        this.title = title;
        this.singer = singer;
        this.filePath = filePath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}

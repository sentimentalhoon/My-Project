package JavaTest230720.Question6_1;

public class MusicVo {
    private String title;
    private String Singer;
    private int playTime;
    public MusicVo(String title, String singer, int playTime) {
        this.title = title;
        Singer = singer;
        this.playTime = playTime;
    }
    public MusicVo() {
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getSinger() {
        return Singer;
    }
    public void setSinger(String singer) {
        Singer = singer;
    }
    public int getPlayTime() {
        return playTime;
    }
    public void setPlayTime(int playTime) {
        this.playTime = playTime;
    }
    @Override
    public String toString() {
        return "MusicVo [title=" + title + ", Singer=" + Singer + ", playTime=" + playTime + "]";
    }   
    
}

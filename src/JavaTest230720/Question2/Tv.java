package JavaTest230720.Question2;

public class Tv {
    int channel;
    String color;
    
    public Tv(){

    }
    
    public Tv(int channel, String color) {
        this.channel = channel;
        this.color = color;
    }
    
    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void print() {
        System.out.printf("TV의 현재 채널은 : %d 이고, TV의 색깔은 %s 입니다.\n", this.channel, this.color);
    }

    void channelUp() {
        channel++;
    };


    void channelDown() {
        channel--;
    }
}

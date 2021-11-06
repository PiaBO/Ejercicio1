package pubsub;

public class Message {
    private String channel;
    private String message;

    public Message(String channel, String message){
        this.channel = channel;
        this.message = message;
    }  
    public String getChannel(){
        return channel;
    }
}

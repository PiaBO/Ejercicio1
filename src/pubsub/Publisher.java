package pubsub;

public interface Publisher {
    void emit(Message message, PubSubService pubSubService);
}

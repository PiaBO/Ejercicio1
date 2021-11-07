package PubSub.Publisher;
import PubSub.*;

public interface Publisher {
    void emit(Message message, PubSubService pubSubService);
}

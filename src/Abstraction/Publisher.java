package Abstraction;

import Implementation.Message;
import Implementation.PubSubService;

public interface Publisher {
    void emit(Message message, PubSubService pubSubService);
}

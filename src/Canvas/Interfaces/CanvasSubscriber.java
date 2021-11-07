package Canvas.Interfaces;

import PubSub.PubSubService;

public interface CanvasSubscriber {
    void subscribe(String channel, PubSubService pubSubService);
    void unsubscribe(String channel, PubSubService pubSubService);
}

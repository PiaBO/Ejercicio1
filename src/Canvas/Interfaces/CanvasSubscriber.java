package Canvas.Interfaces;

import PubSub.PubSubService;

public interface CanvasSubscriber {
    public void subscribe(String channel);
    public void unsubscribe(String channel);
}

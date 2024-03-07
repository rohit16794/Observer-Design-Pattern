package publisher;

import subscriber.ISubscriber;

import java.util.List;

public class NotificationPublisher implements IPublisher{

    private List<ISubscriber> subscribers;

    @Override
    public void addSubscribers(ISubscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(ISubscriber subscriber) {\
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for(ISubscriber subscriber : subscribers) {
            subscriber.update();
        }
    }
}

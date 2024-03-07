package publisher;

import subscriber.ISubscriber;

public interface IPublisher {

    void addSubscribers(ISubscriber subscriber);

    void removeSubscriber(ISubscriber subscriber);

    void notifySubscribers();
}

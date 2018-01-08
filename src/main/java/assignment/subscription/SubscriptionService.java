package assignment.subscription;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionService {

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    public Subscription subscribe(SubscriptionRequest subscriptionRequest) {
        Subscription subscription = new Subscription();
        BeanUtils.copyProperties(subscriptionRequest, subscription);
        subscriptionRepository.save(subscription);
        System.out.println(subscriptionRepository.findAll());
        return subscription;
    }

    public Subscription getSubscription(Long subscriptionId) {
        return subscriptionRepository.findOne(subscriptionId);
    }
}

package assignment.subscription.invoice;

import assignment.subscription.Subscription;
import assignment.subscription.SubscriptionRepository;
import assignment.subscription.SubscriptionRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    public List<Invoice> update(Long subscriptionId, InvoiceRequest invoiceRequest) {
        Invoice invoice = invoiceRepository.findByIdAndSubscription(invoiceRequest.getInvoiceId(), subscriptionId);
        invoice.setInvoiceDate(invoiceRequest.getInvoiceDate());
        invoiceRepository.save(invoice);
        return Collections.emptyList();
    }
}

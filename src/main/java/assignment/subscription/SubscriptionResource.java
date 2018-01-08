package assignment.subscription;

import assignment.subscription.invoice.InvoiceRequest;
import assignment.subscription.invoice.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SubscriptionResource {

    @Autowired
    private SubscriptionService subscriptionService;

    @Autowired
    private InvoiceService invoiceService;

    @PostMapping("/subscriptions")
    public ResponseEntity<String> subscribe(@RequestBody SubscriptionRequest subscriptionRequest) {
        System.out.println(subscriptionRequest);
        subscriptionService.subscribe(subscriptionRequest);
        return ResponseEntity.ok("success");
    }

    @GetMapping("/subscriptions")
    public ResponseEntity<String> getSubscription(@RequestBody Long subscriptionId) {
        subscriptionService.getSubscription(subscriptionId);
        return ResponseEntity.ok("success");
    }

    @PutMapping("/subscriptions/{subscriptionId}/invoice")
    public ResponseEntity<String> updateSubscriptionInvoice(@PathVariable Long subscriptionId,
                                                            @RequestBody InvoiceRequest invoiceRequest) {
        invoiceService.update(subscriptionId, invoiceRequest);
        return ResponseEntity.ok("success");
    }

    @ExceptionHandler(Exception.class)
    public @ResponseBody  String handleExceptionb(Exception e) {
        e.printStackTrace();
        return "An error occured";
    }

}

package assignment.subscription.invoice;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends CrudRepository<Invoice, Long> {
    Invoice findByIdAndSubscription(Long id, Long subscription);
}

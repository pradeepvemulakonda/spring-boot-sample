package assignment.subscription.invoice;


import assignment.subscription.Subscription;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Invoice implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "invoice_generator", sequenceName = "invoicen_sequence")
    @GeneratedValue(generator = "invoice_generator")
    private Long id;

    @ManyToOne
    private Subscription subscription;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date invoiceDate;

    @Column(nullable = false)
    private BigDecimal invoiceAmount;

    @Column(nullable = false)
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public BigDecimal getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(BigDecimal invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Invoice invoice = (Invoice) o;

        if (id != null ? !id.equals(invoice.id) : invoice.id != null) return false;
        if (subscription != null ? !subscription.equals(invoice.subscription) : invoice.subscription != null)
            return false;
        if (invoiceDate != null ? !invoiceDate.equals(invoice.invoiceDate) : invoice.invoiceDate != null) return false;
        if (invoiceAmount != null ? !invoiceAmount.equals(invoice.invoiceAmount) : invoice.invoiceAmount != null)
            return false;
        return status != null ? status.equals(invoice.status) : invoice.status == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (subscription != null ? subscription.hashCode() : 0);
        result = 31 * result + (invoiceDate != null ? invoiceDate.hashCode() : 0);
        result = 31 * result + (invoiceAmount != null ? invoiceAmount.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}

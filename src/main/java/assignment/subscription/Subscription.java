package assignment.subscription;


import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Subscription implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "subscription_generator", sequenceName = "subscription_sequence")
    @GeneratedValue(generator = "subscription_generator")
    private Long id;

    @Column(nullable = false)
    private BigDecimal subscribedInvoiceAmount;

    @Column(nullable = false)
    private String invoiceFrequency;

    @Column(nullable = false)
    private String dayOfWeek;

    @Column(nullable = false)
    private Integer dayOfMonth;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getSubscribedInvoiceAmount() {
        return subscribedInvoiceAmount;
    }

    public void setSubscribedInvoiceAmount(BigDecimal subscribedInvoiceAmount) {
        this.subscribedInvoiceAmount = subscribedInvoiceAmount;
    }

    public String getInvoiceFrequency() {
        return invoiceFrequency;
    }

    public void setInvoiceFrequency(String invoiceFrequency) {
        this.invoiceFrequency = invoiceFrequency;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Integer getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(Integer dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}

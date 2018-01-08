package assignment.subscription;

import java.math.BigDecimal;
import java.util.Date;

public class SubscriptionRequest {

    private String subscriptionId;

    private BigDecimal subscribedInvoiceAmount;

    private String invoiceFrequency;

    private String dayOfWeek;

    private Integer dayOfMonth;

    private Date startDate;

    private Date endDate;

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
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

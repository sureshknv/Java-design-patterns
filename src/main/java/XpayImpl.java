public class XpayImpl implements  Xpay {

    String creditCardNo;
    String customerName;
    String expirayMonth;
    String expirayYear;
    Short cardcvv;
    Double Amount;

    @Override
    public String getCreditCardNo() {
        return creditCardNo;
    }
    @Override
    public String getCustomerName() {
        return customerName;
    }
    @Override
    public String getExpirayMonth() {
        return expirayMonth;
    }
    @Override
    public String getExpirayYear() {
        return expirayYear;
    }
    @Override
    public Short getCardcvv() {
        return cardcvv;
    }
    @Override
    public Double getAmount() {
        return Amount;
    }
    @Override
    public void setCreditCardNo(String crediCardNo) {
        this.creditCardNo = crediCardNo;
    }
    @Override
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    @Override
    public void setExpirayMonth(String expirayMonth) {
        this.expirayMonth = expirayMonth;
    }
    @Override
    public void setExpirayYear(String expirayYear) {
        this.expirayYear = expirayYear;
    }
    @Override
    public void setCardcvv(Short cardcvv) {
        this.cardcvv = cardcvv;
    }
    @Override
    public void setAmount(Double amount) {
        Amount = amount;
    }
}

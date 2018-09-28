public interface Xpay {
    public String getCreditCardNo();
    public String getCustomerName();
    public String getExpirayMonth();
    public String getExpirayYear();
    public Short getCardcvv();
    public Double getAmount();

    public  void setCreditCardNo(String creditCardNo);
    public void setCustomerName(String customerName);
    public void setExpirayMonth(String month);
    public void setExpirayYear(String year);
    public void setCardcvv(Short cvv);
    public void setAmount(Double amount);
}


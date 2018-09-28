public interface PayD {

    public Double getTotalAmount();
    public Integer getCVVNo();
    public String getCardExpMonthDate();
    public String getCardOwnerName();
    public String getCustCardNo();
    public void setCustCardNo(String custCardNo);
    public  void setCardOwnerName(String cardOwnerName);
    public void setCardExpMonthDate(String cardExpMonthDate);
    public void  setCVVNo(Integer cVVNo);
    public void setTotalAmount(Double totalAmount);

}

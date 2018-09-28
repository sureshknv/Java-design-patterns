public class XpaytoPayDAdapter implements  PayD {
    private final Xpay xpay;
    private String custCardNo;
    private String cardOwnerName;
    private String cardExpMonthDate;
    private Integer cVVNo;
    private Double totalAmount;

    public XpaytoPayDAdapter(Xpay xpay) {
        this.xpay = xpay;
        setProp();
    }

    public Double getTotalAmount() {
        return this.totalAmount;

    }

    public Integer getCVVNo() {
        return this.cVVNo;
    }

    public String getCardExpMonthDate() {
        return this.cardExpMonthDate;
    }

    public String getCardOwnerName() {
        return this.cardOwnerName;
    }

    public String getCustCardNo() {
        return this.custCardNo;
    }

    public void setCustCardNo(String custCardNo) {
        this.custCardNo=custCardNo;
    }

    public void setCardOwnerName(String cardOwnerName) {
        this.cardOwnerName =cardOwnerName;
    }

    public void setCardExpMonthDate(String cardExpMonthDate) {
        this.cardExpMonthDate= cardExpMonthDate;
    }

    public void setCVVNo(Integer cVVNo) {
    this.cVVNo=cVVNo;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount=totalAmount;
    }
    private void setProp(){
        setCardOwnerName(this.xpay.getCustomerName());
        setCustCardNo(this.xpay.getCreditCardNo());
        setCardExpMonthDate(this.xpay.getExpirayMonth()+"/"+this.xpay.getExpirayYear());
        setCVVNo(this.xpay.getCardcvv().intValue());
        setTotalAmount(this.xpay.getAmount());
    }
}

public class RunAdapterExample {

    public static void main(String[] args) {
        Xpay xpay = new XpayImpl();
        xpay.setCreditCardNo("4789565874102365");
        xpay.setCustomerName("Max Warner");
        xpay.setExpirayMonth("09");
        xpay.setExpirayYear("25");
        xpay.setCardcvv((short)235);
        xpay.setAmount(2565.23);
        PayD payD = new XpaytoPayDAdapter(xpay);
        testPayD(payD);
    }
    private static void testPayD(PayD payD){
        System.out.println(payD.getCardOwnerName());
        System.out.println(payD.getCustCardNo());
        System.out.println(payD.getCardExpMonthDate());
        System.out.println(payD.getCVVNo());
        System.out.println(payD.getTotalAmount());
    }
}

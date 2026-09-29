interface Payment {

    void pay(double amount);
}

class CreditCardPayment implements Payment {

    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {

        System.out.println(
                "PHP " + amount
                + " paid using Credit Card."
        );

        System.out.println(
                "Card: " + cardNumber
        );
    }
}

class GCashPayment implements Payment {

    private String mobileNumber;

    public GCashPayment(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void pay(double amount) {

        System.out.println(
                "PHP " + amount
                + " paid using GCash."
        );

        System.out.println(
                "Mobile Number: "
                + mobileNumber
        );
    }
}

public class InterfacePaymentExample {

    public static void main(String[] args) {

        Payment payment1 =
                new CreditCardPayment(
                        "**** **** **** 1234"
                );

        Payment payment2 =
                new GCashPayment(
                        "09123456789"
                );

        payment1.pay(2500);
        System.out.println();

        payment2.pay(1500);
    }
}

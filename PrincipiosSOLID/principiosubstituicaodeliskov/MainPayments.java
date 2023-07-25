package principiosubstituicaodeliskov;

public class MainPayments {
    
    public static void main(String[] args) {
        CreditCard card = new CreditCard();

        card.validate();
        card.collectPayment();
    } 
}

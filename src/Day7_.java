public class Day7_ {
    class Payment {
        String amount;

        void transfer() {
            System.out.println("payment Received");
        }
    }

    class UpiPayment extends Payment {
        @Override
        void transfer() {
            System.out.println("UpiPayment successfull...");
        }
    }

    class CardPayment extends Payment {
        @Override
        void transfer() {
            System.out.println("CardPayment succced...");
        }
    }

    class NBPayment extends Payment {
        void transfer() {
            System.out.println("NBPayment Paid...");
        }
    }

    public void main() {
        UpiPayment payment = new UpiPayment();
        payment.transfer();

        CardPayment e = new CardPayment();
        e.transfer();

        NBPayment NB = new NBPayment();
        NB.transfer();
    }
}





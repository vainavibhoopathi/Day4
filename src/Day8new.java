public class Day8_P2 {

    // Payment
    // Success, Failure, Pending
    sealed interface PaymentResult permits PaymentSuccess, PaymentFailure, PaymentPending {

    }
    record PaymentSuccess(String time) implements PaymentResult {

    }
    record PaymentFailure(String reason)  implements PaymentResult {

    }

    record PaymentPending(String expectedTime)  implements PaymentResult {

    }

    record Random(String reason){

    }

    static void handlePayment(PaymentResult result) {
        switch (result) {
            case PaymentSuccess success -> System.out.println("Payment Success at : " + success.time());
            case PaymentFailure failure -> System.out.println("Payment Failure because of " + failure.reason());
            case PaymentPending pending -> System.out.println("Payment Pending, " + pending.expectedTime());
        }
    }

    static void main() {
        PaymentResult paymentSuccess = new PaymentSuccess("2026-06-13:03:03:10");
        PaymentResult paymentFailure = new PaymentFailure("Insufficient balance");
        PaymentResult paymentPending = new PaymentPending("Check after 5 hours");

        handlePayment(paymentSuccess);
        handlePayment(paymentFailure);
        handlePayment(paymentPending);



    }

}
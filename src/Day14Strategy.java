public class Day14Strategy {
    static void main() {
        // Initatiate Fees Calc

        FeeCalculator calc = new FeeCalculator(new NoDiscount());

        System.out.println("Final Fee with No Discount: " + calc.finalFee(1000));

        calc.setDiscountStrategy(new SummerSaleDiscount());
        System.out.println("Final Fee with SummerSale Discount: " + calc.finalFee(1000));

    }

    interface DiscountStrategy {
        double apply(double fee);
    }

   static class SummerSaleDiscount implements DiscountStrategy {
        // 30%
        @Override
        public double apply(double fee) {
            // business logic to calculate discount
            return fee * 0.7; // x -> x - x*30/100
        }
    }

   static class NoDiscount implements DiscountStrategy {
        // 0%
        @Override
        public double apply(double fee) {
            // business logic to calculate discount
            return fee;
        }
    }


    static class FeeCalculator {
        // Strategy
        private DiscountStrategy discountStrategy;

        public FeeCalculator(DiscountStrategy discountStrategy) {
            this.discountStrategy = discountStrategy;
        }

        void setDiscountStrategy(DiscountStrategy discountStrategy) {
            this.discountStrategy = discountStrategy;
        }

        //Calculate finalFee
        public double finalFee(double fee) {
            return discountStrategy.apply(fee);
        }
    }
}
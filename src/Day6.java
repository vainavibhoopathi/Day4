public class Day6 {
    static class Car {
        String Color;
        String Brand;
        int speed;
        int fuel;

        Car(String Color, int speed, String Brand, int fuel) {
            this.Color = Color;
            this.Brand = Brand;
        }

        void accelerate(int speed) {
            fuel += speed;
            this.speed = speed;
        }

        void decelerate(int speed) {
            fuel -= speed;
        }

        void showFuel() {
            System.out.println("Your Fuel is:" + fuel);
        }

        void printDetails() {
            System.out.println("The Color is:" + Color);
            System.out.println("The Brand is:" + Brand);
            System.out.println("The speed is:" + speed);
        }
        public static void main(String[] args) {
            Car feature = new Car("red", 0, "venue", 0);
            feature.accelerate(150);
            feature.showFuel();
            feature.decelerate(50);
            feature.showFuel();
            feature.printDetails();
        }
    }
        public static void main(String[] args) {
        Car feature = new Car("red", 0, "venue", 0);
        feature.accelerate(150);
        feature.showFuel();
        feature.decelerate(50);
        feature.showFuel();
        feature.printDetails();
    }
        }


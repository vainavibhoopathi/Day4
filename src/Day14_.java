public class Day14_{
    interface Notification{
        void send(String to,String message);
    }
    class EmailNotification implements Notification{

        @Override
        public void send(String to, String message) {
            System.out.println("Email Sent: "+message +", to "+to);
        }
    }
    class WhatsappNotification implements Notification{

        @Override
        public void send(String to, String message) {
            System.out.println("Whatsapp Sent: "+message +", to "+to);
        }
    }
    static Notification getNotification(Day14_ fact,String type){
        return switch (type){
            case "Email" ->fact.new EmailNotification();
            case "Whatsapp" ->fact.new WhatsappNotification();
            default ->throw new IllegalArgumentException("Invalid Message:"+type);
        };
    }
    public static void main(){
          Day14_ fact=new Day14_();

          String type="Whatsapp";
          getNotification(fact,type).send("9363686680","Hello!... Joker:)");

    }
}
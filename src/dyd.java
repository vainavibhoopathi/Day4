public class Day7 {

    static class Notification{

        private String to;

        Notification(String to){
            this.to = to;
        }

        void send(){

        }
    }

    static class AudioNotification extends Notification {
        AudioNotification(String to){
            super(to);
        }

        void sendAudioNotification(){
            System.out.println("Sending audio notification...");
        }
    }

    static class TextNotification extends Notification {
        TextNotification(String to){
            super(to);
        }

        void sendTextNotification(){
            System.out.println("Sending text notification...");
        }
    }


    public static void main(String[] args){
        AudioNotification audioNotification = new AudioNotification("   arvaindg@gmsail.com    ");
        audioNotification.sendAudioNotification();

        TextNotification textNotification = new TextNotification("   1234567890    ");
        textNotification.sendTextNotification();
    }

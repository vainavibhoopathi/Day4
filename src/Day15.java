public class Day15 {
    static void main()throws InterruptedException{
        Runnable chefTask = () ->{
            String[] items={"Burger","Briyani","Barbeque"};
            for(int i=0;i<items.length;i++){
                System.out.println("Item got Cooked:"+items[i]);
               try{
                   Thread.sleep(8000);
               }catch(InterruptedException e){
                   throw new RuntimeException(e);
               }
            }
        };

        Thread chefThread=new Thread(chefTask,"chef-thread");
        chefThread.start();
        chefThread.join();
    }
}
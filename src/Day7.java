public class Day7{
     class Request{
        //attribute
        private String to;
        String name;
        int date;
        String reason;
    }
    //getting input for to
    int Request(String to,String name,int date,String reason) {
        return this.to = to;
        return this.name = name;
        return this.date = date;
        return this.reason = reason;
    }
    void send(){

    }
}
//inherit from parent class
 class  Leave extends Request{
    Leave(String to){
        super(to);
    }
//method
    void approve(){
        System.out.println("Approving the Request...");
    }
}
//inherit form parent class
 class OnDuty extends Request{
    OnDuty(String to){
        //calling constructor of parent class
        super(to);
    }
    //method
    void reject(){
        System.out.println("Rejecting the Request...");
        System.out.println("Name:"+"");
        System.out.println("Date:"+"");
        System.out.println("Reason:"+"");


    }
    //main function
    public static void main(String[] args){
       Leave leave = new Leave();

       leave.send();

       OnDuty onDuty = new OnDutyRequest();
       onDuty.send();

    }
}
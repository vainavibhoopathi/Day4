public class Day7{
    static class Request {
        String name;
        String date;
        String reason;

         Request(String name,String date,String reason) {
            this.name = name;
            this.date = date;
            this.reason = reason;
        }
            void approve(){
                System.out.println("Approving request");
            }
            void reject(){
                System.out.println("Reject request");
            }
        }
    static class LeaveRequest extends Request{
        LeaveRequest(String name,String date,String reason) {
            super(name,date,reason);
        }
        void approveLeaveRequest(){
        System.out.println("Approving leave Request...");
    }
    void rejectLeaveRequest(){
        System.out.println("Rejecting leave Request...");
    }
}
    static class OnDutyRequest extends Request {
        OnDutyRequest(String name,String date,String reason) {
            super(name, date, reason);
        }
     void approveOnDutyRequest() {
         System.out.println("Approving OnDuty request..."
         );
     }

     void rejectOnDutyRequest() {
         System.out.println("Rejecting OnDuty Request...");
     }
 }
     public static void main(String[] args) {
         LeaveRequest leave = new LeaveRequest("aruna","17-3-2025","fever");
         leave.rejectLeaveRequest();

         OnDutyRequest onduty = new OnDutyRequest("anu","28-4-2980","culturals");
         onduty.approveOnDutyRequest();
     }

}
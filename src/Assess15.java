import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
public class Assess15 {
    static class TransportSystem{
        String studentId;
        String name;
        String department;
        String pickupstop;
        TransportSystem(String studentId, String name, String department, String pickupstop) {
            this.studentId = studentId;
            this.name = name;
            this.department = department;
            this.pickupstop = pickupstop;
        }

     void StudentCommuter(String studentId,String name,String department,String pickupstop) {
         this.studentId = studentId;
         this.name = name;
         this.department = department;
         this.pickupstop = pickupstop;

         record StudentCommuter(String studentId, String name, String department, String pickupstop) {
         }
     }
    class Route extends TransportSystem {

        String routeId;
        String routeName;
        String routeType;
        String capacity;
        String stops;

        Route(String routeId, String routeName, String routeType, String capacity) {
            super(studentId, name, department, pickupstop);

            this.routeId = routeId;
            this.routeName = routeName;
            this.routeType = routeType;
            this.capacity = capacity;

            void addStop (String stops){
            stop.add(stops);
        }
            int hasStop (String stops){
            return stop.contains(stops);
        }
            String getAvailableSeats (String currentBookings){
            return capacity.currentBookings;
        }
        }
    class TransportBooking extends TransportSystem {
        String bookingId;
        String studentId;
        String routeId;
        String bookingStatus;

        TransportBooking(String bookingId, String studentId, String routeId) {
            super(studentId, name, department, pickupstop);

            this.bookingId = bookingId;
            this.studentId = studentId;
            this.routeId = routeId;
            this.bookingStatus = bookingStatus.PENDING;

            void confirmBooking () {
            bookingStatus = bookingStatus.CONFIRMED;
        }

            void cancelBooking () {
            bookingStatus = bookingStatus.CANCELLED;
        }

            void rejectBooking () {
            bookingStatus = bookingStatus.REJECTED;
        }
        }
    class TransportManger extends TransportSystem{
        Map<String,Route> routesbyId = new HashMap<>();
        routesbyId.put("13565");
        m.entrySet().forEach(entry ->{
            System.out.println(entry.getKey() + " : " + entry.getValue());
    }
     }
     public static void main(){
         TransportSystem t=new TransportSystem("13565","pravainz","CS","Yercaud");
         Route r =new Route("13565", "pravainz", "CS", "Yercaud",
                 "R101", "College Bus", "Bus", 50);
         r.addStop("Salem");
         r.addStop("Yercaud");

         TransportBooking t=new TransportBooking("13565","13565","356mad","Confirmed");
         t.confirmBooking();

     }
}



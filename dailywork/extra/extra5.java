import java.util.ArrayList;

abstract class transport{
    
    protected String trackingid;
    protected String destination;

    public transport(String trackingid, String destination) {
        this.trackingid = trackingid;
        this.destination = destination;
    }

    public abstract void dispatch();
}

interface gps{
    void getcoordinates();
}

interface autonomous{
    void selfnavigate();
}
class truck extends transport {

    public truck(String trackingId, String destination) {
        super(trackingId, destination);
    }
    public void dispatch() {
        System.out.println("truck " + trackingid + " left to " + destination);
    }
}
class deliverydrone extends transport implements gps, autonomous {

    public deliverydrone(String trackingId, String destination) {
        super(trackingId, destination);
    }
    public void dispatch() {
        System.out.println("drone " + trackingid + " taking off....." + "to " + destination);
    }
    public void getcoordinates() {
        System.out.println("40.7128° N");
    }
    public void selfnavigate() {
        System.out.println("drone navigating autonomously...");
    }
}
public class extra5 {
     public static void main(String[] args) {

        transport t = new deliverydrone("D101", "chennai");
        t.dispatch();
        
        gps g = new deliverydrone("d1111", "chennai");
        g.getcoordinates();  
        if (t instanceof gps) {
            System.out.println("t supports GPS");
        }

        ArrayList<transport> transports = new ArrayList<>();
        transports.add(new truck("t201", "mumbai"));
        transports.add(new deliverydrone("d102", "delhi"));

        for (transport tr : transports) {
            tr.dispatch(); 
        }
    }
}

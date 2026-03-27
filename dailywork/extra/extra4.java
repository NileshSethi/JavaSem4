abstract class device {
    protected String brand;

    public device(String brand) {
        this.brand = brand;
    }

    public abstract void turnon();
}

interface remotecontrollable {
    void connecttowifi();
}

interface powersaving{
    void getenergyrating();
}
class smarttv extends device implements remotecontrollable, powersaving {
    public smarttv(String brand) {
        super(brand);
    }

    public void turnon() {
        System.out.println(brand + " smart tv is on");
    }

    public void connecttowifi() {
        System.out.println(brand + " smart tv is connecting to wi-fi.......");
    }

    public void getenergyrating() {
        System.out.println(brand + " smart tv has an energy rating of abv+.");
    }
}

class electrickettle extends device {
    public electrickettle(String brand) {
        super(brand);
    }
    public void turnon() {
        System.out.println(brand + " electric kettle is now on");
    }
}

public class extra4 {
    public static void main(String[] args) {

        device d = new smarttv("sony");
        d.turnon();

        smarttv tv = new smarttv("samsung");
        tv.turnon();

        remotecontrollable r = new smarttv("lg");
        r.connecttowifi();

        device kettle = new electrickettle("philips");
        kettle.turnon();
        
    }
}

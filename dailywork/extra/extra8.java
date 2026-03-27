import java.util.*;
abstract class robot {
    private String batteryID;
    protected double chargeLevel;

    public robot(String batteryID, double chargeLevel) {
        this.batteryID = batteryID;
        this.chargeLevel = chargeLevel;
    }
    public String getbatteryID() {
        return batteryID;
    }
    public double getchargeLevel() {
        return chargeLevel;
    }
    public void reportStatus() {
        System.out.println("robot " + batteryID + " ------- " + chargeLevel + "%");
    }
    public abstract void performTask();
    protected void work(double consumption) {
        if (chargeLevel >= consumption) {
            chargeLevel -= consumption;
        } else {
            System.out.println("insufficient charge to perform task");
        }
    }
}

class drone extends robot {
    private static final double charge_consumption = 15.0;

    public drone(String batteryID, double chargeLevel) {
        super(batteryID, chargeLevel);
    }
    public void performTask() {
        work(charge_consumption);
        System.out.println("drone moving at 2x speed");
    }
}

class groundbot extends robot {
    private static final double charge_consumption = 5.0;

    public groundbot(String batteryID, double chargeLevel) {
        super(batteryID, chargeLevel);
    }

    public void performTask() {
    {
        work(charge_consumption);
        System.out.println("work done by robot");
        }
    }
}

public class extra8 {
    public static void main(String[] args) {

        List<robot> fleet = new ArrayList<>();

        fleet.add(new drone("A", 20));
        fleet.add(new groundbot("B", 10));
        fleet.add(new drone("C", 10)); 
        for (robot robot : fleet) {
            robot.performTask();
            robot.reportStatus();
            System.out.println("xxxxxxxxxxxxxxxxx");
        }
    }
}

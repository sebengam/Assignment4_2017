package Assignment4.violationOfTheCoreSoftwarePrinciples.Liskov_Substitution;

import com.sun.xml.internal.ws.api.pipe.Engine;

/**
 * Created by Tank on 3/27/2017.
 */
public class TransportationDevice {
    private String name;
    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }

    private double speed;
    double getSpeed() {
        return speed;
    }
    void setSpeed(double speed) {
        this.speed = speed;
    }

    private Engine engine;
    Engine getEngine() {
        return engine;
    }
     void setEngine(Engine engine) {
        this.engine = engine;
    }

    void startEngine(){
    }
}

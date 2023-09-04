/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dkhanh
 */
public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> redings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.redings = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    
    @Override
    public boolean isOn() {
        
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        
        return true;
    }

    @Override
    public void setOn() {
        
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        
        if (this.sensors.isEmpty()) {
            throw new IllegalStateException();
        }
        
        int average = (int) sensors.stream()
                .mapToInt(i -> i.read())
                .average()
                .getAsDouble();
        
        this.redings.add(average);
        return average;
    }
    
    public List<Integer> readings() {
        
        return this.redings;
    }
}

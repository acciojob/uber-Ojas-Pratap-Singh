package com.driver.model;

import javax.persistence.*;

@Entity
public class Cab{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private int perKmRate;
    private boolean available;

    //mapping b/w cab and driver where driver is parent and cab is child
    @OneToOne(mappedBy = "cab",cascade = CascadeType.ALL)
    Driver driver;


    //constructor
    public Cab(){
        //no args constructor
    }
    public Cab(int Id , int perKmRate , boolean  available){
        //all args constructor
        this.Id=Id;
        this.perKmRate = perKmRate;
        this.available =  available;
    }
    public Cab(int perKmRate ){
        this.perKmRate = perKmRate;
    }

    //setter and getter


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getPerKmRate() {
        return perKmRate;
    }

    public void setPerKmRate(int perKmRate) {
        this.perKmRate = perKmRate;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
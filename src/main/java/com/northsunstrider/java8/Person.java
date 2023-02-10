package com.northsunstrider.java8;

import java.util.Optional;

public class Person {
    private Optional<Truck> truck;

    /**
     * @return the truck
     */
    public Optional<Truck> getTruck() {
        return truck;
    }

    /**
     * @param truck
     *            the truck to set
     */
    public void setTruck(Optional<Truck> truck) {
        this.truck = truck;
    }

}

class Truck {
    private Optional<Insurance> insurance;

    public Optional<Insurance> getInsurance() {
        return insurance;
    }

    public void setInsurance(Optional<Insurance> insurance) {
        this.insurance = insurance;
    }
}

class Insurance {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

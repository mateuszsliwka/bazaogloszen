
package pl.mateuszsliwka.baza;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="baza_adds")
public class Adds implements Serializable {
    @GeneratedValue @Id
    private int ID;
    private String brand;
    private String model;
    private String capacity;
    private String fuel;
    private String vintage;
    private String mileage;
    private String info;
    private String price;
    private int OwnerID;

    public Adds() {
    }

    public Adds( String brand, String model, String capacity, String fuel, String vintage, String mileage, String info, String price, int OwnerID) {
       
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
        this.fuel = fuel;
        this.vintage = vintage;
        this.mileage = mileage;
        this.info = info;
        this.price = price;
        this.OwnerID = OwnerID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getVintage() {
        return vintage;
    }

    public void setVintage(String vintage) {
        this.vintage = vintage;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getOwnerID() {
        return OwnerID;
    }

    public void setOwnerID(int OwnerID) {
        this.OwnerID = OwnerID;
    }

    @Override
    public String toString() {
        return "Adds{" + "ID=" + ID + ", brand=" + brand + ", model=" + model + ", capacity=" + capacity + ", fuel=" + fuel + ", vintage=" + vintage + ", mileage=" + mileage + ", info=" + info + ", price=" + price + ", OwnerID=" + OwnerID + '}';
    }
    
}

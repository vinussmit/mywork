package fixtpro.com.fixtpro.beans.install_repair_beans;

import java.io.Serializable;

/**
 * Created by sahil on 05-04-2016.
 */
public class RepairType implements Serializable {
    String Type = "";
    String Price = "0";
    String Id  = "";
    String labor_hours  = "";
     public RepairType(){

     }

    public String getLabor_hours() {
        return labor_hours;
    }

    public void setLabor_hours(String labor_hours) {
        this.labor_hours = labor_hours;
    }

    boolean isCompleted = false ;
    public boolean isCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }
    public RepairType(String Type){
        this.Type = Type ;
    }
    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

}

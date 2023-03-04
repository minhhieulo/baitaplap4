
package baitaplab4;

public class Cylinder extends Circle{
    public double height;
    public void Clinder(){
        this.height=3.0;
    }public double getheight(){
        return this.height;
        
    }public void setheight(double height){
        this.height = height;
    }public double getvolume(){
        return this.getArea()*height;
    }

}

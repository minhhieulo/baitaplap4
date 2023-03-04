
package baitaplab4;


public class Circle {
    public double radius;
    public String color ;
    public Circle(){
        
    }
    public Circle(double radius , String color ){
       this.radius = radius;
       this.color = color;
    }
    
     public double getradius(){
       return radius;
    }
     public void setradius(double radius){
        this.radius = radius;
                
    }
     public String getcolor(){
        return color;
    }
     public void setcolor(String color){
        this.color = color;
    }
    
 @Override
    public String toString() {
        return "Circle[radius="+radius+",color="+color+"]"; 
    }public double getArea(){
        return radius=radius*radius*Math.PI;
    }

    String getArae() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

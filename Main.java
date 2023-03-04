
package baitaplab4;

import java.util.Scanner;


public class Main {
    public static void main (String[] args){
        Circle cr  = new Circle();
        System.out.println("Circle  la :");
        System.out.println("nhap vao radius : ");
        Scanner scanner = new Scanner(System.in);
        cr.setradius(scanner.nextDouble());
        System.out.println("gia tri cua Area la = "+cr.getArae());
        
        
        
        
        Cylinder cy = new Cylinder();
        System.out.println("Cylinder la : ");
        System.out.println("nhap vao height : ");
        cy.setheight(scanner.nextDouble());
        System.out.println("gia tri cua volume la : "+cy.getvolume());
        
        
    }
}
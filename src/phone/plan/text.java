/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phone.plan;

/**
 *
 * @author Jon mark
 */
public class text implements type{
private double price=49.99;
private String name="text";
    @Override
    public double getPrice() {
       return this.price;
    }

    public String getName() {
        return name;
    }



    public void setPrice(double price) {
        this.price = price;
    }
    


   
    
}

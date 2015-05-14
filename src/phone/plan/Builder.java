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
public interface Builder {
    public void addPlan(type plan);
    public void removePlan(type plan);
    public double getPrice();
    public void showOutput();
    
}

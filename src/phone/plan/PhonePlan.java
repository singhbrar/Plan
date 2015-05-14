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
public class PhonePlan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Plan p=new Plan();
       text t=new text();
       p.addPlan(t);
       p.addPlan(new voice());
       p.addPlan(new nba());
       p.showOutput();
      System.out.print(p.getPrice());
      p.removePlan(t);
      p.showOutput();
      System.out.print(p.getPrice());
    }

    
}

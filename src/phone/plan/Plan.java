/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phone.plan;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jon mark
 */
public class Plan implements Builder{
    private List<type> types=new ArrayList();
    private double price;
    @Override
    public void addPlan(type plan) {
       if(!types.contains(plan))
       {
           types.add(plan);
           price+=plan.getPrice();
       }
    }

    @Override
    public void removePlan(type plan) {
       if(contains(plan))
       {
           System.out.print("qwe");
           types.remove(plan);
           price-=plan.getPrice();
       }
    }

    @Override
    public double getPrice() {
       return this.price;
    }

    @Override
    public void showOutput() {
       String s="";
       for(type t:types)
       {
           s+=t.getName()+" ";
       }
       System.out.println(s);
    }
    public boolean contains(type plan)
    {
        for(type qwe:types)
        {
            if(qwe.getName().equals(plan.getName()))
                return true;
        }
        return false;
    }
}

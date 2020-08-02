/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diseno Xtrmo
 */
public class Containers {
    
    private int container1;
    private int container2;

    public Containers() {
        this.container1 = 0;
        this.container2 = 0;
    }
    public int add(int amount){
        if(amount < 0){
            return this.container1;
        }
        this.container1 = this.container1 + amount;
        if(this.container1>100){
            this.container1=100;

        }
        return this.container1;
    }
    
    public int move(int amount){
        if(amount < 0){
            return this.container2;
        }
        if(this.container1>= amount){
            this.container1 = this.container1 - amount;
            this.container2= this.container2 + amount;
            if(this.container2 >=100){
                this.container2=100;
            }
        }else{
            this.container2 = this.container2 - this.container1;
        }
        
            return this.container2;
        
    }
    public int remove(int amount){
        if(amount < 0){
            return this.container2;
        }
        this.container2 = this.container2 - amount;
        if(this.container2 < 0){
            this.container2=0;

        }
        return this.container2;
    }

    @Override
    public String toString() {
        
        
        return "First: " + this.container1 + "/100" + "\nSecond: " + this.container2 + "/100"; 
    }
    
    
    
    
}

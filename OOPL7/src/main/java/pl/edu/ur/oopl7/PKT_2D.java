/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

import java.util.Random;


public class PKT_2D {

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
     private int x;
    private int y;    
    private PKT_2D(){
        x=0;
        y=0;
    }
    public PKT_2D(int x, int y){
        this.x=x;
        this.y=y;                
    }
    public int gx(){
        return x;
    }
    public int gy(){
        return y;
    }   
          public PKT_2D losowanie(){
                  Random random = new Random();
                  int a = random.nextInt(21)-10;
                  int b = random.nextInt(21)-10;
                  PKT_2D d = new PKT_2D(a,b);
                  return d;
          }
              public String toString(){
                   return x + "," + y;
              } 
}

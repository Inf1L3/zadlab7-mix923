/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

import java.util.Random;


public class PKT_3D  extends PKT_2D{
  private int z;  

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

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
    public PKT_3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public PKT_3D() {
    }   
     public int gz(){
        return z;
    }
     
    @Override
    public PKT_3D losowanie(){
    Random random = new Random();
    int a = random.nextInt(21)-10;
    int b = random.nextInt(21)-10;
    int c = random.nextInt(21)-10;              
    PKT_3D d = new PKT_3D(a,b,c);
              return d;
    }
    public String toString() {
        return "x=" + this.x + ", y=" + this.y + ", z=" + this.z;
    }  
}

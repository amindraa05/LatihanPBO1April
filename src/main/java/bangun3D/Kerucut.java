/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangun3D;

import master.Matematika;

/**
 *
 * @author DAZUMBA
 */
public class Kerucut extends Tabung {
    private double phi = 22.0/7;
    
    public Kerucut(double r,double tinggi) {
        super(r, tinggi);
    }
    
    public double getLuas() {
        return getLuasAlas() + phi*getR()* getSisiMiring();
    }
    public double getSisiMiring(){
        return Matematika.getMiring(getR(), getTinggi());
    }
    
    public double getVolume(){
        return super.getVolume()/3;
    }
    
    public String toString(){
        return "Kerucut(" + "r=" + getR() + "tinggi=" + getTinggi() + ')';
    }
    
}

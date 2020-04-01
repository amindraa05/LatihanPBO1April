/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangun2D;

import master.Matematika;

/**
 *
 * @author DAZUMBA
 */
public class SegitigaSiku extends Segitiga {

    public SegitigaSiku(double alas, double tinggi) {
        super(alas, tinggi);
    }

    @Override
    public double getKeliling() {
        return getAlas() + getTinggi() + getSisiMiring();
    }
    
    public double getSisiMiring(){
        return Matematika.getMiring(getAlas()/2, getTinggi());
    }
    
    @Override
    public String toString(){
        return "SegitigaSiku(" + "a=" + getAlas() + ", t=" + getTinggi() + ')';
    }
    
    
}

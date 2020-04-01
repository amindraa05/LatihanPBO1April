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
public class Lingkaran {
    private double phi = 22.0/7;
    private double x;

    public Lingkaran(double x) {
        this.x = x;
    }
    
    public double getR(){
        return x;
    }
    
    public void setR(double x){
        this.x = x;
    }
    
    public double getLuas(){
        return Matematika.phi*x*x;
    }
    
    public double getKeliling(){
        return 2*Matematika.phi*x;
    }

    @Override
    public String toString() {
        return "Lingkaran{" + "x=" + x + '}';
    }

    
    
}

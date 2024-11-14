public class Hinhtron extends Hinhhoc{
  
    private double banKinh;
    
    public Hinhtron(double banKinh) {
        this.banKinh = banKinh;
    }
    @Override
    public double Dientich() {
       
        return Math.PI * Math.pow(banKinh, 2);
    }

    @Override
    public double Chuvi() {
      
        return 2 * Math.PI * banKinh;
    }
 
    
}
public class Hinhvuong extends Hinhhoc {
    private double Canh;
    
    public Hinhvuong(double canh) {
        this.Canh = canh;
    }
    
    @Override
    public double Dientich() {
        return  Canh * Canh;
    }
    
    @Override
    public double Chuvi() {
        return 4 * Canh;
    }

    
}

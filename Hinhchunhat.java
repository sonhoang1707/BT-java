public class Hinhchunhat extends Hinhhoc{
    double Chieudai;
    double Chieurong;
    
    public Hinhchunhat(double cd, double cr) {
        Chieudai = cd;
        Chieurong = cr;
    }
    
    @Override
    public double Dientich() {
        return Chieudai * Chieurong;
    }
    
    @Override
    public double Chuvi() {
        return 2 * (Chieudai + Chieurong);
    }
}

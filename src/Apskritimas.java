public class Apskritimas {

    private double spindulys;

    //konstruktorius


    public Apskritimas() {
    }

    public Apskritimas(double spindulys) {
        this.spindulys = Math.abs(spindulys);
    }

    // geteriai ir seteriai


    public double getSpindulys() {
        return spindulys;
    }

    public void setSpindulys(double spindulys) {
        this.spindulys = Math.abs(spindulys);
    }

    // to String

    @Override
    public String toString() {
        return "Apskritimas{" +
                "spindulys=" + spindulys +
                '}';
    }

    // metodai

    public double skersmuo() {
        return spindulys * 2;
    }

    public double apskritimoIlgis(){
        return 2 * Math.PI * spindulys;
    }
    public double apskritimoPlotas(){
        return  Math.PI * Math.pow(spindulys, 2);
    }
}



public class PagrindinePrograma {
    public static void main(String[] args) {
        Apskritimas aps=new Apskritimas(8);
        Apskritimas aps1=new Apskritimas(27.368);
        Apskritimas aps2=new Apskritimas(1048.671);
        Apskritimas aps3=new Apskritimas(-25);

        aps3.setSpindulys(-10);


        System.out.println("aps.getSpindulys() = " + aps.getSpindulys());
        System.out.println("aps.skersmuo() = " + aps.skersmuo());
        System.out.println("aps.apskritimoIlgis() = " + aps.apskritimoIlgis());
        System.out.println("aps.apskritimoPlotas() = " + aps.apskritimoPlotas());

        System.out.println("aps.getSpindulys() = " + aps1.getSpindulys());
        System.out.println("aps.skersmuo() = " + aps1.skersmuo());
        System.out.println("aps.apskritimoIlgis() = " + aps1.apskritimoIlgis());
        System.out.println("aps.apskritimoPlotas() = " + aps1.apskritimoPlotas());

        System.out.println("aps.getSpindulys() = " + aps2.getSpindulys());
        System.out.println("aps.skersmuo() = " + aps2.skersmuo());
        System.out.println("aps.apskritimoIlgis() = " + aps2.apskritimoIlgis());
        System.out.println("aps.apskritimoPlotas() = " + aps2.apskritimoPlotas());

        System.out.println("aps.getSpindulys() = " + aps3.getSpindulys());
        System.out.println("aps.skersmuo() = " + aps3.skersmuo());
        System.out.println("aps.apskritimoIlgis() = " + aps3.apskritimoIlgis());
        System.out.println("aps.apskritimoPlotas() = " + aps3.apskritimoPlotas());
        

    }
}

package pointer.listIterator;

public class Car {
    String names;
    String years;
    int radius;
    int diameterHelm;
    String color;
    String body;
    boolean sWB;


     Car(String names, String years, int radius, int diamHelm, String color, String body, boolean sWB) {
         this.names = names;
        this.years = years;
        this.radius = radius;
        this.diameterHelm = diamHelm;
        this.color = color;
        this.body = body;
        this.sWB = sWB;


    }

    Car(String names, String years, String body) {
         this.names = names;
         this.years = years;
         this.body = body;

    }

    public String getNames() {
        return names;
    }

    public String getYears() {
        return years;
    }

    public int getRadius() {
        return radius;
    }

    public String setRadius(String radius) {
        return radius;
    }

    public int getDiameterHelm() {
        return diameterHelm;
    }

    public String getColor() {
        return color;
    }

    public String getBody() {
        return body;
    }

    public  boolean getsWm(){
         return sWB;
     }
}



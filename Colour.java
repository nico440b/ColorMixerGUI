package sample;

import java.util.Objects;

public class Colour {

    private int red,
                green,
                blue;

    public Colour(int red, int green, int blue){

        this.red = red;
        this.green = green;
        this.blue = blue;
    }


    public void setRed(int red) {
        this.red = red;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public boolean isGrey (){

        if(red==green&&red==blue){
            return true;
        }
        return false;
    }
    public void mixWith (Colour colour2){

        red = (colour2.getRed()+red>>1) + (colour2.getRed()+red)%2;
        green = (colour2.getGreen()+green>>1) + (colour2.getRed()+green)%2;
        blue = (colour2.getBlue()+blue>>1) + (colour2.getBlue()+blue)%2;
    }

    public Colour copy(){
        Colour colour = new Colour(red,green,blue);
        return colour;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Colour colour = (Colour) o;
        return red == colour.red &&
                green == colour.green &&
                blue == colour.blue;
    }


    public int hashCode() {
        return Objects.hash(red, green, blue);
    }

    public String toString() {
        return "Colour{" + "red=" + red + ", green=" + green + ", blue=" + blue + '}';
    }
}

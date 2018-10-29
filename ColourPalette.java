package sample;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;


public class ColourPalette {

    private int numberOfColours;


    List<Colour> colours = new LinkedList<>();

    public ColourPalette(int maxNumberOfColours){

        this.numberOfColours = maxNumberOfColours;
    }

    public int getNumberOfColours(){
        return colours.size();
    }

    public void addColour(Colour colour){
        colours.add(colour);
    }

    public Colour getColour(int index){
        if(index<colours.size()){
            return colours.get(index);
        }
        return null;
    }
    public int getNumberOfGreyColours(){
        int numberOfGreys = 0;
            for(Colour colour :colours){
                if(colour.isGrey())
                    numberOfGreys++;
                }

        return numberOfGreys;
    }

    public void mixColour(Colour colour1,Colour colour2){
        colour1.mixWith(colour2);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ColourPalette that = (ColourPalette) o;
        return numberOfColours == that.numberOfColours &&
                Objects.equals(colours, that.colours);
    }
    public int hashCode() {
        return Objects.hash(numberOfColours, colours);
    }


    public String toString() {
        return "ColourPalette{" + "numberOfColours=" + numberOfColours + ", colours=" + colours + '}';
    }
}

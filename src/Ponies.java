public class Ponies {
    // true/false -> boolean
    // numbers -> int, double
    //words -> Strings

    public boolean isUnicorn;
    public boolean isPegasus;
    public double size;
    public String name;
    public String color;

    public Ponies(String pName, String pColor, double pSize, boolean pUnicorn, boolean pPegasus){
        System.out.println("made a new pony!");
        isUnicorn = pUnicorn;
        isPegasus = pPegasus;
        size = pSize;
        name = pName;
        color = pColor;
    }

    public void describePony(){
        System.out.println("this is pony " + name + " they are the color " + color + " with a size of " + size + ". It is " + isUnicorn + " that the pony is a Unicorn. It is " + isPegasus + " that the pony is a pegasus.");
    }
}

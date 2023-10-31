public class Ponies {
    // true/false -> boolean
    // numbers -> int, double
    //words -> Strings

    public boolean isUnicorn = false;
    public boolean isPegasus = false;
    public double size = 20.56;
    public String name = "bobby";
    public String color = "Pink";

    public void describePony(){
        System.out.println("this is pony " + name + " they are the color " + color + " with a size of " + size + ". It is " + isUnicorn + " that the pony is a Unicorn. It is " + isPegasus + " that the pony is a pegasus.");
    }
}

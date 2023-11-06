public class Main {
    public static void main(String[] args){
        System.out.println("Hello Object Factory!");
        Ponies p;
        p = new Ponies("Bobby", "Pink", 20.56, true, false);
        System.out.println("pony p's name is " + p.name);

        Ponies t;
        t = new Ponies("Teddy", "Red", 11.11, false, false);
        System.out.println("pony t's name is " + t.name);

        Ponies r;
        r = new Ponies("Ronald", "Magenta", 16.42, false, true);
        System.out.println("pony g's name is " + r.name);

        Ponies l;
        l = new Ponies();
        System.out.println("pony l's name is " + l.name);

        Ponies b;
        b = new Ponies("Brandon", "White", 14.23, true, true);
        System.out.println("pony a's name is " + b.name);
    }
}
public class Main {
    public static void main(String[] args){
        System.out.println("Hello Object Factory!");
        Ponies p;
        p = new Ponies("Bobby", "Pink", 20.56, true, false);
        System.out.println(p.isUnicorn);
        System.out.println(p.name);

        p.describePony();

        Ponies a;
        a = new Ponies("Teddy", "Red", 11.11, false, false);
        System.out.println("pony a's name is " + a.name);
        a.describePony();

        Ponies r;
        r = new Ponies("Ronald", "Magenta", 16.42, false, true);
        System.out.println("pony g's name is " + r.name);
        r.describePony();
    }
}
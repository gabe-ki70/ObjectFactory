public class Main {
    public static void main(String[] args){
        System.out.println("Hello Object Factory!");
        Ponies p = new Ponies();
        System.out.println(p.isUnicorn);
        p.isUnicorn = true;
        System.out.println(p.isUnicorn);
    }
}
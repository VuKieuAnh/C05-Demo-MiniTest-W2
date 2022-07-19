public class Demo {
    static {
        System.out.println("Static");

    }
    static int id;

    public Demo() {
        System.out.println("Ham khoi tao");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        Demo.id=10;
    }
}

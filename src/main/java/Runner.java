public class Runner {
    public static void main(String[] args) {
        Planet mars = new Planet("Mars", 908973);
        String name = mars.getName();
        long size = mars.getSize();
        String explode = mars.explode();
        String marsInfo = mars.getName() + " is " + mars.getSize();

        System.out.println(name);
        System.out.println(size);
        System.out.println(marsInfo);
        System.out.println(explode);

    }
}

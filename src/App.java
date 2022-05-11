public class App {
    public static void main(String[] args) throws Exception {

        Semaforo semaforoU = new Semaforo(2);
        Semaforo semaforoD = new Semaforo(2);

        Bagno uomini = new Bagno(semaforoU);
        Bagno donne = new Bagno(semaforoD);

        Persona p = new Persona("M", uomini);
        Persona p2 = new Persona("G", uomini);
        Persona p3 = new Persona("F", uomini);

        Persona p4 = new Persona("A", donne);
        Persona p5 = new Persona("L", donne);
        Persona p6 = new Persona("E", donne);

        p.start();
        p2.start();
        p3.start();

        p4.start();
        p5.start();
        p6.start();

        p.join();
        p2.join();
        p3.join();

        p4.join();
        p5.join();
        p6.join();

        System.out.println("Bagno vuoto :p");
    }
}

public class Persona extends Thread{
    String nome;
    Bagno bagno;

    public Persona(String n, Bagno b) {
        nome = n;
        bagno = b;
    }

    public void run() {
        try {
            bagno.semaforo.p();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bagno.usa(nome);
        bagno.semaforo.v();
    }
}

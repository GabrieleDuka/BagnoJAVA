public class Bagno {
    public Semaforo semaforo;

    public Bagno(Semaforo s) {
        semaforo = s;
    }

    public void usa(String nome) {
        System.out.println(nome + " è entrato nel bagno");
        try {
            Thread.sleep((long)Math.random()*1000);
        }catch (Exception e) {
            System.out.println("errore nell'entrata");
        }
        System.out.println(nome + " è uscito dal bagno");
    }
}

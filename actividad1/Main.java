package net.ddns.pablotic;

/**
 *
 * @author ALEXANDRE_DOMINGUEZ_AVENDANO
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        // ======================= COMPLETAR =======================
        // creas el muelle: new Muelle("Norte")
        Muelle muelle = new Muelle("Norte");
        // creas el productor: new Carretera("CARRETERA", muelle, 1, 3)
        Carretera carretera = new Carretera("CARRETERA", muelle, 1, 3);
        // creas el consumidor: new Ferry("FERRY", muelle, "Sur", 20, 3, 3)
        Ferry ferry = new Ferry("FERRY", muelle, "Sur", 20, 3, 3);
        // haces la carretera daemon (setDaemon) para que el programa acabe cuando acabe el ferry
        carretera.setDaemon(true);
        // lanzas los dos hilos (start)
        carretera.start();
        ferry.start();
        // esperas a que termine el ferry (join) y muestras un mensaje final
        ferry.join();
        System.out.println("Todos los viajes han terminado.");
        // =========================================================
    }
}

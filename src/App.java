public class App {
    public static void main(String[] args) throws Exception {
        Spogliatoio spo=new Spogliatoio();
        Semaforo s=new Semaforo(2);
        Semaforo semP=new Semaforo(4);
        Pista pis=new Pista(semP);

        Pilota p=new Pilota("vivo", s, spo, pis);
        Pilota p1=new Pilota("spolve", s, spo, pis);
        Pilota p2=new Pilota("tossa", s, spo, pis);
        Pilota p3=new Pilota("profBenvenuti", s, spo, pis);
        Pilota p4=new Pilota("hamilton", s, spo, pis);
        Pilota p5=new Pilota("chals", s, spo, pis);
        Pilota p6=new Pilota("sainz", s, spo, pis);
        Pilota p7=new Pilota("norris", s, spo, pis);


        p.start();
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();

        p.join();
        p1.join();
        p2.join();
        p3.join();
        p4.join();
        p5.join();
        p6.join();
        p7.join();

        System.out.println("classifica!");
        pis.classifica();
    }
}

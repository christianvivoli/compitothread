public class Pilota extends Thread{
    String nome;
    Spogliatoio spo;
    Semaforo s;
    Pista p;

    public Pilota(String nome,Semaforo s,Spogliatoio spo,Pista pis){
        this.nome=nome;
        this.s=s;
        this.spo=spo;
        this.p=pis;
    }

    public void run(){
        //prima volta dentro lo spogliatoio
        s.p();
        spo.entrata(nome);
        s.v();

        p.add(nome);

        System.out.println(nome+" è uscita/o dalla pista");

        s.p();
        spo.entrata(nome);
        s.v();
    }
}

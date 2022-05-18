import java.util.ArrayList;
import java.util.Collections;

public class Pista {
    long start;
    long stop;
    long tot;
    ArrayList<Risultati> lista;

    Semaforo se;

    Risultati r;
 
    public Pista(Semaforo s){
        lista=new ArrayList<>();
        this.se=s;
    }

    public void add(String s){
        
        se.p();

        System.out.println(" è entrato in pista "+s);

        start = System.nanoTime();
        for(int i=0;i<15;i++){
            try{
                Thread.sleep((long)(Math.random() * 1000));
            }catch(Exception e){}
        }
        stop=System.nanoTime();

        tot=(stop-start) / 1000000;
        r=new Risultati(tot,s);

        lista.add(r);

        Collections.sort(lista);
        
        se.v();

    }

    public void classifica(){
        int k=1;

        for(int i=0;i<lista.size();i++){
            System.out.println("il "+k+" è "+lista.get(i).getRisultato()+" il nome è "+lista.get(i).getNome());
            k++;
        }
    }
}

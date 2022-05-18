public class Semaforo{
    int val;
/**
 * 
 * @param v
 * <p>il numero di semafori che controllano l azzione</p>
 */
    public Semaforo(int v){
        val=v;
    }

    synchronized public void p(){
        while(val==0){
            try{
                wait(); 
            }catch(InterruptedException e){}  
        }
        val--;
    }
    synchronized public void v(){
        val++;
        notify();
    }
}


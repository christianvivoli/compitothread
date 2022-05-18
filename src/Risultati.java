public class Risultati implements Comparable<Risultati>{
    long risultato;
    String nome;

    public Risultati(long r,String nome){
        risultato=r;
        this.nome=nome;
    }


    public long getRisultato(){
        return risultato;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public int compareTo(Risultati o) {
        if(this.getRisultato()<o.getRisultato()){
            return -1;
        }
        if(this.getRisultato()>o.getRisultato()){
            return 1;
        }
        return 0;
    }

}

public class Spogliatoio {
    public Spogliatoio(){

    }

    public void entrata(String n){
        try{
            System.out.println("la persona "+n+" è entrata/o");
            Thread.sleep((long)(Math.random() * 1000));
        }catch(Exception e){}
        System.out.println("la persona "+n+" uscita/o");
    }

}

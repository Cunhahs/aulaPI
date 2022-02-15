public class Main {
   
    public static void main(String []args) {
    
       Drone meuDrone = new Drone(2);
     //  meuDrone.setHelices(3);
       meuDrone.setAltura(10);
       
       System.out.println(" " + meuDrone.getHelices()+ " " + " " + meuDrone.getAltura() + meuDrone.pousar() + " ");
    }
}

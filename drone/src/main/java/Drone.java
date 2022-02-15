public class Drone {
    
    private int helices;
    private String motor;
    private String controle;
    private int camera;
    private int velocidade;
    private int altura;
    
    public Drone(){
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public Drone(int helices){
        this.helices = helices; 
    } 
    
     public Drone(String motor){
        motor = "Trifase"; 
    } 
    
    public void decolar(){
        this.altura += 2;
    }
    
    public int pousar(){
        this.altura -= 2;
        return altura;
    }
    
    public void frear(){
        velocidade -= 10;
    }

    public void setHelices(int helices) {
        this.helices = helices;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setControle(String controle) {
        this.controle = controle;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getHelices() {
        return helices;
    }

    public String getMotor() {
        return motor;
    }

    public String getControle() {
        return controle;
    }

    public int getCamera() {
        return camera;
    }

    public int getVelocidade() {
        return velocidade;
    }
}

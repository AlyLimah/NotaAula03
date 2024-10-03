public class Animal {
    private String Nome;
    private String Raça;

    public Animal() {
    }

    public Animal(String Nome){
        this.Nome = Nome;
    }

    public void setNome(String Nome){
        this.Nome = Nome;
    }

    public String getNome(){
        return Nome;
    }

    public void setRaça(String raça){
        this.Raça = raça;
    }

    public String getRaça(){
        return Raça;
    }

    void caminha(){
        System.out.println( Nome + " está caminhando");
    }

}

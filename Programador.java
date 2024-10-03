public class Programador extends Funcionario{
    private String linguagem;

    public void setlinguagem(String linguagem){
        this.linguagem = linguagem;
    }

    public String getLinguagem(){
        return linguagem;
    }

    public Programador (String nome, int nasc, double salario, String linguagem){
        super(nome, nasc, salario);
        this.linguagem = linguagem;
    }

    public void informarLinguagem(){
        System.out.println("Linguagem: " + linguagem);
    }
}

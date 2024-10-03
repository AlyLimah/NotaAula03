public class Gerente extends Funcionario{
    private String projeto;

    public void setprojeto (String projeto) {
        this.projeto = projeto;
    }
    public String getprojeto() {
        return projeto;
    }
    public Gerente (String nome, int nasc, double salario, String projeto){
        super(nome, nasc, salario);
        this.projeto = projeto;
    }
    public void informarProjeto(){
        System.out.println("Projeto: " + projeto);
    }
}

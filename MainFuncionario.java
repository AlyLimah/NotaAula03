public class MainFuncionario {
    public static void main(String[] args) {
        Gerente g = new Gerente("Márcio", 1995, 2.000, "Sistemas de Gestão");
        g.informarProjeto();
        g.calcularIdade();
        g.informarSalario();

        Programador p = new Programador("Alvaro", 2000, 1000, "Python" );
        p.informarLinguagem();
        p.calcularIdade();
        g.informarSalario();

    }
}

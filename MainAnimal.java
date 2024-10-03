public class MainAnimal {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.setNome("Max");
        System.out.println(c.getNome());
        c.setRaça("Husky");
        System.out.println(c.getRaça());
        c.caminha();
        c.late();

        Gato g = new Gato();
        g.setNome("Celina");
        System.out.println(g.getNome());
        g.setRaça("Ragdoll");
        System.out.println(g.getRaça());
        g.caminha();
        g.miar();

    }
}

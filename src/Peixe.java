public class Peixe extends Animal2{
    private String CorScama;

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }

    public void soltarBolha() {
        System.out.println("Soltando Bolha");
    }

    public void setCorScama (String corScama) {
        this.CorScama = corScama;
    }
}

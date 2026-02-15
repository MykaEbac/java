// Classe base (superclasse) - deve existir e ser consistente
class Veiculos {   // ← nome corrigido (sem "s" no final)
    protected String modelo;
    protected String marca;
    protected int velocidadeMaxima;

    public Veiculos (String modelo, String marca, int velocidadeMaxima) {
        this.modelo = modelo;
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void mover() {
        System.out.println("O veículo está se movendo.");
    }
}

// ────────────────────────────────────────────────

class Carro extends Veiculo {    // ← corrigido: Veiculo (sem "s")
    int quantidadeDePortas;
    String motor;

    public Carro(String modelo, String marca, int velocidadeMaxima,
                 int portas, String motor) {
        super(modelo, marca, velocidadeMaxima);
        this.quantidadeDePortas = portas;
        this.motor = motor;
    }

    @Override
    public void mover() {
        System.out.println("O carro " + modelo + " está dirigindo na estrada.");
    }
}

// ────────────────────────────────────────────────

class Moto extends Veiculo {

    int cilindradas;

    public Moto(String modelo, String marca, int velocidadeMaxima, int cilindradas) {
        super(modelo, marca, velocidadeMaxima);
        this.cilindradas = cilindradas;
    }

    @Override
    public void mover() {
        System.out.println("A moto " + modelo + " está acelerando no asfalto.");
    }
}

// ────────────────────────────────────────────────

class Barco extends Veiculo {    // ← corrigido: Veiculo (sem "s")
    String tipoDeCasco;

    public Barco(String modelo, String marca, int velocidadeMaxima, String tipoDeCasco) {
        super(modelo, marca, velocidadeMaxima);
        this.tipoDeCasco = tipoDeCasco;
    }

    @Override
    public void mover() {
        System.out.println("O barco " + modelo + " está navegando na água.");
    }
}

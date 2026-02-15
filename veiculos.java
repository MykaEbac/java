// Classe base (superclasse abstrata)
abstract class Veiculo {
    protected String modelo;
    protected String marca;
    protected int velocidadeMaxima;

    public Veiculo(String modelo, String marca, int velocidadeMaxima) {
        this.modelo = modelo;
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    // Método abstrato → obriga as subclasses a implementarem
    public abstract void mover();

    // Método comum (pode ser sobrescrito)
    public void mostrarInfo() {
        System.out.println("Veículo: " + marca + " " + modelo +
                " | Vel. máx: " + velocidadeMaxima + " km/h");
    }
}

class Carro extends Veiculo {
    private int portas;
    private String motor;

    public Carro(String modelo, String marca, int velocidadeMaxima,
                 int portas, String motor) {
        super(modelo, marca, velocidadeMaxima);
        this.portas = portas;
        this.motor = motor;
    }

    @Override
    public void mover() {
        System.out.println("O carro " + marca + " " + modelo +
                " está rodando na estrada com " + motor);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("   → " + portas + " portas | Motor: " + motor);
    }
}

class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String modelo, String marca, int velocidadeMaxima, int cilindradas) {
        super(modelo, marca, velocidadeMaxima);
        this.cilindradas = cilindradas;
    }

    @Override
    public void mover() {
        System.out.println("A moto " + marca + " " + modelo +
                " está acelerando forte! (" + cilindradas + "cc)");
    }
}

class Barco extends Veiculo {
    private String material;

    public Barco(String modelo, String marca, int velocidadeMaxima, String material) {
        super(modelo, marca, velocidadeMaxima);
        this.material = material;
    }

    @Override
    public void mover() {
        System.out.println("O barco " + marca + " " + modelo +
                " está navegando (" + material + ")");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("   → Material do casco: " + material);
    }
}

public class Principal {
    public static void main(String[] args) {
        Veiculo[] garagem = new Veiculo[3];

        garagem[0] = new Carro("Civic", "Honda", 200, 4, "2.0 Turbo");
        garagem[1] = new Moto("Ninja", "Kawasaki", 280, 600);
        garagem[2] = new Barco("Oceanic", "Intermarine", 80, "Fibra de Vidro");

        System.out.println("=== Testando Polimorfismo ===\n");

        for (Veiculo v : garagem) {
            v.mover();
            v.mostrarInfo();   // mostrando mais detalhes
            System.out.println("---------------------");
        }

        System.out.println("Fim do teste.");
    }
}

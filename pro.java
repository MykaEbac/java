class Veiculos {
    String modelo;
    String marca;
    int velocidadeMaxima;

    public Veiculos(String modelo, String marca, int velocidadeMaxima) {
        this.modelo = modelo;
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void mover() {
        System.out.println("O veículo está se movendo.");
    }
}

class Carro extends Veiculos {
    int quantidadeDePortas;
    String motor;

    public Carro(String modelo, String marca, int velocidadeMaxima, int portas, String motor) {
        super(modelo, marca, velocidadeMaxima);
        this.quantidadeDePortas = portas;
        this.motor = motor;
    }

    @Override
    public void mover() {
        System.out.println("O carro está dirigindo na estrada.");
    }
}

class Moto extends Veiculos {
    int cilindradas;

    public Moto(String modelo, String marca, int velocidadeMaxima, int cilindradas) {
        super(modelo, marca, velocidadeMaxima);
        this.cilindradas = cilindradas;
    }

    @Override
    public void mover() {
        System.out.println("A moto está acelerando no asfalto.");
    }
}

class Barco extends Veiculos {
    String tipoDeCasco;

    public Barco(String modelo, String marca, int velocidadeMaxima, String tipoDeCasco) {
        super(modelo, marca, velocidadeMaxima);
        this.tipoDeCasco = tipoDeCasco;
    }

    @Override
    public void mover() {
        System.out.println("O barco está navegando na água.");
    }
}

public class Principal {
    public static void main(String[] args) {
        // Criando um array de Veiculos (polimorfismo)
        Veiculos[] garagem = new Veiculos[3];

        garagem[0] = new Carro("Civic", "Honda", 200, 4, "2.0 Turbo");
        garagem[1] = new Moto("Ninja", "Kawasaki", 280, 600);
        garagem[2] = new Barco("Oceanic", "Intermarine", 80, "Fibra de Vidro");

        System.out.println("--- Testando o Polimorfismo ---");

        for (Veiculos veiculo : garagem) {
            veiculo.mover();   // chama a versão correta de cada subclasse
        }
    }
}

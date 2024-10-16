package org.unicesumar;

public class Main {
    public static void main(String[] args) {

        Aeroporto aeroportoOrigem = new Aeroporto("Aeroporto Internacional de Guarulhos", "GRU");
        Aeroporto aeroportoDestino = new Aeroporto("Aeroporto Internacional de Miami", "MIA");

        Voo voo1 = new Voo("V1234", 5, aeroportoOrigem, aeroportoDestino);

        Passagem passagem1 = new Passagem(voo1, "Leonardo Teixeira", 1000.0);
        Passagem passagem2 = new Passagem(voo1, "Maria Souza", 1500.0);
// Reservando assentos para teste
        voo1.reservaAssento();
        voo1.reservaAssento();
        voo1.reservaAssento();
        voo1.reservaAssento();
        voo1.reservaAssento();
// Exibir informações sobre os aeroportos de origem e destino
        System.out.println("Passageiro: " + passagem1.getNomePassageiro() );
        System.out.println("Voo: " + voo1.getCodigo());
        System.out.println("Origem: " + voo1.getOrigem().getNome() + " (" + voo1.getOrigem().getCodigo() + ")");
        System.out.println("Destino: " + voo1.getDestino().getNome() + " (" + voo1.getDestino().getCodigo() + ")");
// Calcular o preço total da passagem (incluindo taxa fixa de embarque)
        System.out.println("Valor total da passagem: R$" + passagem1.calcularPrecoTotal());
        System.out.println("");
// Verificar quantidade de assentos disponíveis
        System.out.println("Assentos disponíveis no voo " + voo1.getCodigo() + ": " + voo1.getAssentosDisponiveis());
        System.out.println("Reservando assentos para o voo: " + voo1.getCodigo());
// Tentando reservar além da capacidade
        voo1.reservaAssento();  // Esta reserva deve ser bloqueada
    }
}

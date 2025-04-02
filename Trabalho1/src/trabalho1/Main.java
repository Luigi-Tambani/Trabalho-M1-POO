package trabalho1;


public class Main {
    public static void main(String[] args) {
        hotel hotel = new hotel("Hotel Exemplo");
        quarto quarto1 = new quarto(101, 1);
        hotel.adicionarQuarto(quarto1);

        cargo cargoRecepcionista = new cargo("Recepcionista");
        funcionario funcionario = new funcionario("João", 2500.0, cargoRecepcionista);

        hospede hospede1 = new hospede("Luigi", "Rua Amadeu Ebner, 123", "123456789");
        hospede hospede2 = new hospede("Vitor", "Rua Osvaldo Cruz, 456", "987654321");

        reserva reserva = new reserva("01/04/2025", "05/04/2025", quarto1);
        reserva.checkin(new hospede[]{hospede1, hospede2});

        System.out.println("Reserva criada e check-in realizado para " + reserva.getHospedes().size() + " hóspedes.");
    }
}


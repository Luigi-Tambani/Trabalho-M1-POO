package com.mycompany.trabalho01;


import java.util.ArrayList;
import java.util.List;

class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Quarto {
    private int numero;
    private boolean reservado;

    public Quarto(int numero) {
        this.numero = numero;
        this.reservado = false;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void reservar() {
        this.reservado = true;
    }

    public void liberar() {
        this.reservado = false;
    }
}

class Reserva {
    private Cliente cliente;
    private Quarto quarto;

    public Reserva(Cliente cliente, Quarto quarto) {
        this.cliente = cliente;
        this.quarto = quarto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Quarto getQuarto() {
        return quarto;
    }
}

class Hotel {
    private List<Quarto> quartos;
    private List<Reserva> reservas;

    public Hotel() {
        this.quartos = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void adicionarQuarto(Quarto quarto) {
        for (Quarto q : quartos) {
            if (q.getNumero() == quarto.getNumero()) {
                System.out.println("Quarto " + quarto.getNumero() + " já existe no sistema.");
                return;
            }
        }
        quartos.add(quarto);
    }

    public boolean fazerReserva(Cliente cliente, int numeroQuarto) {
        for (Quarto quarto : quartos) {
            if (quarto.getNumero() == numeroQuarto && !quarto.isReservado()) {
                quarto.reservar();
                reservas.add(new Reserva(cliente, quarto));
                return true;
            }
        }
        return false;
    }
    
    public boolean cancelarReserva(int numeroQuarto) {
        for (Reserva reserva : reservas) {
            if (reserva.getQuarto().getNumero() == numeroQuarto) {
                reserva.getQuarto().liberar();
                reservas.remove(reserva);
                System.out.println("Reserva do quarto " + numeroQuarto + " cancelada.");
                return true;
            }
        }
        System.out.println("Não foi encontrada reserva para o quarto " + numeroQuarto + ".");
        return false;
    }
}

public class Trabalho01 {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Quarto quarto101 = new Quarto(101);
        Quarto quarto102 = new Quarto(102);
        hotel.adicionarQuarto(quarto101);
        hotel.adicionarQuarto(quarto102);
        hotel.adicionarQuarto(quarto101); // Tentativa de adicionar o mesmo quarto

        Cliente cliente = new Cliente("Vitor");
        boolean reservaFeita = hotel.fazerReserva(cliente, 101);
        
        if (reservaFeita) {
            System.out.println("Reserva realizada com sucesso para o quarto " + 101);
        } else {
            System.out.println("Falha na reserva. O quarto pode já estar reservado.");
        }
        
        hotel.cancelarReserva(101); // Teste de cancelamento
    }
}
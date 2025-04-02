
package trabalho1;

import java.util.*;

class hotel {
    private String nome;
    private List<quarto> quartos;

    public hotel(String nome) {
        this.nome = nome;
        this.quartos = new ArrayList<>();
    }

    public void adicionarQuarto(quarto quarto) {
        quartos.add(quarto);
    }
}

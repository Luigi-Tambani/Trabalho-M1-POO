
package trabalho1;

import java.util.*;

import java.util.*;

public class reserva {
    private String dataEntrada;
    private String dataSaida;
    private List<hospede> hospedes;
    private veiculo veiculo;
    private quarto quarto;

    public reserva(String dataEntrada, String dataSaida, quarto quarto) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.hospedes = new ArrayList<>();
        this.quarto = quarto;
    }

    public void checkin(hospede[] hospedes) {
        this.hospedes.addAll(Arrays.asList(hospedes));
    }

    public void checkout() {
        this.hospedes.clear();
    }

    public void cancelar() {
        this.hospedes.clear();
        this.veiculo = null;
    }
    public List<hospede> getHospedes() {
        return hospedes;
    }
}

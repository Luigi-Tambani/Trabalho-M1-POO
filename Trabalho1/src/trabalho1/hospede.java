
package trabalho1;

public class hospede extends pessoa {
    private String endereco;
    private String documento;

    public hospede(String nome, String endereco, String documento) {
        super(nome);
        this.endereco = endereco;
        this.documento = documento;
    }
}



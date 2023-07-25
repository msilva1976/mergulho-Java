package mergulhojava.banco.modelo;

public class Pessoa {
    private  final String nome;
    private final String documento;

    public Pessoa(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    

    public String getDocumento() {
        return documento;
    }

   

   
}

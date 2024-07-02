public class PessoaConstr {
    String nome;
    int idade;
    String datnasc;
    String rg;
    String cpf;
    String nomedPa;
    String nomedMa;
    String peso;
    String altura;
    String numero;
    String email;

    public PessoaConstr(String nome, int idade, String datnasc, String rg, String cpf,
                  String nomedPa, String nomedMa, String peso, String altura,
                  String numero, String email) {
        this.nome = nome;
        this.idade = idade;
        this.datnasc = datnasc;
        this.rg = rg;
        this.cpf = cpf;
        this.nomedPa = nomedPa;
        this.nomedMa = nomedMa;
        this.peso = peso;
        this.altura = altura;
        this.numero = numero;
        this.email = email;
    }
}
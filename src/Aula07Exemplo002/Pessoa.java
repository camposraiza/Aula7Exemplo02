package Aula07Exemplo002;


public class Pessoa {
    String nome;
    Integer idade;

    public Pessoa() {
        nome = "";
        idade = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    
    @Override
    public String toString(){
        return this.nome+ "; " + this.idade + " anos";
    }
}

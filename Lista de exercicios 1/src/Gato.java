/*
Exercício 1 – Crie uma classe chamada Gato
    A – crie 4 atributos:
        vivo: boolean //identifica se o animal está vivo
        cor: String
        idade: int
        nome: String
    B – crie um método chamado miar() que imprima no console: “Gato miando“
*/

public class Gato {
    boolean vivo;
    private String cor,nome;
    private int idade;

    public Gato() {
    }

    public void setCor(String novaCor) {
        cor=novaCor;
    }
    public String getCor() {
        return cor;
    }
    public void setNome(String novoNome) {
        nome=novoNome;
    }
    public String getNome() {
        return nome;
    }
    public void setIdade(int novaIdade) {
        idade = novaIdade;
    }
    public int getIdade() {
        return idade;
    }

    public void miar() {
        System.out.println("Gato miando");
    }
}
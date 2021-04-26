package one.digitalinnovation.aulaprojeto07;

public class CalculoPessoa {
    private String nome;
    private float peso;
    private float altura;

    CalculoPessoa(String nome,float peso, float altura){
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public float getImc(float altura, float peso){
        return altura/peso;

    }
}

package Prototype;

public class Personagem implements Cloneable{
    private String nome;
    private int vida;

    public Personagem(String nome, int vida){
        this.nome = nome;
        this.vida = vida;
    }

    public String getNome(){
        return nome;
    }
    public int getVida(){
        return vida;
    }

    @Override
    public Personagem clone() throws CloneNotSupportedException{
        return (Personagem) super.clone();
    }
}

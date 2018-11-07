package Business.Model.Produtos;

import Business.Model.Entidade;

public class Produto extends Entidade {

    private String nome;
    private String material;
    private boolean impressoFrente;
    private boolean impressoVerso;
    private double valor;

    public Produto(String id, String nome, String material, boolean frente, boolean verso, double valor) {
    
        setId(id);
        this.nome = nome;
        this.material = material;
        this.impressoFrente = frente;
        this.impressoVerso = verso;
        this.valor = valor;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isImpressoFrente() {
        return impressoFrente;
    }

    public void setImpressoFrente(boolean impressoFrente) {
        this.impressoFrente = impressoFrente;
    }

    public boolean isImpressoVerso() {
        return impressoVerso;
    }

    public void setImpressoVerso(boolean impressoVerso) {
        this.impressoVerso = impressoVerso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    

}

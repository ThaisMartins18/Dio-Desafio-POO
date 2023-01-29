package desafio.dominio;

public abstract class Conteudo { 

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String decricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return this.decricao;
    }

    public void setDescricao(String decricao) {
        this.decricao = decricao;
    }





}

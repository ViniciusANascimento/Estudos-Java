

public abstract class Conteudo {

	protected static final double XP_PADRAO = 10d;

	private String titulo;
	private String descriacao;

	public abstract double calcularXP();
    
	

    /**
     * @return String return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return String return the descriacao
     */
    public String getDescriacao() {
        return descriacao;
    }

    /**
     * @param descriacao the descriacao to set
     */
    public void setDescriacao(String descriacao) {
        this.descriacao = descriacao;
    }

}
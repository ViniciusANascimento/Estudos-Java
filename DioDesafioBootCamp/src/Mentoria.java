import java.time.LocalDate;

public class Mentoria extends Conteudo{
	private LocalDate data;

    /**
     * @return LocalDate return the data
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20;
    }

    @Override
    public String toString() {
        return "Mentoria { "+
                "titulo = " + getTitulo() + " | " +
                ", descricacao = " + getDescriacao() + " | " +
                ", data = " + data + "}";
            
        }
}

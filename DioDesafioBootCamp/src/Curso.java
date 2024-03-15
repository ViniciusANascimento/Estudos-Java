
public class Curso extends Conteudo{

	private int cargaHoraria;

    /**
    
     * @return int return the cargaHoraria
     */
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * @param cargaHoraria the cargaHoraria to set
     */
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }	
}

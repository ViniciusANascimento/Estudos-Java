import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String nome;
	private Set<Conteudo> conteudoInscrito = new LinkedHashSet<>();
	private Set<Conteudo> conteudoConcluido = new LinkedHashSet<>();

	public void inscreverBootCamp(BootCamp bootcamp){
		this.conteudoInscrito.addAll(bootcamp.getConteudo());
		bootcamp.getDevInscritos().add(this);
	}

	public void progredir(){
		Optional<Conteudo> conteudo= this.conteudoInscrito.stream().findFirst();
		if(conteudo.isPresent()){
			this.conteudoConcluido.add(conteudo.get());
			this.conteudoInscrito.remove(conteudo.get());
		}else{
			System.err.println("Voce nao esta matriculado em nenhum conteudo! ");
		}
	}

	public double calcularTotalXP(){
		this.conteudoConcluido.stream().mapToDouble(conteudo -> conteudo.calcularXP()).sum();
		return 0;

	}

	

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return Set<Conteudo> return the conteudoInscrito
     */
    public Set<Conteudo> getConteudoInscrito() {
        return conteudoInscrito;
    }

    /**
     * @param conteudoInscrito the conteudoInscrito to set
     */
    public void setConteudoInscrito(Set<Conteudo> conteudoInscrito) {
        this.conteudoInscrito = conteudoInscrito;
    }

    /**
     * @return Set<Conteudo> return the conteudoConcluido
     */
    public Set<Conteudo> getConteudoConcluido() {
        return conteudoConcluido;
    }

    /**
     * @param conteudoConcluido the conteudoConcluido to set
     */
    public void setConteudoConcluido(Set<Conteudo> conteudoConcluido) {
        this.conteudoConcluido = conteudoConcluido;
    }
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((conteudoInscrito == null) ? 0 : conteudoInscrito.hashCode());
		result = prime * result + ((conteudoConcluido == null) ? 0 : conteudoConcluido.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (conteudoInscrito == null) {
			if (other.conteudoInscrito != null)
				return false;
		} else if (!conteudoInscrito.equals(other.conteudoInscrito))
			return false;
		if (conteudoConcluido == null) {
			if (other.conteudoConcluido != null)
				return false;
		} else if (!conteudoConcluido.equals(other.conteudoConcluido))
			return false;
		return true;
	}

	
}

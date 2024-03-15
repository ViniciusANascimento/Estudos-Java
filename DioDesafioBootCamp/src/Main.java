import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("Cuso Java");
        curso1.setDescriacao(" Descricacao do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("Cuso JavaScript");
        curso1.setDescriacao(" Descricacao do curso JavaScript");
        curso1.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescriacao("Descricao mentoria Java");
        mentoria.setData(LocalDate.now());

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java Developer");
        bootCamp.setDescricao("Descricao BootCamp Java");
        bootCamp.getConteudo().add(curso1);

        Dev devVinicius = new Dev();
        devVinicius.setNome("Vinicius");
        devVinicius.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos Inscritos : " + devVinicius.getConteudoInscrito());
        devVinicius.progredir();
        System.out.println(" * - * ");
        System.out.println("Conteudos Inscritos : " + devVinicius.getConteudoInscrito());
        System.out.println("Conteudos Concluidos : " + devVinicius.getConteudoConcluido());
        System.out.println("XP: " + devVinicius.calcularTotalXP());

        System.out.println("*--------------------------*");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos Inscritos : " + devCamila.getConteudoInscrito());
        devCamila.progredir();
        System.out.println(" * - * ");
        System.out.println("Conteudos Inscritos : " + devCamila.getConteudoInscrito());
        System.out.println("Conteudos Concluidos : " + devCamila.getConteudoConcluido());
        System.out.println("XP: " + devCamila.calcularTotalXP());
        

    }
}

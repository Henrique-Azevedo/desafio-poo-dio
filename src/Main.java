import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("curso de java intermediario");
        curso1.setCargaHoraria(9);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("curso de javascript");
        curso2.setCargaHoraria(7);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("mentoria de java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devHenrique = new Dev();
        devHenrique.setNome("Henrique");
        devHenrique.inscreverBootcamp(bootcamp);
        System.out.println(devHenrique.getNome() + "\nConteúdos Inscritos" + devHenrique.getConteudoInscritos());
        devHenrique.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devHenrique.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos" + devHenrique.getConteudoConcluidos());

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println(devPedro.getNome()+"\nConteúdos Inscritos" + devPedro.getConteudoInscritos());
        devPedro.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devPedro.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos" + devPedro.getConteudoConcluidos());

    }
}












import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       Curso curso1=new Curso();
       curso1.setTitulo("Curso Java");
       curso1.setDescricao("Descrição curso Java");
       curso1.setCargaHoraria(81);

        Curso curso2=new Curso();
        curso2.setTitulo("Curso Java Android");
        curso2.setDescricao("Descrição curso Java Android");
        curso2.setCargaHoraria(14);

        Mentoria mentoria1=new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Mentoria do curso de Java");
        mentoria1.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Back-end");
        bootcamp.setDescricao("Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1=new Dev();
        dev1.setNome("Joca");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Joca: "+dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteudos inscritos Joca: "+dev1.getConteudosInscritos());
        System.out.println("Conteudos concluidos Joca: "+dev1.getConteudosConcluidos());
        System.out.println("XP:"+dev1.calcularTotalXp());

        System.out.println("*******************");

        Dev dev2=new Dev();
        dev2.setNome("Camila");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Camila: "+dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Conteudos inscritos Camila: "+dev2.getConteudosInscritos());
        System.out.println("Conteudos concluidos Camila: "+dev2.getConteudosConcluidos());
        System.out.println("XP:"+dev2.calcularTotalXp());
    }
}
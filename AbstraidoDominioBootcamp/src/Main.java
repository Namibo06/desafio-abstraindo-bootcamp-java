import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescriçao("descriçao curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Javascript");
        curso2.setDescriçao("descriçao curso Javascript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescriçao("descriçao mentoria java");
        mentoria.setData(LocalDate.now());

         System.out.println(curso1);
         System.out.println(curso2);
        System.out.println(mentoria);
    }
}
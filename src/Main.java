import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Curso
        Curso curso1 = new Curso("Java Básico", "Aprenda o básico de Java", 8);
        Curso curso2 = new Curso("Java Avançado", "Aprenda conceitos avançados de Java", 16);

        // Criando instância de Mentoria
        Mentoria mentoria1 = new Mentoria("Mentoria Java", "Tire suas dúvidas sobre Java", LocalDate.now());

        // Criando instância de Bootcamp
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java", "Bootcamp completo de Java");

        // Criando instância de Dev
        Dev dev1 = new Dev("João");

        // Inscrevendo o dev nos cursos e mentorias
        dev1.inscreverCurso(curso1);
        dev1.inscreverCurso(curso2);
        dev1.inscreverMentoria(mentoria1);

        // Exibindo as inscrições do dev
        System.out.println("Cursos inscritos de " + dev1.getNome() + ": ");
        for (Curso curso : dev1.getCursosInscritos()) {
            System.out.println(curso.getTitulo());
        }

        System.out.println("Mentorias inscritas de " + dev1.getNome() + ": ");
        for (Mentoria mentoria : dev1.getMentoriasInscritas()) {
            System.out.println(mentoria.getTitulo());
        }
    }
}


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descricao curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao Mentoria");
        mentoria.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila:\n" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("----------------------------");
        System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("----------------------------");

        Dev devAmanda = new Dev();
        devAmanda.setNome("Amanda");
        devAmanda.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Amanda" + devAmanda.getConteudosInscritos());
        devAmanda.progredir();
        devAmanda.progredir();
        System.out.println("----------------------------");
        System.out.println("Conteudos Inscritos Amanda" + devAmanda.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Amanda: " + devAmanda.getConteudosConcluidos());
        System.out.println("XP: " + devAmanda.calcularTotalXp());

        System.out.println("----------------------------");

        Dev devEdgar = new Dev();
        devEdgar.setNome("Edgar");
        devEdgar.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Edgar" + devEdgar.getConteudosInscritos());
        devEdgar.progredir();
        devEdgar.progredir();
        devEdgar.progredir();
        System.out.println("----------------------------");
        System.out.println("Conteudos Inscritos Edgar" + devEdgar.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Edgar: " + devEdgar.getConteudosConcluidos());
        System.out.println("XP: " + devEdgar.calcularTotalXp());
    }
}

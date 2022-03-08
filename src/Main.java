import com.dio.desafios.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Javascript");
        curso2.setDescricao("descrição curso JavaScript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Java Dev");
        bootcamp.setDescricao("Descrição BootCamp Java Dev");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1= new Dev();
        dev1.setNome("Eudenes");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: "+ dev1.getConteudosInscritos());
        System.out.println(" Xp : " + dev1.calcularTotalXp());
        dev1.progredir();
        System.out.println("Conteudos inscritos: "+ dev1.getConteudosInscritos());
        System.out.println("Conteudos concluidos: "+ dev1.getConteudosConcluidos());
        System.out.println(" Xp : " + dev1.calcularTotalXp());

        System.out.println(" -----------");

        Dev dev2= new Dev();
        dev2.setNome("Mayra");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: "+ dev2.getConteudosInscritos());
        System.out.println(" Xp : " + dev2.calcularTotalXp());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteudos inscritos: "+ dev2.getConteudosInscritos());
        System.out.println("Conteudos concluidos: "+ dev2.getConteudosConcluidos());
        System.out.println(" Xp : " + dev2.calcularTotalXp());

//        System.out.println(bootcamp);
//        System.out.println(dev1);
//        System.out.println(dev2);




//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(conteudo);
//        System.out.println(mentoria);
//

    }
}

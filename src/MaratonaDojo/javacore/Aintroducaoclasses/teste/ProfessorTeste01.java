package MaratonaDojo.javacore.Aintroducaoclasses.teste;

import MaratonaDojo.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome= "Mestre Kami";
        professor.idade= 39;
        professor.sexo= 'M';

        System.out.println("Nome " + professor.nome + " Idade " + professor.idade + " Sex " + professor.sexo);

    }
}

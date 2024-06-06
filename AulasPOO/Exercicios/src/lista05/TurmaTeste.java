package lista05;

public class TurmaTeste {
    public static void main(String[] args) {
        Turma poo = new Turma();
        poo.criarAluno("Guilherme", 2474, 8.0, 8.7, 9.0, 10.0);
        poo.calcularMediaAluno(2474);

        poo.criarAluno("Felipe", 2375, 3.0, 2.0, 2.4, 8.2);
        poo.calcularMediaAluno(2375);

        poo.criarAluno("Carolina", 3876, 7.5, 8.8, 9.2, 7.0);
        poo.calcularMediaAluno(3876);

        poo.criarAluno("João", 1248, 6.7, 5.5, 7.9, 8.1);
        poo.calcularMediaAluno(1248);

        poo.criarAluno("Maria", 5689, 9.8, 9.5, 9.7, 9.9);
        poo.calcularMediaAluno(5689);
        
        poo.criarAluno("aaaaaaaa", 2490, 9.8, 9.5, 9.7, 9.9);
        poo.calcularMediaAluno(2490);
       
       
        poo.calcularMediaTurma();

    }
}

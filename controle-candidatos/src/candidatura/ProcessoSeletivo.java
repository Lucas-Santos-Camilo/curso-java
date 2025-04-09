package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"Diego", "Alex", "Daniel", "Julieta", "José"};
        for(String candidato : candidatos ){
            entrandoContato(candidato);
        }
    }

    static void entrandoContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO!");
        } while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA.");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO DE TENTATIVAS " + tentativasRealizadas + " REALIZADAS.");
    }

    //metodo auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Diego", "Alex", "Daniel", "Julieta", "José"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº" + (indice+1) + " é o " + candidatos[indice]);
        }
        //forma abreviada de intereção for each
        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Diego", "Alex", "Daniel", "Julieta", "José", "Marina", "Mariana", "Livia", "Otávio", "Carla"};
        int candidatosSelecionados = 0;
        int candidatosAtualmente = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtualmente  < candidatos.length){
            String candidato = candidatos[candidatosAtualmente];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " Solicitou este valor de salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            } else {
                System.out.println("O candidato " + candidato + " não foi selecionado para a vaga.");
            }
            candidatosAtualmente++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    // static void analisarCandidato(double salarioPretendido){
    //     double salarioBase = 2000.0;
    //     if(salarioBase > salarioPretendido){
    //         System.out.println("LIGAR PARA O CANDIDATO");
    //     }
    //     else if (salarioBase == salarioPretendido){
    //         System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
    //     }
    //     else {
    //         System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
    //     }
    // }
}

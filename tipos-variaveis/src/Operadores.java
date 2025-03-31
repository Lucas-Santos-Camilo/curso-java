public class Operadores {
    public static void main(String[] args) {
        // String nomeCompleto = "LINGUAGEM" + "JAVA";
        // System.out.println(nomeCompleto);

        ////////////

            // String concatenacao = "?";

            // concatenacao = 1+1+1+"1";
            // System.out.println(concatenacao); 
            
            // concatenacao = 1+"1"+1+1;
            // System.out.println(concatenacao); 
            
            // concatenacao = 1+"1"+1+"1";
            // System.out.println(concatenacao); 
            
            // concatenacao = "1"+1+1+1;
            // System.out.println(concatenacao); 
            
            // concatenacao = "1"+(1+1+1);
            // System.out.println(concatenacao); 

        ////////////
        
            // int numero = 5;
            // numero = - numero;

            // System.out.println(- numero);
            // System.out.println(numero);

            // numero = + numero;
            // System.out.println(numero);

            // numero = numero * -1;
            // System.out.println(numero);

            //////////// x repetição
            
            // numero = numero + 2;
            // numero++;


            // System.out.println(numero ++);
            // System.out.println( ++ numero);

            // System.out.println(numero --);
            // System.out.println( -- numero);

            // System.out.println(numero);

        ////////////
        
            // boolean variavel = true;
            // System.out.println(!variavel);

            // variavel = !variavel;
            // System.out.println(variavel);

        ////////////

            // int a, b;
            // a = 6;
            // b = 6;

            // String resultado = "";
            // if(a==b)
            //     resultado = "verdadeiro";
            // else
            //     resultado = "falso";
            // String resultado = a==b ? "verdadeiro" : "falso";
            // int resultado = a == b ? 1 : 0;
            // System.out.println(resultado);

        ////////////

            // int numero1 = 1;
            // int numero2 = 2;

            // if(numero1 < numero2){System.out.println("a nossa condição é verdadeira");}

            // boolean simNao = numero1 == numero2;
            // System.out.println("numeroUm é igual a numeroDois? " + simNao);

            // simNao = numero1 != numero2;
            // System.out.println("numeroUm é diferente a numeroDois? " + simNao);

            // simNao = numero1 > numero2;
            // System.out.println("numeroUm é maior que numeroDois? " + simNao);

            // String nomeUm = "Lucas";
            // String nomeDois = "Lucas";            
            // String nomeDois = new String("Lucas");

            // System.out.println(nomeUm == nomeDois);
            // System.out.println(nomeUm.equals(nomeDois));

        ////////////
        
            boolean condicao1 = true;
            boolean condicao2 = false;

            if(condicao1 && condicao2){System.out.println("as duas condições são verdadeiras");}
            
            if(condicao1 || condicao2){System.out.println("uma das condições é verdadeira");}

            System.out.println("fim");
            
            if(condicao1 && ( 7 > 4 )){System.out.println("as duas condições são verdadeiras");}

    }
}
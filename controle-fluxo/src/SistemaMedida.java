public class SistemaMedida {
    public static void main(String[] args) {
        String sigla= "M";

        // if(sigla == "PP")
        //     System.out.println("EXTRA PEQUENO");

        // else if(sigla == "P")
        //     System.out.println("PEQUENO");

        // else if(sigla == "M")
        //     System.out.println("MEDIO");

        // else if(sigla == "G")
        //     System.out.println("GRANDE");
            
        // else if(sigla == "GG")
        //     System.out.println("EXTRA GRANDE");
            
        // else
        //     System.out.println("INDEFINIDO");

        // Switch case
        switch (sigla) {
            case "PP": {
                System.out.println("EXTRA PEQUENO");
                break;
            }
            case "P": {
                System.out.println("PEQUENO");
                break;
            }
            case "M": {
                System.out.println("MÉDIO");
                break;
            }
            case "G": {
                System.out.println("GRANDE");
                break;
            }
            case "GG": {
                System.out.println("EXTRA GRANDE");
                break;
            }
    
        default:
            System.out.println("INDEFINIDO");
        }
    }
}

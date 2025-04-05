public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M"; //Planos: B = Basic - M = Midia - T = Turbo

        // if(plano == "B"){
        //     System.out.println("100 minutos de ligação");
        // }
        // else if(plano == "M"){
        //     System.out.println("100 minutos de ligação");
        //     System.out.println("WhatsApp e Instagram grátis");
        // }
        // else if(plano == "T"){
        //     System.out.println("100 minutos de ligação");
        //     System.out.println("WhatsApp e Instagram grátis");
        //     System.out.println("5Gb YouTube");
        // }

        // Switch case
        switch (plano) {
            case "T": {
                System.out.println("5Gb YouTube");
            }
            case "M": {
                System.out.println("WhatsApp e Instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}

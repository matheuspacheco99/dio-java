public class ExemploBreakContinue {
    public static void main(String[] args) {
    
        for(int numero = 1; numero <=9; numero ++){
            if(numero==4)
                continue;
            if(numero==7)
                break;    
            
            System.out.println(numero);
        }
    }
}
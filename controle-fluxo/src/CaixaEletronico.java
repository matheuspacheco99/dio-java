public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorRetirado = 27.0;

        if(valorRetirado < saldo) {
            saldo = saldo - valorRetirado;
         System.out.println("Novo saldo: " + saldo);
        }
        else 
         System.out.println("Saldo Insuficiente");
            

         
    }
}

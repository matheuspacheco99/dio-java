public class CepInvalidoException extends Exception {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("85634526");
            System.out.println("o cep é :" + cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("o cep é invalido");
        }
 
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
          return "23.765-064";
      
    }
}

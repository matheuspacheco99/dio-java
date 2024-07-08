public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + " " + "JAVA";
        String nomeCompleto2 = "LINGUAGEM" + "JAVA";

        System.out.println(nomeCompleto);
        System.out.println(nomeCompleto2);

        int a, b;
        a = 6;
        b = 6;
        /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
         resultado = "verdadeiro";
        else
         resultado = "falso";
        */
        String resultado = (a==b) ? "verdadeiro" : "false";
        /*                        ? = if         : = else */
        System.out.println(resultado);

    }
}

public class AboutMe {    
    public static void main(String[] args) {
    //os argumentos começam com indice 0
    String nome = args [0];
    String sobrenome = args [1];
    int idade = Integer.parseInt(args[2]); //vamos falar sobre Wrappers
    double altura = Double.parseDouble(args[3]);

    System.out.println("Ola, me chamo " + nome + " " + sobrenome);
    System.out.println("Tenho " + idade + " anos ");
    System.out.println("Minha altura é " + altura + "cm ");
        //CMD -> java AboutMe [nome] [sobrenome] [idade] [altura]
    }   
}

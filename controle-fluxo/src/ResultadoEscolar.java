public class ResultadoEscolar {
    public static void main(String[] args) {
    int nota = 8;
       
    if(nota >= 7)
     System.out.println("Nota 1: Aprovado"); 
    else
     System.out.println("Nota 1: Reprovado");
        
    int nota2 = 6;

	if (nota2 >= 7)
		System.out.println("Nota 2: Aprovado");
	else if (nota2 >= 5 && nota2 < 7)
		System.out.println("Nota 2: Recuperação");
	else
		System.out.println("Nota 2: Reprovado");  

	int nota3 = 7;
	String resultado = nota3 >=7 ? "Nota 3: Aprovado" : "Nota 3: Reprovado";
	System.out.println(resultado);

    int nota4 = 4;
    String resultado2 = nota4 >=7 ? "Nota 4: Aprovado" : nota4 >=5 && nota4 <7 ? "Nota 4: Recuperação" : "Nota 4: Reprovado";
    System.out.println(resultado2);
    

    }
}

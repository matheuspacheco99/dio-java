public class SistemaMedida {
    public static void main(String[] args) {

    String sigla = "A";
	if (sigla == "P") 
	    System.out.println("PEQUENO"); 
	else if(sigla == "M")
		System.out.println("MÉDIO");
	else if(sigla == "G")
		System.out.println("GRANDE");
	else
		System.out.println("INDEFINIDO");

        
    String sigla2 = "G";
	switch (sigla2) {
	case "P":{
		System.out.println("PEQUENO");
		break;
	}
	case "M":{
		System.out.println("MÉDIO");
		break;
	}
	case "G":{
		System.out.println("GRANDE");
		break;
	}
	default:
		System.out.println("INDEFINIDO");

	    }    
    }
}

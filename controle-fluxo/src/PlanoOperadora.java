public class PlanoOperadora {
    public static void main(String[] args) {
		String plano = "B"; //M / T
		
		if (plano == "B") {
			System.out.println("Plano 1: 100 minutos de ligação");
		}else if(plano == "M") {
			System.out.println("Plano 1: 100 minutos de ligação");
			System.out.println("Plano 1: WhatsApp e Instagram grátis");	
		}else if(plano == "T") {
			System.out.println("Plano 1: 100 minutos de ligação");
			System.out.println("Plano 1: WhatsApp e Instagram grátis");	
			System.out.println("Plano 1: 5Gb Youtube");	
		}
        
		String plano2 = "M"; // M / T

		switch (plano2) {
			case "T": {
				System.out.println("Plano 2: 5Gb Youtube");
			}
			case "M": {
				System.out.println("Plano 2: WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("Plano 2: 100 minutos de ligação");
			}        
        }
    }
}

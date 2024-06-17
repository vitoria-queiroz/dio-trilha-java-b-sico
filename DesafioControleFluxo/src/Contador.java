import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		
		try {
            Scanner terminal = new Scanner(System.in);
		    System.out.println("Digite o primeiro parâmetro");
		    int parametroUm = terminal.nextInt();
		    System.out.println("Digite o segundo parâmetro");
		    int parametroDois = terminal.nextInt();
            
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosException {
        if(parametroUm > parametroDois){
            throw new ParametrosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        else{
            int contagem = parametroDois - parametroUm;
        

            for(int c = 1; c <= contagem; c++){
            System.out.println("Imprimindo o número " + c);
            }
        }
        }
	}


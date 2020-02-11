import java.util.Scanner;
class Autenticacao{
	public static void main (String []args){
		Scanner ler=new Scanner(System.in);
		
		for(int tentativa=3; tentativa > 0 ; tentativa-- ){
			System.out.println("\n\t Login : ");
			 String login=ler.nextLine();
			System.out.println("\n\t senha  : ");
				String senha=ler.nextLine();
			if((login.equals("1234"))&&(senha.equals("a1b2"))){
				System.out.println("\n\t Bom dia usuario 1234 ");
					break;
					
		}else {
			if(tentativa>0){
			System.out.println("\n\t Login ou senha Ivalido voce possui "+tentativa--+" tentativas casso erre mais a conta sera bloqueada");
			}else{
				break;
			}
		}
	}
  }
 }
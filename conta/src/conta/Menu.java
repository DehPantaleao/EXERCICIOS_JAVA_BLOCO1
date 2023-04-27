package conta;

import java.util.Scanner;

import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {

		int opcao;

		ContaCorrente cc1 = new ContaCorrente(1, 123, 1, "José da Silva", 0.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
		
		ContaPoupanca cp1 = new ContaPoupanca(2, 123, 2, "Maria dos Santos", 100000.0f, 15);
		cp1.visualizar();
        cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();
		
		while (true) {
			
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     "); 
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			opcao = leia.nextInt();
			
			if(opcao == 9) {
				System.out.println("\nBanco do Brazil com Z - O seu futuro começa aqui!");
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1:
				System.out.println("\n Criar Conta");
				
                 break;
			case 2:
				System.out.println("\n Listar todas as Contas");
				
                 break;
			case 3:
				System.out.println("\n Buscar Conta por número");
				
				break;
			case 4:
				System.out.println("\n Atualizar dados da Conta");
				
                 break;
			case 5:
				System.out.println("\n Apagar Conta");
				
                 break;
			case 6:
				System.out.println("\n Sacar");
				
				break;
             case 7:
				System.out.println("\n Depositar");
				
				break;
             case 8:
				System.out.println("\n Transferir");
				
				break;
			default:
				System.out.println("\nOpção Inválida");
                 break;
			}
        }
	}

}
/* Criando Menu:
 
Linha 3: Importamos o Pacote java.util.Scanner, que permite a entrada de dados via teclado.

Linha 9: Instanciamos um Objeto da Classe Scanner, chamado leia, que será responsável por efetuar a entrada de dados via 
teclado.

Linha 11: Criamos a variável do tipo int, chamada opcao, que receberá o número da opção do Menu, que deverá ser executada.
 
Linha 13: Iniciamos a estrutura de repetição while, responsável por gerar o Menu e repeti-lo na tela. Na condição do menu,
inserimos a opção true para que o loop seja infinito, desta forma, o loop será finalizado apenas se a opção 9 for digitada.

Linhas 15 a 33: Construímos a parte visual do nosso Menu. Os espaços em branco antes e depois dos itens do menu e as 
linhas me branco não foram construídas com tabulações (tecla Tab do teclado) e sim com espaços em branco simples.

Linha 35: Através do Objeto leia, utilizamos o Método nextInt() para ler um número inteiro e armazenar na variável opcao.

Linhas 37 a 41: Através do condicional if, verificamos se o valor da variável opcao é 9. Caso seja, será exibida a 
mensagem de saída (linha 38), o Objeto leia será finalizado (linha 39) e o programa será finalizado (linha 40).

Linhas: 43 a 79: Através do condicional case, checaremos se o valor da variável opcao está no intervalo entre 1 e 8. 
Conforme o numero, será exibida uma mensagem diferente na tela. Caso o numero esteja fora do intervalo 1 a 8 e seja 
diferente de 9, será exibida na tela a mensagem Opção Inválida!
 */

/* Atualizando a Classe Menu com cores: 

Linha 5: Importamos a Classe Cores, que permite adicionar Cores nos comandos de saída de dados.

Linha 17: Antes do conteúdo do comando System.out.println(), concatenamos as constantes Cores.TEXT_YELLOW e 
Cores.ANSI_BLACK_BACKGROUND, definindo que o texto será amarelo e o plano de fundo do texto será preto.

Linha 36: Depois do conteúdo do comando System.out.println(), concatenamos a constante Cores.TEXT_RESET, 
definindo que ao finalizar o Menu, o texto e o plano de fundo voltarão a ter as cores padrão.

Linha 41: Antes do conteúdo do comando System.out.println(), concatenamos a constante Cores.TEXT_WHITE_BOLD, 
definindo que ao sair do programa, a mensagem de finalização será exibida com o texto na cor branca em negrito.

Linhas 48, 52, 56, 60, 64, 68, 72 e 76: Antes do conteúdo do comando System.out.println(), concatenamos a 
constante Cores.TEXT_WHITE_BOLD, definindo que as mensagens de cada opção do Menu será exibida com o texto na 
cor branca em negrito.

Linha 80: Antes do conteúdo do comando System.out.println(), concatenamos a constante Cores.TEXT_RED_BOLD, 
definindo que a mensagem de opção inválida do Menu será exibida com o texto na cor vermelha em negrito. 
Depois do conteúdo do comando System.out.println(), concatenamos a constante Cores.TEXT_RESET, definindo que 
depois de exibir a mensagem, o texto e o plano de fundo voltarão a ter as cores padrão.
 */

/* Atualizar a Classe Menu
Linha 4: Através do comando import, a Classe Conta foi importada na Classe Menu.

Linha 12: Foi instanciado o Objeto c1, da Classe Conta, através do Método Construtor. Para chamar o Método Construtor, 
foi utilizada a palavra reservada new.

Linha 13: O Objeto c1, da Classe Conta, chama o Método visualizar(), que exibirá no console todos os dados do Objeto.

Linha 14: O Objeto c1, da Classe Conta, chama o Método sacar(), que tentará fazer um saque na conta. Como o valor
passado é maior que o saldo, o saque não será efetuado e será exibida a mensagem: Saldo Insuficiente!.

Linha 15: O Objeto c1, da Classe Conta, chama novamente o Método visualizar(), para confirmar que o valor do saldo 
não foi alterado.

Linha 16: O Objeto c1, da Classe Conta, chama o Método depositar(), que fará um depósito na conta.

Linha 17: O Objeto c1, da Classe Conta, chama novamente o Método visualizar(), para confirmar que o valor do saldo foi
 alterado.
*/ 

/* Atualizar a Classe Menu
 Importe as Classes ContaCorrente e ContaPoupanca
 Adicione os testes das Classes ContaCorrente e ContaPoupanca
 */
 

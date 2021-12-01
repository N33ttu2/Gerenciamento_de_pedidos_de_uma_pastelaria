package cardapio;

import java.util.HashMap;
import java.util.Scanner;
public class cardapio {
    public static void main(String[] args) {
        
        String Bebida, Extras, NumeroDopastel;


        System.out.println("========================================");
        System.out.println("|         Escolha um pastel              |");
        System.out.println("|                                        |");
        System.out.println("| 01- Queijo c/ Presunto                 |");
        System.out.println("| 02- Queijo c/ calabresa                |");
        System.out.println("| 03- Queijo c/ goiabada                 |");
        System.out.println("| 04 - Queijo                            |");
        System.out.println("| 05 - Banana real                       |");
        System.out.println("| 06 - Frango c/ Queijo                  |");
        System.out.println("| 07 - Frango c/ Catupiry                |");
        System.out.println("| 08 - Frango c/ Cheddar                 |");
        System.out.println("| 09 - Carne c/ Queijo                   |");
        System.out.println("| 10 - Carne c/ Catupiry                 |");
        System.out.println("| 11 - Carne c/ Cheddar                  |");
        System.out.println("| 12 - Brigadeiro com Banana             |");
        System.out.println("| 13 - Presunto, Queijo e Calabresa      |");
        System.out.println("| 14 - Frango, Carne e Queijo            |");
        System.out.println("| 15 - Carne, Queijo e Calabresa         |");
        System.out.println("| 16 - Carne, Queijo e Catupiry          |");
        System.out.println("| 17 - Carne, Calabresa e Cheddar        |");
        System.out.println("| 18 - Carne, Queijo e Cheddar           |");
        System.out.println("| 19 - Frango, Queijo e Cheddar          |");
        System.out.println("| 20 - Frango, Queijo e Catupiry         |");
        System.out.println("| 21 - Frango, Calabresa e Catupiry      |");
        System.out.println("| 22 - Frango, Calabresa e Cheddar       |");
        System.out.println("| 23 - Frango, Queijo e Calabresa        |");
        System.out.println("| 24 - Carne de Sol c/ Queijo            |");
        System.out.println("| 25 - Carne de Sol c/ Cheddar           |");
        System.out.println("| 26 - Carne de Sol, Queijo, Catupiry    |");
        System.out.println("| 27 - Carne de Sol, Queijo, Cheddar     |");
        System.out.println("| 28 - Carne de Sol, Calabresa, Queijo   |");
        System.out.println("| 29 - Carne de Sol, Calabresa, Catupiry |");
        System.out.println("| 30 - Carne de Sol, Calabresa, Cheddar  |");
        System.out.println("| 31 - Carne de Sol, Queijo e Banana     |");
        System.out.println("| 32 - Carne de Sol, Purê e Queijo       |");
        System.out.println("| 33 - Carne de Sol, Frango e Queijo     |");
        System.out.println("| 34 - Carne de Sol e Queijo Minas       |");
        System.out.println("| 35 - Atum e Queijo                     |");
        System.out.println("| 36 - Atum, Frango e Queijo             |");
        System.out.println("| 37 - Bacalhau c/ Queijo                |");
        System.out.println("| 38 - Bacalhau c/ Catupiry              |");
        System.out.println("| 39 - Bacalhau c/ Cheddar               |");
        System.out.println("| 40 - Strogonoff c/ Batata              |");
        System.out.println("|========================================|");
        System.out.println("|          Adicionais Pagos              |");       
        System.out.println("| Azeitona-Tomate-Oregano-Palmito-Pimenta|");
        System.out.println("|========================================|");
        System.out.println("|                Bebidas                 |");
        System.out.println("| Coca Cola                              |");
        System.out.println("| Skol                                   |");
        System.out.println("|========================================|");
        
        Scanner leitor = new Scanner(System.in);
        HashMap<String, Pastel> pedidos = new HashMap<String, Pastel>();
        int n = 0;
        do{
            System.out.println("Você vai escolher os produtos para o seu pedido, assim que terminar escreva FIM e logo após digite o número do pastel escolhido.");
            System.out.println("Digite o número do pastel: ");
            NumeroDopastel = leitor.next();
            if (NumeroDopastel.equals("FIM")){
                break;

        }else{
            leitor.nextLine();
            System.out.println("Escreva a Bebida: ");
            Bebida = leitor.next();
            System.out.println("Escreva Os Adicionais Pagos Escolhidos: ");
            Extras = leitor.next();
            System.out.println("\n");
            
            Pastel p1 = new Pastel(NumeroDopastel, Bebida, Extras);
            pedidos.put(NumeroDopastel, p1);
            }
        } while(n == 0);
        System.out.println("Digite o numero do pastel para ter acesso ao pedido: ");
        NumeroDopastel = leitor.next();
        System.out.println("\n");
        pedidos.get(NumeroDopastel).pedido();

        leitor.close();
    }
    }



package cardapio;

 import javax.swing.JOptionPane;
public class Mesa {

    public static void main(String args[]) {

        int[] mesas;
        double[] contas;
        int tam = 5;
        mesas = new int[tam];
        contas = new double[tam];

        for (int i = 0; i < tam; i++) {
            mesas[i] = 0;
            contas[i] = 0;
    }

    char op;

    do {

        String menu;
        menu = "Escolha uma das opções:";
        menu += "\n1. Pedir mesa";
        menu += "\n2. Fechamento de conta (por pessoa)";
        menu += "\n3. Regisro de pedido";
        menu += "\n4. Conrole de mesas vazias/ocupadas";
        menu += "\n5. Sair";
        op = JOptionPane.showInputDialog(menu).charAt(0);

        switch (op) {
            // reserva de mesa
            case '1':
                boolean achou = false;
                // procura mesa 'vazia'
                int i;
                for (i = 0; i < tam; i++) {
                    if (mesas[i] == 0) {
                        achou = true;
                        break;
                    }
                }

                if (achou == true) {
                    String qtde;
                    qtde = JOptionPane.showInputDialog("Quantas pessoas");
                    mesas[i] = Integer.parseInt(qtde);
                    JOptionPane.showMessageDialog(null, "Mesa: " + i);
                } else {
                    JOptionPane.showMessageDialog(null, "Nao ha mesas");
                }

                break;
            // fechameno de contas
            case '2':
                int numero;
                numero = Integer.parseInt(JOptionPane.showInputDialog("Qual mesa?"));
                double porPessoa;
                porPessoa = contas[numero] / mesas[numero];
                String resposta;
                resposta = "Mesa: " + numero;
                resposta += "\nPessoa: " + mesas[numero];
                resposta += "\nPor pessoa: " + porPessoa;
                JOptionPane.showMessageDialog(null, resposta);
                mesas[numero] = 0;
                contas[numero] = 0;
                break;
            // controle do valor - regisro de pedido
            case '3':
                int num;
                double valor;
                num = Integer.parseInt(JOptionPane.showInputDialog("Qual mesa?"));
                valor = Double.parseDouble(JOptionPane.showInputDialog("Qual valor"));
                contas[num] += valor;
                break;
            // mesas vazias ou ocupadas
            case '4':
                int vazias = 0,
                 ocupadas = 0;
                for (int j = 0; j < tam; j++) {
                    if (mesas[j] == 0) {
                        vazias++;
                    } else {
                        ocupadas++;
                    }
                }
                JOptionPane.showMessageDialog(null, "Vazias: " + vazias
                        + "\nOcupadas: " + ocupadas);
                break;
        }
    } while (op != '5');
}


    
    
}

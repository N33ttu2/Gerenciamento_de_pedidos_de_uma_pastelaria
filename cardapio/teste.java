package cardapio;

import javax.swing.JOptionPane;
public class teste {

    public static void main(String args[]) {

        char op;
        char lc;

    do {

        String menu;
        menu = " Escolha um pastel:";
        menu += "\n1. - Queijo c/ Presunto " ;
        menu += "\n2. - Queijo c/ calabresa";
        menu += "\n3. - Queijo c/ goiabada";
        menu += "\n4. - Queijo ";
        menu += "\n5. - Banana real";
        menu += "\n6. SAIR";
        op = JOptionPane.showInputDialog(menu).charAt(0);

        switch (op) {

            case '1':

            String men;

            men = "custará R$ 6,00 confirma a compra ? ";
            men += "\n01. Sim";
            men += "\n02. não";
            lc = JOptionPane.showInputDialog(men).charAt(0);

            switch (lc) {

                case '1':

                JOptionPane.showMessageDialog(null, "favor após o fechemantos se direcionar ao atendente");

                } 
 
    } while(op != '6');
} while (op != '2');

}

}


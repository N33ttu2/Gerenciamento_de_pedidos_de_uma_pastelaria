package Final;

import javax.swing.JOptionPane;

public class Final1 {

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
        menu += "\n6. - Frango c/ Queijo   ";
        menu += "\n7. - Frango c/ Catupiry";
        menu += "\n8  - Frango c/ Cheddar";
        menu += "\n9. - Carne c/ Queijo  ";
        menu += "\n0. Sair";
        op = JOptionPane.showInputDialog(menu).charAt(0);

        switch (op) {

            case '1', '2', '3', '4', '5', '6', '7', '8', '9':

            String men;

            men = "custará R$ 6,00 confirma a compra ? ";
            men += "\n01. Sim";
            men += "\n02. não";
            lc = JOptionPane.showInputDialog(men).charAt(0);

            switch (lc) {

                case '1':

                JOptionPane.showMessageDialog(null, "favor após o fechemantos se direcionar ao atendente");

                } 
 
    } while(op != '0');

} while(op != '2');

    }
}
package cardapio;

import javax.swing.JOptionPane;
public class teste {

    public static void main(String args[]) {

        char op;

    do {

        String menu;
        menu = " Escolha um pastel:";
        menu += "\n1. 01- Queijo c/ Presunto ";
        menu += "\n2. 02- Queijo c/ calabresa";
        menu += "\n3. 03- Queijo c/ goiabada";
        menu += "\n4. 04 - Queijo ";
        menu += "\n5. 05 - Banana real";
        menu += "\n6. SAIR";
        op = JOptionPane.showInputDialog(menu).charAt(0);

        switch (op) {

            case '1':
            

    } while(op != '6');
}

}



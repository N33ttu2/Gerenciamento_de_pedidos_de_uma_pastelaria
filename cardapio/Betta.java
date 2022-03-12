package cardapio;

import java.util.Scanner;

public class Betta {
    
    public String Nome;
	public float Preco;
	
	public void Pastel(String Nome, float Preco) {
		this.Nome=Nome;
		this.Preco=Preco;	
	}
	
	public void input () {
		Scanner bp=new Scanner(System.in);
		System.out.println("Digite Nome Pastel");
		Nome=bp.nextLine();
		System.out.println("Digite Preco Pastel");
		Preco=bp.nextFloat();
	}
	
	public void Pagamento() {
		System.out.println("Preco: "+ Preco);
	}
	public String detail () {
		return Nome+"  "+Preco;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String Nome) {
		this.Nome=Nome;
	}
	public void setPreco(Float Preco) {
		this.Preco=Preco;
	}
	
}



package cardapio;

public class Pastel {
    private String NumeroDopastel;
    private String Bebida;
    private String Extras; 

    public Pastel(String NumeroDopastel, String Bebida, String Extras){
        this.Bebida = Bebida;
        this.Extras = Extras;
        this.NumeroDopastel = NumeroDopastel;
    }
    public void pedido(){
    	System.out.println("Pastel escolhido: " + getNumeroDopastel());
        System.out.println("Bebida escolhida: " + getBebida());
        System.out.println("Adicionais Pagos escolhidos: " + getExtras());
    	
    	
    }

	public String getNumeroDopastel() {
		return NumeroDopastel;
	}

	public void setNumeroDopastel(String numeroDopastel) {
		NumeroDopastel = numeroDopastel;
	}

	public String getBebida() {
		return Bebida;
	}

	public void setBebida(String bebida) {
		Bebida = bebida;
	}

	public String getExtras() {
		return Extras;
	}

	public void setExtras(String extras) {
		Extras = extras;
	}
    
    
}

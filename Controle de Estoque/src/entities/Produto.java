package entities;



public class Produto {

	
	//ATRIBUTOS
	private String nome;
	private String descricao;
	private int quantidade;
	private int codigo;
	private double preco;
	
	
	// CONSTRUTORES
	/*public Produto(String nome, String descricao, int quantidade, double preco) {
		this.nome = nome;
		this.descricao = descricao;
		this.quantidade = quantidade;		
		this.preco = preco;
	}*/

	
	// GETTERS e SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}
	
	
	// METODOS
	
	public void addProduto(String nome, String descricao, int quantidade, double preco) {
		
	}
	
	public void removeProduto() {
		
	}
	
	public String consultarProduto() {
		return "";
	}

}

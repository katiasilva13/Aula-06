package br.com.db1.start.recibo;

public class Endereco {

	private TipoLogradouro tipoLogradouro;
	
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private Integer cep;
	
	private Cidade cidade;
	
	public String getCepFormatado(){
		String cepFormatado = getCep().toString();
		cepFormatado = cepFormatado.substring(0,5)+ "-" + cepFormatado.substring(5,8);
		return cepFormatado;
		
	}

	public TipoLogradouro getTipoLogradouro() {
		return tipoLogradouro;
	}

	public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	};	
		
/* Ideias soluções
		private static Scanner scanner;
		public static void main (String[] args) {
		System.out.println("Digite um textoo CEP (apenas números): \n");
		scanner = new Scanner (System.in);
		String cep = scanner.nextLine();
		cep.setCep();
		System.out.println(cep.toString);
		}
		 * 
 		String cep = "valor da coluna no DB";
		if(cep.legth ==7){
  				cep = "0" + cep;}
		 * 
		Cep c = new Cep();
        MaskFormatter formatter = new MaskFormatter(c.getMask());
        JFormattedTextField textField = new JFormattedTextField();
        formatter.install(textField);
		 * 
		Cep c = new Cep();
		c.setCep("21021380");
		System.out.println(c.toString); // A saída é 21.021-380
	*/
	
}

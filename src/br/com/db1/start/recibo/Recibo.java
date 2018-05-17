package br.com.db1.start.recibo;

import java.util.Date;
import java.util.List;

public class Recibo {

	private Integer numero;
	private Double valor;
	private Date dataCadastro;
	private Boolean confirmacao;
	private Date dataEmissao;
	
	private Cidade cidade;
	private Cliente cliente;
	private Emitente emitente;
	
	private List<Servico> servicos;
	
	public String getValorDescritivo() {
		return null;
	}
	
	public String getDataEmissaoDescritiva() {
		return null;
	}
	
}

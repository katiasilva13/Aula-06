package br.com.db1.start.recibo;

public class Emitente {

	private String nome;
	private Integer numero;
	private byte[] assinatura;
	private String documento;

	public String getDocumentoFormatado() {
			String documentoFormatado = documento;
			documentoFormatado = documentoFormatado.substring(0, 3) + "." + documentoFormatado.substring(3, 6) + "."
					+ documentoFormatado.substring(6, 9) + "-" + documentoFormatado.substring(9, 11);
			return documentoFormatado;
		
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

}


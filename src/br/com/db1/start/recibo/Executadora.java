package br.com.db1.start.recibo;

public class Executadora {

	public static void main(String[] args) {
		exibirCepFormatado(80540150);
		exibirCepFormatado(87103000);
		exibirDocumentoFormatado();
	}

	private static void exibirDocumentoFormatado() {
		Emitente emitente = new Emitente();
		emitente.setDocumento("00000000000");
		System.out.println(emitente.getDocumentoFormatado());
	}

	private static void exibirCepFormatado(Integer cepSemFormatacao) {
		Endereco endereco = new Endereco();
		endereco.setCep(cepSemFormatacao);
		System.out.println(endereco.getCepFormatado());
	}

}

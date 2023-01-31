package br.com.client;


import br.com.generated.CadastroPessoaWS;
import br.com.generated.CadastroPessoaWSService;
import br.com.generated.Pessoa;

public class Application {

    public static void main(String[] args) {
        System.out.println("Criando servico de conexão: ");
        CadastroPessoaWSService service = new CadastroPessoaWSService();
        CadastroPessoaWS cadastroPessoaWS = service.getCadastroPessoaWSPort();

/*		System.out.println("Criando pessoa para ser persistida");
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Luan Oliveira");
		pessoa1.setSexo(Sexo.MASCULINO);

		System.out.println("Persistindo pessoa");
		cadastroPessoaWS.cadastrarPessoa(pessoa1);
*/
        System.out.println("Buscando pessoa com o código 2");
        Pessoa outra = cadastroPessoaWS.buscarPorCodigo(2);

        System.out.println("Codigo: " + outra.getCodigo());
        System.out.println("Nome: " + outra.getNome());
        System.out.println("Sexo: " + outra.getSexo().name());
    }

}

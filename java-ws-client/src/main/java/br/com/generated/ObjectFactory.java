
package br.com.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Pessoa_QNAME = new QName("http://server.com.br/", "pessoa");
    private final static QName _BuscarPorCodigoResponse_QNAME = new QName("http://server.com.br/", "buscarPorCodigoResponse");
    private final static QName _BuscarPorCodigo_QNAME = new QName("http://server.com.br/", "buscarPorCodigo");
    private final static QName _CadastrarPessoa_QNAME = new QName("http://server.com.br/", "cadastrarPessoa");
    private final static QName _CadastrarPessoaResponse_QNAME = new QName("http://server.com.br/", "cadastrarPessoaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarPorCodigoResponse }
     * 
     */
    public BuscarPorCodigoResponse createBuscarPorCodigoResponse() {
        return new BuscarPorCodigoResponse();
    }

    /**
     * Create an instance of {@link CadastrarPessoaResponse }
     * 
     */
    public CadastrarPessoaResponse createCadastrarPessoaResponse() {
        return new CadastrarPessoaResponse();
    }

    /**
     * Create an instance of {@link Pessoa }
     * 
     */
    public Pessoa createPessoa() {
        return new Pessoa();
    }

    /**
     * Create an instance of {@link CadastrarPessoa }
     * 
     */
    public CadastrarPessoa createCadastrarPessoa() {
        return new CadastrarPessoa();
    }

    /**
     * Create an instance of {@link BuscarPorCodigo }
     * 
     */
    public BuscarPorCodigo createBuscarPorCodigo() {
        return new BuscarPorCodigo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pessoa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.com.br/", name = "pessoa")
    public JAXBElement<Pessoa> createPessoa(Pessoa value) {
        return new JAXBElement<Pessoa>(_Pessoa_QNAME, Pessoa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPorCodigoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.com.br/", name = "buscarPorCodigoResponse")
    public JAXBElement<BuscarPorCodigoResponse> createBuscarPorCodigoResponse(BuscarPorCodigoResponse value) {
        return new JAXBElement<BuscarPorCodigoResponse>(_BuscarPorCodigoResponse_QNAME, BuscarPorCodigoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPorCodigo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.com.br/", name = "buscarPorCodigo")
    public JAXBElement<BuscarPorCodigo> createBuscarPorCodigo(BuscarPorCodigo value) {
        return new JAXBElement<BuscarPorCodigo>(_BuscarPorCodigo_QNAME, BuscarPorCodigo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarPessoa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.com.br/", name = "cadastrarPessoa")
    public JAXBElement<CadastrarPessoa> createCadastrarPessoa(CadastrarPessoa value) {
        return new JAXBElement<CadastrarPessoa>(_CadastrarPessoa_QNAME, CadastrarPessoa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarPessoaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.com.br/", name = "cadastrarPessoaResponse")
    public JAXBElement<CadastrarPessoaResponse> createCadastrarPessoaResponse(CadastrarPessoaResponse value) {
        return new JAXBElement<CadastrarPessoaResponse>(_CadastrarPessoaResponse_QNAME, CadastrarPessoaResponse.class, null, value);
    }

}

package adapter;
//Implementado a interface adapter
public class PessoaJuridica implements PessoaAdapter{

    private String cnpj;

    public PessoaJuridica(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public String getRegistro() {
        return getCnpj();
    }
}

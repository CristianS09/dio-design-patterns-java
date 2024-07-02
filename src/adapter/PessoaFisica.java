package adapter;

//Implementado a interface adapter
public class PessoaFisica implements PessoaAdapter {
    private String cpf;

    public PessoaFisica(String cpf){
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String getRegistro() {
        return getCpf();
    }
}

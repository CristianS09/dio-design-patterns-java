import adapter.PessoaAdapter;
import adapter.PessoaFisica;
import adapter.PessoaJuridica;
import builder.Usuario;
import singleton.Singleton;

import java.util.Objects;

public class Main{
    public static void main(String[] args) {
        //Singleton
        //Os dois objetos tem o mesmo código hash.
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();

        System.out.println(singleton);
        System.out.println(singleton1);

        //Adapter
        PessoaFisica pessoaFisica = new PessoaFisica(null);
        PessoaJuridica pessoaJuridica = new PessoaJuridica(null);
        PessoaProcessor pessoaProcessor = new PessoaProcessor();

        pessoaProcessor.process(pessoaFisica);
        pessoaProcessor.process(pessoaJuridica);

        //Builder
        Usuario build = new Usuario.UsuarioBuilder()
                .nome("Maria")
                .idade(19)
                .senha("maria1234")
                .email("maria@gmail.com")
                .build();

        System.out.println(build);
    }

        private static class PessoaProcessor{
        //Verifica se Pessoa Física ou Pessoa Jurídica são nulos.
        void process(PessoaAdapter pessoaAdapter){
            if(Objects.isNull(pessoaAdapter.getRegistro())){
                System.out.println("Registro não informado");
            }
        }
    }
}
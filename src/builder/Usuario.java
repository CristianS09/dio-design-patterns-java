package builder;

public class Usuario {
    private String nome;
    private int idade;
    private String senha;
    private String email;
    //Construtor privado para evitar a instancia.
    private Usuario(String nome, int idade, String senha, String email) {
        this.nome = nome;
        this.idade = idade;
        this.senha = senha;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class UsuarioBuilder {
        private String nome;
        private int idade;
        private String senha;
        private String email;

       public UsuarioBuilder nome(String nome){
           this.nome = nome;
           return this;
       }
        public UsuarioBuilder idade(int idade){
            this.idade = idade;
            return this;
        }

        public UsuarioBuilder senha(String senha){
            this.senha = senha;
            return this;
        }

        public UsuarioBuilder email(String email){
            this.email = email;
            return this;
        }

        public Usuario build(){
           return new Usuario(nome,idade,senha,email);
        }
    }
}



public class Cliente extends Cadastro implements Comprar, Vender {

    private String email;
    private String senha;

        public Cliente(String nome, String endereco, String cpf, String cidade, String estado, String telefone, String email, String senha){
            super(nome, endereco, cpf, cidade, estado, telefone);
            this.email = email;
            this.senha = senha;
        }

    @Override
    public String toString() {
        return "Cliente{" +
                "email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cpf='" + cpf + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    @Override
    public void comprar(int quantidade, double valor) {

    }

    @Override
    public void formaPag(String pix) {

    }

    @Override
    public void vender(int quantidade, double valor) {

    }

    @Override
    public void formaRec(String pix) {

    }
}

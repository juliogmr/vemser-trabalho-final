import java.util.ArrayList;
import java.util.List;

public class ClienteManipulacao {

    private List<Cliente> listaDeClientes;

    public ClienteManipulacao() {
        this.listaDeClientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        this.listaDeClientes.add(cliente);
    }

    public void removerClientePorIndice(Integer index) {
        this.listaDeClientes.remove(index.intValue());
    }

    public void editarCliente(Integer index, Cliente cliente) {
        Cliente clienteProcurado = listaDeClientes.get(index);
        clienteProcurado.setNome(cliente.getNome());
        clienteProcurado.setEndereco(cliente.getEndereco());
        clienteProcurado.setCpf(cliente.getCpf());
        clienteProcurado.setCidade(cliente.getCidade());
        clienteProcurado.setEstado(cliente.getEstado());
        clienteProcurado.setTelefone(cliente.getTelefone());
    }

    public void listarPessoas() {
        for (int i = 0; i < listaDeClientes.size(); i++) {
            System.out.println("id=" + i + " | " + listaDeClientes.get(i));
        }
    }
}

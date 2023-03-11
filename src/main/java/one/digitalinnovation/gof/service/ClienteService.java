package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;

/**
 * Interface que define o padrão Strategy no domínio de cliente.
 * Com isso, se necessáario, é possíve ter multiplas implementações dessa mesma interface
 */
public interface ClienteService {

    //Operações de Crud
    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);
}

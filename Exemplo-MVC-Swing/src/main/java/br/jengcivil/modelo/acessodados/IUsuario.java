package br.jengcivil.modelo.acessodados;

import br.jengcivil.modelo.Usuario;
import java.util.List;

public interface IUsuario {

    public void inserir(Usuario usuario);

    public void atualizar(Usuario usuario);

    public void deletar(int id);

    public List<Usuario> listarPorOrigen(String origem);

    public List<Usuario> listarTodos();

}

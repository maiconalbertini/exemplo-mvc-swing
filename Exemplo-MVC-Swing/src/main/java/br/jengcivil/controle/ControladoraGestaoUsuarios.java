package br.jengcivil.controle;

import br.jengcivil.modelo.Usuario;
import br.jengcivil.modelo.acessodados.IUsuario;
import br.jengcivil.modelo.acessodados.UsuarioDAO;
import br.jengcivil.modelo.modelotabela.ModeloTabelaUsuario;
import br.jengcivil.visual.PainelGestaoUsuarios;
import java.util.List;
import javax.swing.JOptionPane;

public class ControladoraGestaoUsuarios {

    private final PainelGestaoUsuarios formulario;
    private final IUsuario iusuario;
    private List<Usuario> listaUsuarios;

    public ControladoraGestaoUsuarios(PainelGestaoUsuarios formulario) {
        this.formulario = formulario;
        this.iusuario = new UsuarioDAO();
        listaUsuarios = iusuario.listarTodos();
    }

    public void limparCampos() {
        formulario.getJtfID().setText("");
        formulario.getJtfNomeConta().setText("");
        formulario.getJtfNomeUsuario().setText("");
        formulario.getJtfSenhaUsuario().setText("");
        formulario.getJtfObservacoes().setText("");
    }

    public void atualizarTabela() {
        listaUsuarios = iusuario.listarTodos();
        formulario.getJtblDados().setModel(new ModeloTabelaUsuario(listaUsuarios));
    }

    public void obterDadosParaCampos() {
        int linhaTabela = formulario.getJtblDados().getSelectedRow();
        if (linhaTabela != -1) {
            formulario.getJtfID().setText(String.valueOf(listaUsuarios.get(linhaTabela).getId()));
            formulario.getJtfNomeConta().setText(String.valueOf(listaUsuarios.get(linhaTabela).getOrigem()));
            formulario.getJtfNomeUsuario().setText(String.valueOf(listaUsuarios.get(linhaTabela).getNomeusuario()));
            formulario.getJtfSenhaUsuario().setText(String.valueOf(listaUsuarios.get(linhaTabela).getSenhausuario()));
            formulario.getJtfObservacoes().setText(String.valueOf(listaUsuarios.get(linhaTabela).getObservacoes()));
        }
    }

    public void inserirDados() {
        Usuario usuario = new Usuario(
                Integer.parseInt(formulario.getJtfID().getText()),
                formulario.getJtfNomeConta().getText(),
                formulario.getJtfNomeUsuario().getText(),
                formulario.getJtfSenhaUsuario().getText(),
                formulario.getJtfObservacoes().getText()
        );        
        iusuario.inserir(usuario);
    }

    public void atualizarDados() {
        Usuario usuario = new Usuario(
                Integer.parseInt(formulario.getJtfID().getText()),
                formulario.getJtfNomeConta().getText(),
                formulario.getJtfNomeUsuario().getText(),
                formulario.getJtfSenhaUsuario().getText(),
                formulario.getJtfObservacoes().getText()
        );
        iusuario.atualizar(usuario);        
    }

    public void deletarDados() {
        if (formulario.getJtfID().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(formulario, "Não existe dados selecionados.", null, JOptionPane.ERROR);
            return;
        }        
        int linha = Integer.parseInt(formulario.getJtfID().getText());
        iusuario.deletar(linha);
    }

    public void obterDadosConta() {
        if (formulario.getJtfNomeConta().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(formulario, "Não existe conta selecionada.", null, JOptionPane.ERROR);
            return;
        }        
        String conta = formulario.getJtfNomeConta().getText();
        consultarNaTabela(conta);
    }

    public void consultarNaTabela(String conta) {
        listaUsuarios = iusuario.listarPorOrigen(conta);
        formulario.getJtblDados().setModel(new ModeloTabelaUsuario(listaUsuarios));
    }

}

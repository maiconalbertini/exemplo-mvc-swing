package br.jengcivil.modelo.modelotabela;

import br.jengcivil.modelo.Usuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTabelaUsuario extends AbstractTableModel {

    private static final long serialVersionUID = 1L;

    List<Usuario> listaUsuarios;

    public ModeloTabelaUsuario(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    @Override
    public int getRowCount() {
        return listaUsuarios.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listaUsuarios.get(rowIndex).getId();
            case 1:
                return listaUsuarios.get(rowIndex).getOrigem();
            case 2:
                return listaUsuarios.get(rowIndex).getNomeusuario();
            case 3:
                return listaUsuarios.get(rowIndex).getSenhausuario();
            case 4:
                return listaUsuarios.get(rowIndex).getObservacoes();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "ORIGEM";
            case 2:
                return "NOME USUARIO";
            case 3:
                return "SENHA USUARIO";
            case 4:
                return "OBSERVAÇÕES";
            default:
                return null;
        }
    }
}

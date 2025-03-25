package br.jengcivil.modelo.acessodados;

import br.jengcivil.modelo.Usuario;
import br.jengcivil.modelo.bandodedados.ConexaoBancoDeDados;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UsuarioDAO implements IUsuario {

    private List<Usuario> listaUsuarios;

    @Override
    public void inserir(Usuario usuario) {

        try {
            PreparedStatement statement = ConexaoBancoDeDados.obterConexao().prepareStatement("INSERT INTO INFOLOGIN ("
                    + "ORIGEM, NOME, SENHA, OBSERVACOES) VALUES (?, ?, ?, ?);");
            statement.setString(1, usuario.getOrigem());
            statement.setString(2, usuario.getNomeusuario());
            statement.setString(3, usuario.getSenhausuario());
            statement.setString(4, usuario.getObservacoes());
            statement.executeUpdate();
            statement.close();
            ConexaoBancoDeDados.encerrarConexao();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void atualizar(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet.");

//        try {
//            PreparedStatement statement = ConnectionDatabase.getConnection().prepareStatement(""
//                    + "UPDATE mahasiswa SET nama=?, alamat=? WHERE id=?");
//            
//            statement.setString(1, mahasiswa.getNama());
//            statement.setString(2, mahasiswa.getAlamat());
//            statement.setInt(3, mahasiswa.getId());
//            
//          
//            statement.executeUpdate();
//            
//            statement.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(MahasiswaDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    @Override
    public void deletar(int id) {
        throw new UnsupportedOperationException("Not supported yet.");

//        try {
//            PreparedStatement statement = ConnectionDatabase.getConnection().prepareStatement(""
//                    + "DELETE FROM mahasiswa WHERE id=?");
//
//            statement.setInt(1, id);
//
//            statement.executeUpdate();
//
//            statement.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(MahasiswaDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    @Override
    public List<Usuario> listarPorOrigen(String origem) {
        throw new UnsupportedOperationException("Not supported yet.");

//        list = new ArrayList<Mahasiswa>();
//
//        try {
//
//            Statement statement = ConnectionDatabase.getConnection().createStatement();
//            ResultSet result = statement.executeQuery("SELECT * FROM mahasiswa WHERE nama LIKE '%" + nama + "%'");
//
//            while (result.next()) {
//                Mahasiswa mahasiswa = new Mahasiswa();
//                mahasiswa.setId(result.getInt(1));
//                mahasiswa.setNama(result.getString("nama"));
//                mahasiswa.setAlamat(result.getString("alamat"));
//                list.add(mahasiswa);
//            }
//
//            statement.close();
//            result.close();
//            return list;
//        } catch (SQLException ex) {
//            Logger.getLogger(MahasiswaDAO.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//        }
    }

    @Override
    public List<Usuario> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet.");

//        list = new ArrayList<Mahasiswa>();
//
//        try {
//
//            Statement statement = ConnectionDatabase.getConnection().createStatement();
//            ResultSet result = statement.executeQuery("SELECT * FROM mahasiswa");
//
//            while (result.next()) {
//                Mahasiswa mahasiswa = new Mahasiswa();
//                mahasiswa.setId(result.getInt(1));
//                mahasiswa.setNama(result.getString("nama"));
//                mahasiswa.setAlamat(result.getString("alamat"));
//                list.add(mahasiswa);
//            }
//
//            statement.close();
//            result.close();
//            return list;
//        } catch (SQLException ex) {
//            Logger.getLogger(MahasiswaDAO.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//        }
    }

    public UsuarioDAO() {
        Usuario u1 = new Usuario();
        u1.setOrigem("Conta Usuario 01");
        u1.setNomeusuario("Usuario 01");
        u1.setSenhausuario("PassU1@#%$$$");
        u1.setObservacoes("Observações Usuario 01");
        Usuario u2 = new Usuario();
        u2.setOrigem("Conta Usuario 02");
        u2.setNomeusuario("Usuario 02");
        u2.setSenhausuario("PassU29998989");
        u2.setObservacoes("Observações Usuario 02");
        Usuario u3 = new Usuario();
        u3.setOrigem("Conta Usuario 02");
        u3.setNomeusuario("Usuario 02");
        u3.setSenhausuario("PassU29998989");
        u3.setObservacoes("Observações Usuario 02");
        inserir(u1);
        inserir(u2);
        inserir(u3);
    }

    public static void main(String[] args) {
        new UsuarioDAO();

    }

}

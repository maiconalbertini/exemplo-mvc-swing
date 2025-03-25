package br.jengcivil.visual;

import br.jengcivil.controle.ControladoraGestaoUsuarios;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class PainelGestaoUsuarios extends javax.swing.JPanel {

    private ControladoraGestaoUsuarios controladora;

    public PainelGestaoUsuarios() {
        initComponents();

        controladora = new ControladoraGestaoUsuarios(this);
        controladora.atualizarTabela();

        jbtnNovo.addActionListener(eventoAdicionar);
        jbtnAlterar.addActionListener(eventoAlterar);
        jbtnExcluir.addActionListener(eventoExcluir);
        jbtnAtualizar.addActionListener(eventoAtualizar);
        jbtnProcurarConta.addActionListener(eventoProcurarConta);
        jtblDados.addMouseListener(eventoSelecaoNaTabela);
    }

    ActionListener eventoAdicionar = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            controladora.inserirDados();
            controladora.atualizarTabela();
            controladora.limparCampos();
        }
    };

    ActionListener eventoAlterar = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            controladora.atualizarDados();
            controladora.atualizarTabela();
            controladora.limparCampos();
        }
    };

    ActionListener eventoExcluir = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            controladora.deletarDados();
            controladora.atualizarTabela();
            controladora.limparCampos();
        }
    };

    ActionListener eventoAtualizar = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            controladora.atualizarTabela();
            controladora.limparCampos();
        }
    };

    ActionListener eventoProcurarConta = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            controladora.obterDadosConta();
        }
    };

    MouseListener eventoSelecaoNaTabela = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            controladora.obterDadosConta();
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    };

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new JLabel();
        jtfID = new JTextField();
        jtfNomeConta = new JTextField();
        jtfNomeUsuario = new JTextField();
        jtfSenhaUsuario = new JTextField();
        jtfObservacoes = new JTextField();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jbtnProcurarConta = new JButton();
        jbtnNovo = new JButton();
        jbtnAlterar = new JButton();
        jbtnExcluir = new JButton();
        jbtnAtualizar = new JButton();
        jScrollPane1 = new JScrollPane();
        jtblDados = new JTable();

        jLabel1.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel1.setText("ID :");

        jtfID.setPreferredSize(new Dimension(150, 30));

        jtfNomeConta.setPreferredSize(new Dimension(150, 30));

        jtfNomeUsuario.setPreferredSize(new Dimension(150, 30));

        jtfSenhaUsuario.setPreferredSize(new Dimension(150, 30));

        jtfObservacoes.setPreferredSize(new Dimension(150, 30));

        jLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel2.setText("Nome da Conta :");

        jLabel3.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel3.setText("Nome de Usuário :");

        jLabel4.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel4.setText("Senha do Usuário :");

        jLabel5.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel5.setText("Observações :");

        jbtnProcurarConta.setText("Procurar Conta");
        jbtnProcurarConta.setActionCommand("Procurar Conta");
        jbtnProcurarConta.setPreferredSize(new Dimension(120, 30));

        jbtnNovo.setText("Novo");
        jbtnNovo.setPreferredSize(new Dimension(120, 30));

        jbtnAlterar.setText("Alterar");
        jbtnAlterar.setPreferredSize(new Dimension(120, 30));

        jbtnExcluir.setText("Excluir");
        jbtnExcluir.setPreferredSize(new Dimension(120, 30));

        jbtnAtualizar.setText("Atualizar");
        jbtnAtualizar.setPreferredSize(new Dimension(120, 30));

        jtblDados.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtblDados);

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfSenhaUsuario, GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                            .addComponent(jtfID, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNomeUsuario, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfNomeConta, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfObservacoes, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnNovo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnAlterar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnExcluir, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnAtualizar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnProcurarConta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNomeConta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNomeUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfSenhaUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfObservacoes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnNovo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAlterar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnExcluir, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAtualizar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnProcurarConta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JScrollPane jScrollPane1;
    private JButton jbtnAlterar;
    private JButton jbtnAtualizar;
    private JButton jbtnExcluir;
    private JButton jbtnNovo;
    private JButton jbtnProcurarConta;
    private JTable jtblDados;
    private JTextField jtfID;
    private JTextField jtfNomeConta;
    private JTextField jtfNomeUsuario;
    private JTextField jtfObservacoes;
    private JTextField jtfSenhaUsuario;
    // End of variables declaration//GEN-END:variables

    public JTextField getJtfID() {
        return jtfID;
    }

    public JTextField getJtfNomeConta() {
        return jtfNomeConta;
    }

    public JTextField getJtfNomeUsuario() {
        return jtfNomeUsuario;
    }

    public JTextField getJtfObservacoes() {
        return jtfObservacoes;
    }

    public JTextField getJtfSenhaUsuario() {
        return jtfSenhaUsuario;
    }

    public JButton getJbtnAlterar() {
        return jbtnAlterar;
    }

    public JButton getJbtnAtualizar() {
        return jbtnAtualizar;
    }

    public JButton getJbtnExcluir() {
        return jbtnExcluir;
    }

    public JButton getJbtnNovo() {
        return jbtnNovo;
    }

    public JButton getJbtnProcurarConta() {
        return jbtnProcurarConta;
    }

    public JTable getJtblDados() {
        return jtblDados;
    }

}

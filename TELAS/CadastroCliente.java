/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TELAS;

import ConfigDB.ConnMySQL;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class CadastroCliente extends javax.swing.JFrame {

    Login ADM;
    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputCadastroClienteNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        buttonCadastroCliente = new javax.swing.JButton();
        inputCadastroClienteTel = new javax.swing.JFormattedTextField();
        inputCadastroClienteCpf = new javax.swing.JFormattedTextField();
        inputCadastroClienteDataNasc = new javax.swing.JFormattedTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cadastroCliente = new javax.swing.JMenuItem();
        cadastroVeiculo = new javax.swing.JMenuItem();
        cadastroUsuario = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        consultaCliente = new javax.swing.JMenuItem();
        consultaCarro = new javax.swing.JMenuItem();
        consultaUsuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        aluguelRegistrar = new javax.swing.JMenuItem();
        menuCarrosAlugados = new javax.swing.JMenuItem();
        MenuExcluir = new javax.swing.JMenu();
        excluirCliente = new javax.swing.JMenuItem();
        excluirUsuario = new javax.swing.JMenuItem();
        excluirVeiculo = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        alterarSenha = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                EscondeMenu(evt);
            }
        });

        jLabel1.setText("Cadastro de Clientes");

        jLabel2.setText("Nome completo");

        inputCadastroClienteNome.setName("inputCadastroClienteNome"); // NOI18N

        jLabel3.setText("Telefone");

        jLabel4.setText("CPF");

        jLabel5.setText("Data de nascimento");

        buttonCadastroCliente.setText("Cadastrar");
        buttonCadastroCliente.setName("buttonCadastroCliente"); // NOI18N
        buttonCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarCliente(evt);
            }
        });

        try {
            inputCadastroClienteTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            inputCadastroClienteCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        inputCadastroClienteCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCadastroClienteCpfActionPerformed(evt);
            }
        });

        try {
            inputCadastroClienteDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jMenu1.setText("Cadastro");

        cadastroCliente.setBackground(new java.awt.Color(153, 153, 153));
        cadastroCliente.setText("Cliente");
        cadastroCliente.setName("cadastroCliente"); // NOI18N
        jMenu1.add(cadastroCliente);

        cadastroVeiculo.setText("Carro");
        cadastroVeiculo.setName("cadastroVeiculo"); // NOI18N
        cadastroVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroVeiculoCadastroCarro(evt);
            }
        });
        jMenu1.add(cadastroVeiculo);

        cadastroUsuario.setText("Usuário");
        cadastroUsuario.setName("cadastroUsuario"); // NOI18N
        cadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroUsuarioCadastroUsuario(evt);
            }
        });
        jMenu1.add(cadastroUsuario);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Consulta");

        consultaCliente.setText("Cliente");
        consultaCliente.setName("consultaCliente"); // NOI18N
        consultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaClienteConsultaCliente(evt);
            }
        });
        jMenu4.add(consultaCliente);

        consultaCarro.setText("Carro");
        consultaCarro.setName("consultaCarro"); // NOI18N
        consultaCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaCarroConsultaCarro(evt);
            }
        });
        jMenu4.add(consultaCarro);

        consultaUsuario.setText("Usuário");
        consultaUsuario.setName("consultaUsuario"); // NOI18N
        consultaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaUsuarioConsultaUsuario(evt);
            }
        });
        jMenu4.add(consultaUsuario);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Aluguel");

        aluguelRegistrar.setText("Registrar");
        aluguelRegistrar.setName("aluguelRegistrar"); // NOI18N
        aluguelRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aluguelRegistrarAluguelRegistrar(evt);
            }
        });
        jMenu2.add(aluguelRegistrar);

        menuCarrosAlugados.setText("Carros Alugados");
        menuCarrosAlugados.setToolTipText("");
        menuCarrosAlugados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCarrosAlugadosConsultaCarrosAlugados(evt);
            }
        });
        jMenu2.add(menuCarrosAlugados);

        jMenuBar1.add(jMenu2);

        MenuExcluir.setText("Excluir");
        MenuExcluir.setName(""); // NOI18N

        excluirCliente.setText("Cliente");
        excluirCliente.setName("excluirCliente"); // NOI18N
        excluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirClienteExcluirCliente(evt);
            }
        });
        MenuExcluir.add(excluirCliente);

        excluirUsuario.setText("Usuário");
        excluirUsuario.setName("excluirUsuario"); // NOI18N
        excluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirUsuarioExcluirUsuario(evt);
            }
        });
        MenuExcluir.add(excluirUsuario);

        excluirVeiculo.setText("Carro");
        excluirVeiculo.setName("excluirVeiculo"); // NOI18N
        excluirVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirVeiculoExcluirCarro(evt);
            }
        });
        MenuExcluir.add(excluirVeiculo);

        jMenuBar1.add(MenuExcluir);

        jMenu5.setText("...");

        alterarSenha.setText("Alterar Senha");
        alterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarSenhaAlterarSenha(evt);
            }
        });
        jMenu5.add(alterarSenha);

        jMenuItem3.setText("SAIR");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3Sair(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(inputCadastroClienteNome))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel3))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel4))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel5))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(167, 167, 167)
                            .addComponent(buttonCadastroCliente))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(164, 164, 164)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(inputCadastroClienteTel, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputCadastroClienteCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                            .addComponent(inputCadastroClienteDataNasc))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputCadastroClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputCadastroClienteTel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputCadastroClienteCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputCadastroClienteDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(buttonCadastroCliente)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarCliente
        
        Connection conexao = ConnMySQL.conectar();

        String sql = "INSERT INTO cliente (nome,telefone,cpf,data_nascimento)" + "Values (?,?,?,?)";

        try {
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, inputCadastroClienteNome.getText());
            statement.setString(2, inputCadastroClienteTel.getText());
            statement.setString(3, inputCadastroClienteCpf.getText());
            statement.setString(4, inputCadastroClienteDataNasc.getText());

            int linhas = statement.executeUpdate();
            //sempre que for inserir, atualizar, deletar, criar
            //dropar ou alterar o banco de qualquer maneira
            //você precisa rodar executeUpdate()
            //INFORMA O NÚMERO DE LINHAS AFETADAS

            if (linhas > 0) {
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");

                inputCadastroClienteNome.setText("");
                inputCadastroClienteTel.setText("");
                inputCadastroClienteCpf.setText("");
                inputCadastroClienteDataNasc.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não cadastrado!");
            }

            conexao.close();

        } catch (com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException e) {

            JOptionPane.showMessageDialog(null, "ERRO! Cpf já cadastrado!");


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }//GEN-LAST:event_CadastrarCliente

    private void inputCadastroClienteCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCadastroClienteCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCadastroClienteCpfActionPerformed

    private void cadastroVeiculoCadastroCarro(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroVeiculoCadastroCarro
        CadastroCarro cadastroCarro = new CadastroCarro();

        cadastroCarro.setVisible(true);
        
        cadastroCarro.setLocationRelativeTo(null);  

        this.dispose();
    }//GEN-LAST:event_cadastroVeiculoCadastroCarro

    private void cadastroUsuarioCadastroUsuario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroUsuarioCadastroUsuario
        CadastroUsuario cadastroUsuario = new CadastroUsuario();

        cadastroUsuario.setVisible(true);
        
        cadastroUsuario.setLocationRelativeTo(null);  

        this.dispose();
    }//GEN-LAST:event_cadastroUsuarioCadastroUsuario

    private void consultaClienteConsultaCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaClienteConsultaCliente
        ConsultaCliente consultaCliente = new ConsultaCliente();

        consultaCliente.setVisible(true);
        
        consultaCliente.setLocationRelativeTo(null);  

        this.dispose();
    }//GEN-LAST:event_consultaClienteConsultaCliente

    private void consultaCarroConsultaCarro(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaCarroConsultaCarro
        ConsultaCarro consultaCarro = new ConsultaCarro();

        consultaCarro.setVisible(true);
        
        consultaCarro.setLocationRelativeTo(null);  

        this.dispose();
    }//GEN-LAST:event_consultaCarroConsultaCarro

    private void consultaUsuarioConsultaUsuario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaUsuarioConsultaUsuario
        ConsultaUsuario consultaUsuario = new ConsultaUsuario();

        consultaUsuario.setVisible(true);
        
        consultaUsuario.setLocationRelativeTo(null);  

        this.dispose();
    }//GEN-LAST:event_consultaUsuarioConsultaUsuario

    private void aluguelRegistrarAluguelRegistrar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aluguelRegistrarAluguelRegistrar
        AluguelRegistrar aluguelRegistrar = new AluguelRegistrar();

        aluguelRegistrar.setVisible(true);
        
        aluguelRegistrar.setLocationRelativeTo(null);  

        this.dispose();
    }//GEN-LAST:event_aluguelRegistrarAluguelRegistrar

    private void menuCarrosAlugadosConsultaCarrosAlugados(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCarrosAlugadosConsultaCarrosAlugados
        AluguelConsultaCarrosAlugados carrosAlugados = new AluguelConsultaCarrosAlugados();

        carrosAlugados.setVisible(true);
        
        carrosAlugados.setLocationRelativeTo(null);  

        this.dispose();
    }//GEN-LAST:event_menuCarrosAlugadosConsultaCarrosAlugados

    private void excluirClienteExcluirCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirClienteExcluirCliente
        ExcluirCliente excluirCliente = new ExcluirCliente();

        excluirCliente.setVisible(true);
        
        excluirCliente.setLocationRelativeTo(null);  

        this.dispose();
    }//GEN-LAST:event_excluirClienteExcluirCliente

    private void excluirUsuarioExcluirUsuario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirUsuarioExcluirUsuario
        ExcluirUsuario excluirUsuario = new ExcluirUsuario();

        excluirUsuario.setVisible(true);
        
        excluirUsuario.setLocationRelativeTo(null);  

        this.dispose();
    }//GEN-LAST:event_excluirUsuarioExcluirUsuario

    private void excluirVeiculoExcluirCarro(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirVeiculoExcluirCarro
        ExcluirCarro excluirCarro = new ExcluirCarro();

        excluirCarro.setVisible(true);
        
        excluirCarro.setLocationRelativeTo(null);  

        this.dispose();
    }//GEN-LAST:event_excluirVeiculoExcluirCarro

    private void alterarSenhaAlterarSenha(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarSenhaAlterarSenha
        AlterarSenha alterarSenha = new AlterarSenha();

        alterarSenha.setVisible(true);
        
        alterarSenha.setLocationRelativeTo(null);  

        this.dispose();
    }//GEN-LAST:event_alterarSenhaAlterarSenha

    private void jMenuItem3Sair(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3Sair
        Login login = new Login();

        login.setVisible(true);
        
        login.setLocationRelativeTo(null);  

        this.dispose();
    }//GEN-LAST:event_jMenuItem3Sair

    private void EscondeMenu(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_EscondeMenu
       if (ADM.adm == 0) {

            MenuExcluir.setVisible(false);
            cadastroUsuario.setVisible(false);
            consultaUsuario.setVisible(false);
        }
    }//GEN-LAST:event_EscondeMenu

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuExcluir;
    private javax.swing.JMenuItem alterarSenha;
    private javax.swing.JMenuItem aluguelRegistrar;
    private javax.swing.JButton buttonCadastroCliente;
    private javax.swing.JMenuItem cadastroCliente;
    private javax.swing.JMenuItem cadastroUsuario;
    private javax.swing.JMenuItem cadastroVeiculo;
    private javax.swing.JMenuItem consultaCarro;
    private javax.swing.JMenuItem consultaCliente;
    private javax.swing.JMenuItem consultaUsuario;
    private javax.swing.JMenuItem excluirCliente;
    private javax.swing.JMenuItem excluirUsuario;
    private javax.swing.JMenuItem excluirVeiculo;
    private javax.swing.JFormattedTextField inputCadastroClienteCpf;
    private javax.swing.JFormattedTextField inputCadastroClienteDataNasc;
    private javax.swing.JTextField inputCadastroClienteNome;
    private javax.swing.JFormattedTextField inputCadastroClienteTel;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem menuCarrosAlugados;
    // End of variables declaration//GEN-END:variables
}

package apresentacao;

import Exception.NaoExisteDadosException;
import dominio.Banco;
import dominio.Conta;
import dominio.ContaCorrente;
import dominio.ContaPoupanca;
import dominio.Contato;
import dominio.Endereco;

import dominio.PessoaFisica;
import dominio.PessoaJuridica;
import javax.swing.JOptionPane;

public class TelaCadastro extends javax.swing.JFrame {
    
    private final Banco banco;
    
    private Conta conta;
    
    private TelaInicial telaInicial;
    
    public TelaCadastro(Banco banco, Conta conta, TelaInicial tela ) {
        initComponents();
        this.jTextFieldCPF.setEnabled(true);
        
        this.banco = banco;
        this.conta = conta;
        
        this.telaInicial = tela;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupPessoa = new javax.swing.ButtonGroup();
        buttonGroupTipoDeConta = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButtonPessoaFisica = new javax.swing.JRadioButton();
        jRadioButtonPessoaJuridica = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNomeRazaoSocial = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jTextFieldCidade = new javax.swing.JTextField();
        jTextFieldRua = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldCPF = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldCNPJ = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jRadioButtonContaCorrente = new javax.swing.JRadioButton();
        jRadioButtonContaPoupanca = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Novo Cliente - Banco Sudeste");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro - Banco SUDESTE");

        buttonGroupPessoa.add(jRadioButtonPessoaFisica);
        jRadioButtonPessoaFisica.setText("Pessoa Fisica");
        jRadioButtonPessoaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPessoaFisicaActionPerformed(evt);
            }
        });

        buttonGroupPessoa.add(jRadioButtonPessoaJuridica);
        jRadioButtonPessoaJuridica.setText("Pessoa Juridica");
        jRadioButtonPessoaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPessoaJuridicaActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome/Razao Social:*");

        jTextFieldNomeRazaoSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeRazaoSocialActionPerformed(evt);
            }
        });

        jLabel3.setText("Contato");

        jLabel4.setText("Email:*");

        jLabel5.setText("Telefone:");

        jLabel6.setText("Endereço");

        jLabel7.setText("Estado:*");

        jLabel8.setText("Rua:");

        jLabel9.setText("Cidade:*");

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SP", "MG", "RJ", "ES" }));
        jComboBoxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstadoActionPerformed(evt);
            }
        });

        jLabel10.setText("Numero:");

        jLabel11.setText("Bairro:");

        jLabel12.setText("CPF: ");

        jLabel13.setText("CNPJ:");

        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        buttonGroupTipoDeConta.add(jRadioButtonContaCorrente);
        jRadioButtonContaCorrente.setText("CONTA CORRENTE");
        jRadioButtonContaCorrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonContaCorrenteActionPerformed(evt);
            }
        });

        buttonGroupTipoDeConta.add(jRadioButtonContaPoupanca);
        jRadioButtonContaPoupanca.setText("CONTA POUPANCA");
        jRadioButtonContaPoupanca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonContaPoupancaActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 2, 10)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Todos os campos com * é obrigatório");

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNomeRazaoSocial))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTelefone)
                            .addComponent(jTextFieldEmail)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNumero))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldBairro, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldRua)
                            .addComponent(jTextFieldCidade)))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButtonContaCorrente)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonPessoaFisica)
                                    .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButtonContaPoupanca)
                                .addGap(151, 151, 151))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonPessoaJuridica)
                                    .addComponent(jTextFieldCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel6)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNomeRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonPessoaFisica)
                    .addComponent(jRadioButtonPessoaJuridica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonContaCorrente)
                    .addComponent(jRadioButtonContaPoupanca))
                .addGap(12, 12, 12)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
    private void jTextFieldNomeRazaoSocialActionPerformed(java.awt.event.ActionEvent evt) {}
    private void jComboBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {}
    private void jRadioButtonContaCorrenteActionPerformed(java.awt.event.ActionEvent evt) {}
    private void jRadioButtonContaPoupancaActionPerformed(java.awt.event.ActionEvent evt) {}
    
    private void jRadioButtonPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPessoaFisicaActionPerformed
        this.jTextFieldCNPJ.setText("");
        this.jTextFieldCPF.setEnabled(true);
        this.jTextFieldCNPJ.setEnabled(false);
    }//GEN-LAST:event_jRadioButtonPessoaFisicaActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        String mensage = null;    
        int numeroIdentificao;
        try
        {
            //CRIANDO UMA PESSOA QUALQUER PARA INSERIR NO ARRAY EM BANCO
            Endereco endereco = new Endereco(jTextFieldRua.getText(),jTextFieldNumero.getText(),jTextFieldBairro.getText(),jTextFieldCidade.getText(),jComboBoxEstado.getSelectedItem().toString());
            Contato contato = new Contato(jTextFieldTelefone.getText(), jTextFieldEmail.getText());
            conta.definindoNumeroDaConta();

            if(this.jRadioButtonPessoaFisica.isSelected())
            {
                numeroIdentificao = Integer.parseInt(jTextFieldCPF.getText());
                PessoaFisica pessoa = new PessoaFisica(jTextFieldCPF.getText(), jTextFieldNomeRazaoSocial.getText(), contato, endereco);
                if(this.jRadioButtonContaCorrente.isSelected())
                {
                    ContaCorrente conta = new ContaCorrente(this.conta.getAgencia(), this.conta.getnumeroDaContaDoNovoCliente(), this.conta.getNumeroDaContaDoUltimoCliente(), this.conta.getSaldoTotal());
                    mensage = banco.abrirConta(pessoa,conta);
                }
                else
                {
                    ContaPoupanca conta = new ContaPoupanca(this.conta.getAgencia(), this.conta.getnumeroDaContaDoNovoCliente(), this.conta.getNumeroDaContaDoUltimoCliente(), this.conta.getSaldoTotal());
                    mensage = banco.abrirConta(pessoa, conta);
                }
            }
            else
            {
                numeroIdentificao = Integer.parseInt(jTextFieldCNPJ.getText());
                PessoaJuridica pessoa = new PessoaJuridica(jTextFieldCNPJ.getText(), jTextFieldNomeRazaoSocial.getText(), contato, endereco);
                if(this.jRadioButtonContaCorrente.isSelected())
                {
                    ContaCorrente conta = new ContaCorrente(this.conta.getAgencia(), this.conta.getnumeroDaContaDoNovoCliente(), this.conta.getNumeroDaContaDoUltimoCliente(), this.conta.getSaldoTotal());
                    mensage = banco.abrirConta(pessoa, conta);
                }
                else
                {
                    ContaPoupanca conta = new ContaPoupanca(this.conta.getAgencia(), this.conta.getnumeroDaContaDoNovoCliente(), this.conta.getNumeroDaContaDoUltimoCliente(), this.conta.getSaldoTotal());
                    mensage = banco.abrirConta(pessoa, conta);
                }
            }
            JOptionPane.showMessageDialog(null,mensage ,"CONTA CRIADA COM SUCESSO!", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (NaoExisteDadosException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Banco Sudeste", JOptionPane.ERROR_MESSAGE);
        }   
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "CPF/CNPJ Inválido", "Banco Sudeste", JOptionPane.ERROR_MESSAGE);
        }

    this.jTextFieldTelefone.setText("");
    this.jTextFieldRua.setText("");
    this.jTextFieldNumero.setText("");
    this.jTextFieldNomeRazaoSocial.setText("");
    this.jTextFieldEmail.setText("");
    this.jTextFieldCidade.setText("");
    this.jTextFieldCPF.setText("");
    this.jTextFieldCNPJ.setText("");
    this.jTextFieldBairro.setText("");
    this.buttonGroupPessoa.clearSelection();
    this.buttonGroupTipoDeConta.clearSelection();
    
    this.banco.salvarClientes();
    this.setVisible(false);
    telaInicial.setVisible(true);
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jRadioButtonPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPessoaJuridicaActionPerformed
        this.jTextFieldCPF.setText("");
        this.jTextFieldCNPJ.setEnabled(true);
        this.jTextFieldCPF.setEnabled(false);
    }//GEN-LAST:event_jRadioButtonPessoaJuridicaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        this.telaInicial.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupPessoa;
    private javax.swing.ButtonGroup buttonGroupTipoDeConta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonContaCorrente;
    private javax.swing.JRadioButton jRadioButtonContaPoupanca;
    private javax.swing.JRadioButton jRadioButtonPessoaFisica;
    private javax.swing.JRadioButton jRadioButtonPessoaJuridica;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCNPJ;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNomeRazaoSocial;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldRua;
    private javax.swing.JTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables
}

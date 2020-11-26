package apresentacao;

import dominio.Banco;
import dominio.Conta;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class TelaPrincipalUsuario extends javax.swing.JFrame {
    private Banco banco;
    private String nomeCliente;
    private String id;
    private Conta conta;
    private String numeroConta;
    
    private TelaSaldoNaTela telaSaldoNaTela;
    private TelaSaqueDepositoTransferir telaSaqueDepositoTransferir;

    public TelaPrincipalUsuario(Banco banco, String nomeCliente,String id, Conta conta, String numeroConta) 
    {
        this.banco = banco;
        this.nomeCliente = nomeCliente;
        this.id = id;
        this.conta = conta;
        this.numeroConta = numeroConta;
        
        this.telaSaldoNaTela = new TelaSaldoNaTela(this,banco,nomeCliente, id);
        this.telaSaqueDepositoTransferir = new TelaSaqueDepositoTransferir(this, banco, nomeCliente, id);
        
        initComponents();
        inicializa();
    }
    
    public void inicializa()
    {
        this.jLabelNomeCliente.setText(nomeCliente);
        Date data = new Date();
        SimpleDateFormat forma = new SimpleDateFormat("dd/MM/yyyy");
        forma.format(data);
        this.jLabelDate.setText(data.toString());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonSaldoNaTela = new javax.swing.JButton();
        jButtonSaldoOuDepositoOuTransferir = new javax.swing.JButton();
        jButtonFecharMinhaConta = new javax.swing.JButton();
        jLabelNomeCliente = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Banco Sudeste - Usuário");

        jLabel1.setText("Ola,");

        jButtonSaldoNaTela.setText("SALDO NA TELA");
        jButtonSaldoNaTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaldoNaTelaActionPerformed(evt);
            }
        });

        jButtonSaldoOuDepositoOuTransferir.setText("SACAR, DEPOSITAR OU TRANSFERIR");
        jButtonSaldoOuDepositoOuTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaqueDepositoTransferirActionPerformed(evt);
            }
        });

        jButtonFecharMinhaConta.setForeground(new java.awt.Color(255, 0, 51));
        jButtonFecharMinhaConta.setText("FECHAR MINHA CONTA");
        jButtonFecharMinhaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharMinhaContaActionPerformed(evt);
            }
        });

        jLabelNomeCliente.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabelNomeCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BANCO SUDESTE");

        jLabelDate.setForeground(new java.awt.Color(0, 204, 0));
        jLabelDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButtonSair.setForeground(new java.awt.Color(204, 0, 0));
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelNomeCliente)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSaldoNaTela, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSaldoOuDepositoOuTransferir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonFecharMinhaConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                            .addComponent(jLabelDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelNomeCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSaldoNaTela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSaldoOuDepositoOuTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonFecharMinhaConta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaldoNaTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaldoNaTelaActionPerformed
        this.setVisible(false);
        this.telaSaldoNaTela.defineSaldo();
        this.telaSaldoNaTela.setVisible(true);
    }//GEN-LAST:event_jButtonSaldoNaTelaActionPerformed

    private void jButtonFecharMinhaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharMinhaContaActionPerformed
        banco.fecharConta(nomeCliente, conta,numeroConta);
        JOptionPane.showMessageDialog(null, "Conta encerrada com sucesso", "Banco Sudeste", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
        
    }//GEN-LAST:event_jButtonFecharMinhaContaActionPerformed

    private void jButtonSaqueDepositoTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaqueDepositoTransferirActionPerformed
        this.setVisible(false);
        this.telaSaqueDepositoTransferir.setVisible(true);
        JOptionPane.showMessageDialog(null, "Selecione sua conta", "Banco Sudeste", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButtonSaqueDepositoTransferirActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        this.banco.salvarClientes();
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFecharMinhaConta;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSaldoNaTela;
    private javax.swing.JButton jButtonSaldoOuDepositoOuTransferir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelNomeCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

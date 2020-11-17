/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import dominio.Banco;
import dominio.Conta;
import dominio.Pessoa;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author erick
 */
public class TelaSaldoNaTela extends javax.swing.JFrame {

    private TelaPrincipalUsuario telaPrincipalUsuario;
    private Banco banco; 
    private String nomeCliente;
    
    private String numeroDaConta;
    
    public TelaSaldoNaTela(TelaPrincipalUsuario telaPrincipalUsuario, Banco banco, String nomeCliente) {
        this.telaPrincipalUsuario = telaPrincipalUsuario;
        this.banco = banco;
        this.nomeCliente = nomeCliente;
        
        initComponents();
        inicializa();
    }
    
    public void inicializa()
    {
        this.jLabelNomeDoCliente.setText(nomeCliente);
        Date data = new Date();
        SimpleDateFormat forma = new SimpleDateFormat("dd/MM/yyyy");
        forma.format(data);
        this.jLabelDate.setText(data.toString());
        
        contasCliente();
        //this.jLabelSaldoDoCliente.setText(String.valueOf(saldoContaCliente()));
    }
    
    public void defineSaldo()
    {
        this.jLabelSaldoDoCliente.setText(String.valueOf(saldoContaCliente()));
    }

    public void contasCliente()
    {
        Iterator<Pessoa> it_pessoas = banco.getClientes().iterator();
        
        while(it_pessoas.hasNext())
        {
            Pessoa aux_pessoas = it_pessoas.next();
            if(aux_pessoas.getNome().equals(nomeCliente))
                this.jComboBoxContasDoCliente.addItem(aux_pessoas.getLoginDaConta());
        }
        //this.numeroDaConta = this.jComboBoxContasDoCliente.getSelectedItem().toString();
    }
    
    public double saldoContaCliente()
    {
        Iterator<Pessoa> it_pessoas = banco.getClientes().iterator();
        
        while(it_pessoas.hasNext())
        {
            Pessoa aux_pessoas = it_pessoas.next();
            if(aux_pessoas.getLoginDaConta().equals(this.numeroDaConta))
            {
                Iterator<Conta> it_contas = aux_pessoas.getContas().iterator();
                while(it_contas.hasNext())
                {
                    Conta conta_aux = it_contas.next();
                    
                    if(conta_aux.getNumero().equals(this.numeroDaConta))
                        return conta_aux.getSaldoTotal();
                }
            }
                
        }
        return 0;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelNomeDoCliente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();
        jButtonVoltarAoMenuAnterior = new javax.swing.JButton();
        jButtonDesconheçoMeuSaldo = new javax.swing.JButton();
        jLabelSaldoDoCliente = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jComboBoxContasDoCliente = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        jButton1.setText("jButton1");

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Saldo na Tela");

        jPanel1.setToolTipText("Saldo na tela");

        jLabel1.setText("Olá,");

        jLabelNomeDoCliente.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N

        jLabel3.setText("Saldo Atual:");

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonVoltarAoMenuAnterior.setText("Voltar ao menu anterior");
        jButtonVoltarAoMenuAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarAoMenuAnteriorActionPerformed(evt);
            }
        });

        jButtonDesconheçoMeuSaldo.setText("Desconheço o meu saldo");
        jButtonDesconheçoMeuSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesconheçoMeuSaldoActionPerformed(evt);
            }
        });

        jLabelSaldoDoCliente.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelSaldoDoCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("BANCO SUDESTE");

        jLabelDate.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabelDate.setForeground(new java.awt.Color(0, 204, 0));
        jLabelDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jComboBoxContasDoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxContasDoClienteActionPerformed(evt);
            }
        });

        jLabel2.setText("Conta:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonDesconheçoMeuSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(jButtonVoltarAoMenuAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelSaldoDoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboBoxContasDoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jLabelNomeDoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeDoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxContasDoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabelSaldoDoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonSair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVoltarAoMenuAnterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDesconheçoMeuSaldo)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarAoMenuAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoMenuAnteriorActionPerformed
        this.setVisible(false);
        this.telaPrincipalUsuario.setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoMenuAnteriorActionPerformed

    private void jButtonDesconheçoMeuSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesconheçoMeuSaldoActionPerformed
        JOptionPane.showMessageDialog(null,"Vefique sua ocorrência na gerência\n"+"bancosudeste@naoexiste.com.br" ,"SALDO DESCONHECIDO", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButtonDesconheçoMeuSaldoActionPerformed

    private void jComboBoxContasDoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxContasDoClienteActionPerformed
        this.numeroDaConta = this.jComboBoxContasDoCliente.getSelectedItem().toString();
        defineSaldo();
    }//GEN-LAST:event_jComboBoxContasDoClienteActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonDesconheçoMeuSaldo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonVoltarAoMenuAnterior;
    private javax.swing.JComboBox<String> jComboBoxContasDoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelNomeDoCliente;
    private javax.swing.JLabel jLabelSaldoDoCliente;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

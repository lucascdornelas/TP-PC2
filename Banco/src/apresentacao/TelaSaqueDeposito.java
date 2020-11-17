/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import Exception.NaoTemDinheiroException;
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
public class TelaSaqueDeposito extends javax.swing.JFrame {
    
    private TelaPrincipalUsuario telaPrincipalUsuario;
    private Banco banco; 
    private String nomeCliente;
    
    private String valor;
    private String numeroDaConta;

    public TelaSaqueDeposito(TelaPrincipalUsuario telaPrincipalUsuario, Banco banco, String nomeCliente) {
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
    }
    
    public void defineSaldo()
    {
        this.jLabelSaldoDoCliente.setText(String.valueOf(banco.saldoContaCliente(numeroDaConta)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonSaque = new javax.swing.JButton();
        jButtonDeposito = new javax.swing.JButton();
        jButtonVoltarAoMenuAnterior = new javax.swing.JButton();
        jTextFieldValor = new javax.swing.JTextField();
        jLabelDate = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelNomeDoCliente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxContasDoCliente = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabelSaldoDoCliente = new javax.swing.JLabel();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Saque ou Depósito");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BANCO SUDESTE");

        jLabel2.setText("$");

        jButtonSaque.setText("Saque");
        jButtonSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaqueActionPerformed(evt);
            }
        });

        jButtonDeposito.setText("Depósito");

        jButtonVoltarAoMenuAnterior.setText("Voltar ao Menu Anterior");
        jButtonVoltarAoMenuAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarAoMenuAnteriorActionPerformed(evt);
            }
        });

        jLabelDate.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabelDate.setForeground(new java.awt.Color(0, 153, 0));
        jLabelDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel4.setText("Olá,");

        jLabelNomeDoCliente.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N

        jLabel3.setText("Conta:");

        jComboBoxContasDoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxContasDoClienteActionPerformed(evt);
            }
        });

        jLabel5.setText("Saldo:");

        jLabelSaldoDoCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldValor))
            .addComponent(jButtonSaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonVoltarAoMenuAnterior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonDeposito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelNomeDoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxContasDoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelSaldoDoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelNomeDoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSaldoDoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jComboBoxContasDoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addComponent(jButtonSaque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDeposito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVoltarAoMenuAnterior)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarAoMenuAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoMenuAnteriorActionPerformed
        this.setVisible(false);
        this.telaPrincipalUsuario.setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoMenuAnteriorActionPerformed

    private void jButtonSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaqueActionPerformed
        valor = this.jTextFieldValor.getText();
        //tirando dinheiro da conta
        
        //primeiro, precisa ver se o cara tem dinheiro na conta
        try 
        {
            banco.saque(this.numeroDaConta, Double.parseDouble(this.valor));
            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!", "Banco Sudeste", JOptionPane.INFORMATION_MESSAGE);            
        } 
        catch (NaoTemDinheiroException ex) 
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Banco Sudeste", JOptionPane.ERROR_MESSAGE);
        } 
        catch (NumberFormatException ex) 
        {
            JOptionPane.showMessageDialog(null, "Algarismo Inválido", "Banco Sudeste", JOptionPane.ERROR_MESSAGE);
        }
        this.setVisible(false);
        this.telaPrincipalUsuario.setVisible(true);
    }//GEN-LAST:event_jButtonSaqueActionPerformed

    private void jComboBoxContasDoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxContasDoClienteActionPerformed
        this.numeroDaConta = this.jComboBoxContasDoCliente.getSelectedItem().toString();
        defineSaldo();
    }//GEN-LAST:event_jComboBoxContasDoClienteActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonDeposito;
    private javax.swing.JButton jButtonSaque;
    private javax.swing.JButton jButtonVoltarAoMenuAnterior;
    private javax.swing.JComboBox<String> jComboBoxContasDoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelNomeDoCliente;
    private javax.swing.JLabel jLabelSaldoDoCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
}

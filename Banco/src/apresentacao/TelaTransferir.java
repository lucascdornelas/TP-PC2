package apresentacao;

import Exception.NaoExisteContaException;
import Exception.NaoTemDinheiroException;
import Exception.SaqueDepositoException;
import dominio.Banco;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class TelaTransferir extends javax.swing.JFrame {
    private TelaSaqueDepositoTransferir telaSaqueDepositoTransferir;
    
    private Banco banco; 
    private String nomeCliente;
    
    
    private String contaOrigem, valorTransferencia, contaTransferencia;

    public TelaTransferir(Banco banco, String nomeCliente,TelaSaqueDepositoTransferir telaSaqueDepositoTransferir, String contaOrigem) {
        
        this.telaSaqueDepositoTransferir = telaSaqueDepositoTransferir;
        
        this.banco = banco;
        this.nomeCliente = nomeCliente;
        this.contaOrigem = contaOrigem;
        
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
        defineSaldo();
    }
    
    public void defineSaldo()
    {
        this.jLabelSaldoCliente.setText(String.valueOf(banco.saldoContaCliente(this.contaOrigem)));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelNomeDoCliente = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldContaTransferir = new javax.swing.JTextField();
        jTextFieldValorTransferencia = new javax.swing.JTextField();
        jButtonTransferir = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabelSaldoCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setToolTipText("Banco Sudeste - Transferência");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BANCO SUDESTE");

        jLabelDate.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabelDate.setForeground(new java.awt.Color(0, 153, 0));
        jLabelDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Ola,");

        jLabelNomeDoCliente.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabelNomeDoCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel4.setText("Conta:");

        jLabel5.setText("Valor:$");

        jTextFieldContaTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContaTransferirActionPerformed(evt);
            }
        });

        jTextFieldValorTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorTransferenciaActionPerformed(evt);
            }
        });

        jButtonTransferir.setText("Transferir Agora");
        jButtonTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTransferirActionPerformed(evt);
            }
        });

        jButtonCancelar.setForeground(new java.awt.Color(255, 0, 51));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabel3.setText("Saldo Disponivel: $");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                    .addComponent(jLabelDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelNomeDoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldValorTransferencia))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldContaTransferir))
                    .addComponent(jButtonTransferir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelSaldoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelNomeDoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelSaldoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldContaTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldValorTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonTransferir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCancelar)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldValorTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorTransferenciaActionPerformed
        valorTransferencia = this.jTextFieldValorTransferencia.getText();
    }//GEN-LAST:event_jTextFieldValorTransferenciaActionPerformed

    private void jButtonTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTransferirActionPerformed
        valorTransferencia = this.jTextFieldValorTransferencia.getText();
        contaTransferencia = this.jTextFieldContaTransferir.getText();
        
        try 
        {
            banco.transferir(this.contaOrigem, this.contaTransferencia, (Double.parseDouble(this.valorTransferencia)));
            JOptionPane.showMessageDialog(null, "Transferencia realizada com sucesso!", "Banco Sudeste", JOptionPane.INFORMATION_MESSAGE);    
            banco.salvarClientes();
        } 
        catch (NaoTemDinheiroException ex) 
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Banco Sudeste", JOptionPane.ERROR_MESSAGE);
        } 
        catch (NumberFormatException ex) 
        {
            JOptionPane.showMessageDialog(null, "Algarismo Invalido", "Banco Sudeste", JOptionPane.ERROR_MESSAGE);
        }
        catch (NaoExisteContaException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Banco Sudeste", JOptionPane.ERROR_MESSAGE);
        }
                catch (SaqueDepositoException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Banco Sudeste", JOptionPane.ERROR_MESSAGE);
        }
        
        this.jTextFieldContaTransferir.setText("");
        this.jTextFieldValorTransferencia.setText("");
        this.setVisible(false);
        this.telaSaqueDepositoTransferir.setVisible(true);
    }//GEN-LAST:event_jButtonTransferirActionPerformed

    private void jTextFieldContaTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContaTransferirActionPerformed
        contaTransferencia = this.jTextFieldContaTransferir.getText();
    }//GEN-LAST:event_jTextFieldContaTransferirActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.jTextFieldContaTransferir.setText("");
        this.jTextFieldValorTransferencia.setText("");
        this.setVisible(false);
        this.telaSaqueDepositoTransferir.setVisible(true);
        banco.salvarClientes();
        System.exit(0);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonTransferir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelNomeDoCliente;
    private javax.swing.JLabel jLabelSaldoCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldContaTransferir;
    private javax.swing.JTextField jTextFieldValorTransferencia;
    // End of variables declaration//GEN-END:variables
}

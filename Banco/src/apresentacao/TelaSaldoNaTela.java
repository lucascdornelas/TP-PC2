package apresentacao;

import dominio.Banco;
import dominio.Pessoa;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class TelaSaldoNaTela extends javax.swing.JFrame {

    private TelaPrincipalUsuario telaPrincipalUsuario;
    private Banco banco; 
    private String nomeCliente;
    private String id;
    
    private String numeroDaConta;
    
    public TelaSaldoNaTela(TelaPrincipalUsuario telaPrincipalUsuario, Banco banco, String nomeCliente, String id) {
        this.telaPrincipalUsuario = telaPrincipalUsuario;
        this.banco = banco;
        this.nomeCliente = nomeCliente;
        this.id = id;
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
        this.defineSaldo();
    }
    
    public void defineSaldo()
    {
        this.jLabelSaldoDoCliente.setText(String.valueOf(banco.saldoContaCliente(numeroDaConta)));
    }

    //ESSA FUNÇÃO SERVE PARA DEFINIR QUANTAS CONTAS O CLIENTE TEM
    public void contasCliente()
    {
        Iterator<Pessoa> it_pessoas = banco.getClientes().iterator();
        
        while(it_pessoas.hasNext())
        {
            Pessoa aux_pessoas = it_pessoas.next();
            if(aux_pessoas.getId().equals(id))
                this.jComboBoxContasDoCliente.addItem(aux_pessoas.getLoginDaConta());                   
        }
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
        jButtonDesconhecoMeuSaldo = new javax.swing.JButton();
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

        jPanel1.setToolTipText("Banco Sudeste - Saldo na tela");

        jLabel1.setText("Ola,");

        jLabelNomeDoCliente.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabelNomeDoCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setText("Saldo Atual:");

        jButtonSair.setForeground(new java.awt.Color(204, 0, 0));
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

        jButtonDesconhecoMeuSaldo.setText("Desconheco o meu saldo");
        jButtonDesconhecoMeuSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesconhecoMeuSaldoActionPerformed(evt);
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
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jButtonDesconhecoMeuSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                                    .addComponent(jButtonVoltarAoMenuAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelSaldoDoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(4, 4, 4))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(27, 27, 27)
                                .addComponent(jComboBoxContasDoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelNomeDoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNomeDoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxContasDoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelSaldoDoCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDesconhecoMeuSaldo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonVoltarAoMenuAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSair)))
                .addContainerGap(13, Short.MAX_VALUE))
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

    private void jButtonVoltarAoMenuAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoMenuAnteriorActionPerformed
        this.setVisible(false);
        this.telaPrincipalUsuario.setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoMenuAnteriorActionPerformed

    private void jButtonDesconhecoMeuSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesconhecoMeuSaldoActionPerformed
        JOptionPane.showMessageDialog(null,"Vefique sua ocorrencia na gerencia\n"+"bancosudeste@naoexiste.com.br" ,"SALDO DESCONHECIDO", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButtonDesconhecoMeuSaldoActionPerformed

    private void jComboBoxContasDoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxContasDoClienteActionPerformed
        this.numeroDaConta = this.jComboBoxContasDoCliente.getSelectedItem().toString();
        defineSaldo();
    }//GEN-LAST:event_jComboBoxContasDoClienteActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        banco.salvarClientes();
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonDesconhecoMeuSaldo;
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

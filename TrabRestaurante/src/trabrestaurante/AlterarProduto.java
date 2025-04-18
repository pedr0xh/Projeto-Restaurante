/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabrestaurante;

import dao.ProdutoDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Produto;

/**
 *
 * @author Pedr0xh
 */
public class AlterarProduto extends javax.swing.JFrame {
    
    
    public AlterarProduto() {
        initComponents();
        carregarProdutos();
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtQntd2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Salvar = new javax.swing.JButton();
        txtQntd = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbProduto = new javax.swing.JComboBox<>();
        btnBusca = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        cmbCategoria = new javax.swing.JComboBox<>();
        btnApagar = new javax.swing.JButton();

        txtQntd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQntd2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Valor:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Salvar.setText("Alterar");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        txtQntd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQntdActionPerformed(evt);
            }
        });

        jLabel1.setText("Quantidade:");

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        jLabel2.setText("Valor:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel5.setText("Alterar Produto");

        jLabel6.setText("Produto");

        jLabel7.setText("Categoria:");

        btnBusca.setText("Buscar");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        jLabel4.setText("Nome:");

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comida", "Sobremesa", "Bebida" }));

        btnApagar.setText("Deletar");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(108, 108, 108))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(cmbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBusca)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel1)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txtQntd, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel2)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txtValor)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18)
                                                .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(Salvar)))
                                .addGap(18, 18, 18)
                                .addComponent(btnApagar)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusca))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQntd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Salvar)
                            .addComponent(btnApagar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        
        ProdutoDao pDao = new ProdutoDao();

    // Pegando os valores dos campos de texto
    String nome = cmbProduto.getSelectedItem().toString();
    String nometxt = txtProduto.getText();
    int id = pDao.idPorNome(nome);
    double preco = Double.parseDouble(txtValor.getText().replace(",", "."));
    int quantidade = Integer.parseInt(txtQntd.getText());
    String categoria = cmbCategoria.getSelectedItem().toString();

    // Criando um objeto Produto com os novos valores
    Produto produto = new Produto(id, nometxt, preco, quantidade, categoria);

    // Chamando o método para alterar no banco
    pDao.alterarProduto(produto);

    // Mensagem de sucesso
    JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso!");
    carregarProdutos();    
    }//GEN-LAST:event_SalvarActionPerformed

    private void txtQntdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQntdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQntdActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void txtQntd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQntd2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQntd2ActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        ProdutoDao pDao = new ProdutoDao();

        // Converter o item selecionado para String
        String nome = cmbProduto.getSelectedItem().toString();  

        // Buscar o produto no banco de dados pelo nome
        Produto p = pDao.carregarNome(nome);

        // Verifica se o produto foi encontrado antes de preencher os campos
        if (p != null) {  
            txtProduto.setText(nome);
            txtQntd.setText(String.valueOf(p.getQuantidade())); 
            cmbCategoria.setSelectedItem(p.getCategoria());
            txtValor.setText(String.format("%.2f", p.getPreco())); // Formata o preço com 2 casas decimais
        } else {
            JOptionPane.showMessageDialog(null, "Produto não encontrado!");
        }
    }//GEN-LAST:event_btnBuscaActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
            
        ProdutoDao pDao = new ProdutoDao();

        // Pegando os valores dos campos de texto
        String nome = txtProduto.getText();

        // Exibe um diálogo de confirmação
        int resposta = JOptionPane.showConfirmDialog(
            null, 
            "Tem certeza que deseja deletar o produto '" + nome + "'?", 
            "Confirmar exclusão", 
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );

        // Se o usuário clicar em "Sim" (resposta == JOptionPane.YES_OPTION)
        if (resposta == JOptionPane.YES_OPTION) {
            int id = pDao.idPorNome(nome);
            double preco = Double.parseDouble(txtValor.getText().replace(",", "."));
            int quantidade = Integer.parseInt(txtQntd.getText());
            String categoria = cmbCategoria.getSelectedItem().toString();

            // Criando um objeto Produto com os novos valores
            Produto produto = new Produto(id, nome, preco, quantidade, categoria);

            // Chamando o método para excluir o produto do banco
            pDao.excluir(produto);

            // Mensagem de sucesso
            JOptionPane.showMessageDialog(null, "Produto deletado com sucesso!");

            // Atualizar a lista de produtos no ComboBox
            carregarProdutos();
        } else {
            // Caso o usuário cancele a exclusão, uma mensagem de cancelamento pode ser exibida, se desejado
            JOptionPane.showMessageDialog(null, "Exclusão cancelada.");
        }
    }//GEN-LAST:event_btnApagarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarProduto().setVisible(true);
            }
        });//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
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
            java.util.logging.Logger.getLogger(AlterarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
    }
    
    private void carregarProdutos() {
        ProdutoDao pDao = new ProdutoDao();
        ArrayList<Produto> produtos = pDao.carregarTodos();

        cmbProduto.removeAllItems(); // Limpa os itens anteriores para evitar duplicatas

        for (Produto p : produtos) {
            cmbProduto.addItem(p.getNome()); // Adiciona apenas o nome do produto ao ComboBox
        }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salvar;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnBusca;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JComboBox<String> cmbProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQntd;
    private javax.swing.JTextField txtQntd2;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}

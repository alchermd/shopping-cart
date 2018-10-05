/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;

/**
 *
 * @author alchermd
 */
public class Cart extends javax.swing.JFrame {

    /**
     * Creates new form Cart
     */
    public Cart() {
        initComponents();
        initProducts();
    }
    
    ArrayList<Product> products = new ArrayList<>();
    DefaultListModel selectedItems = new DefaultListModel();
    
    /**
     * Initialize the items list.
     */
    private void initProducts() {
        products.add(new Product("Designer T-Shirt", 10.00, tshirtItem));
        products.add(new Product("Custom Mug",       15.95, mugItem));
        products.add(new Product("Concert Pass",     20.00, concertPassItem));
        products.add(new Product("Premium Lanyard",  05.55, lanyardItem));
        products.add(new Product("Basic Baller",     08.25, ballerItem));
        products.add(new Product("Signature Pen",    01.15, penItem));
        products.add(new Product("Lifetime Plan",    99.99, lifetimePlanItem));
        products.add(new Product("3 Month Plan",     50.00, threeMonthPlanItem));
    }
    
    /**
     * Uncheck all the product checkboxes.
     */
    private void uncheckAll() {
        for (Product product: products) {
            product.getCheckbox().setSelected(false);
        }  
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tshirtItem = new javax.swing.JCheckBox();
        mugItem = new javax.swing.JCheckBox();
        concertPassItem = new javax.swing.JCheckBox();
        lanyardItem = new javax.swing.JCheckBox();
        lifetimePlanItem = new javax.swing.JCheckBox();
        threeMonthPlanItem = new javax.swing.JCheckBox();
        ballerItem = new javax.swing.JCheckBox();
        penItem = new javax.swing.JCheckBox();
        addToCartButton = new javax.swing.JButton();
        uncheckAllButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cartList = new javax.swing.JList<>();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 32767));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);

        jLabel1.setText("Shopping Cart");

        tshirtItem.setText("$10.00 -> Designer T-Shirt");

        mugItem.setText("$15.95 -> Custom Mug");

        concertPassItem.setText("$20.00 -> Concert Pass");

        lanyardItem.setText("$05.55 -> Premium Lanyard");

        lifetimePlanItem.setText("$99.99 -> Lifetime Plan");

        threeMonthPlanItem.setText("$50.00 -> 3 Month Plan");

        ballerItem.setText("$08.25 -> Basic Baller");

        penItem.setText("$01.15 -> Signature Pen");

        addToCartButton.setText("ADD TO CART");
        addToCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartButtonActionPerformed(evt);
            }
        });

        uncheckAllButton.setText("UNCHECK ALL");
        uncheckAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uncheckAllButtonActionPerformed(evt);
            }
        });

        jButton3.setText("REMOVE ITEM");

        jScrollPane1.setViewportView(cartList);

        jButton4.setText("CLEAR CART");

        jButton5.setText("CHECKOUT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(tshirtItem)
                            .addComponent(mugItem)
                            .addComponent(concertPassItem)
                            .addComponent(lanyardItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(penItem)
                            .addComponent(lifetimePlanItem)
                            .addComponent(ballerItem)
                            .addComponent(threeMonthPlanItem)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(uncheckAllButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                .addComponent(addToCartButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tshirtItem)
                    .addComponent(ballerItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mugItem)
                    .addComponent(penItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(concertPassItem)
                    .addComponent(lifetimePlanItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(threeMonthPlanItem)
                    .addComponent(lanyardItem))
                .addGap(12, 12, 12)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addToCartButton)
                        .addGap(12, 12, 12)
                        .addComponent(uncheckAllButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jButton5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Add to cart action.
     * @param evt 
     */
    private void addToCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartButtonActionPerformed
        for (Product product: products) {
            if (product.getCheckbox().isSelected()) {
                selectedItems.addElement(product.getName());
            }
        }
        
        uncheckAll();
        cartList.setModel(selectedItems);
    }//GEN-LAST:event_addToCartButtonActionPerformed

    private void uncheckAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uncheckAllButtonActionPerformed
        uncheckAll();
    }//GEN-LAST:event_uncheckAllButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartButton;
    private javax.swing.JCheckBox ballerItem;
    private javax.swing.JList<String> cartList;
    private javax.swing.JCheckBox concertPassItem;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox lanyardItem;
    private javax.swing.JCheckBox lifetimePlanItem;
    private javax.swing.JCheckBox mugItem;
    private javax.swing.JCheckBox penItem;
    private javax.swing.JCheckBox threeMonthPlanItem;
    private javax.swing.JCheckBox tshirtItem;
    private javax.swing.JButton uncheckAllButton;
    // End of variables declaration//GEN-END:variables

}

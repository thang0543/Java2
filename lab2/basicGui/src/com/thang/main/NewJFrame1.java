/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.thang.main;

import java.awt.Color;

/**
 *
 * @author LENOVO
 */
public class NewJFrame1 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public NewJFrame1() {
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

        txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt.setBackground(new java.awt.Color(255, 0, 0));
        txt.setText("jTextField1");
        txt.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txtComponentAdded(evt);
            }
        });
        txt.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtCaretUpdate(evt);
            }
        });
        txt.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                txtHierarchyChanged(evt);
            }
        });
        txt.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                txtAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                txtAncestorRemoved(evt);
            }
        });
        txt.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                txtMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtMouseMoved(evt);
            }
        });
        txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFocusLost(evt);
            }
        });
        txt.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                txtMouseWheelMoved(evt);
            }
        });
        txt.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                txtAncestorMoved1(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                txtAncestorResized(evt);
            }
        });
        txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtMousePressed(evt);
            }
        });
        txt.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                txtComponentHidden(evt);
            }
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                txtComponentMoved(evt);
            }
            public void componentResized(java.awt.event.ComponentEvent evt) {
                txtComponentResized(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                txtComponentShown(evt);
            }
        });
        txt.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                txtCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtInputMethodTextChanged(evt);
            }
        });
        txt.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtPropertyChange(evt);
            }
        });
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeyTyped(evt);
            }
        });
        txt.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                txtVetoableChange(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(268, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_txtVetoableChange
        txt.setBackground(Color.BLACK);
    }//GEN-LAST:event_txtVetoableChange

    private void txtAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtAncestorAdded
        
    }//GEN-LAST:event_txtAncestorAdded

    private void txtAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtAncestorRemoved
         
    }//GEN-LAST:event_txtAncestorRemoved

    private void txtAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtAncestorMoved
         
    }//GEN-LAST:event_txtAncestorMoved

    //sự kiện xảy ra khi thay đổi giá trị textFile
    private void txtCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtCaretUpdate
//         txt.setBackground(Color.BLACK);
    }//GEN-LAST:event_txtCaretUpdate

    private void txtComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_txtComponentHidden
      
    }//GEN-LAST:event_txtComponentHidden

    private void txtComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_txtComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComponentMoved

    private void txtComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_txtComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComponentResized

    private void txtComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_txtComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComponentShown

    private void txtComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txtComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComponentAdded

    private void txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFocusGained
       
    }//GEN-LAST:event_txtFocusGained

    private void txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFocusLost

    private void txtHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_txtHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHierarchyChanged

    private void txtAncestorMoved1(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_txtAncestorMoved1
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAncestorMoved1

    private void txtAncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_txtAncestorResized
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAncestorResized

    private void txtCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCaretPositionChanged

    private void txtInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputMethodTextChanged

    private void txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKeyPressed

    private void txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKeyReleased

    private void txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKeyTyped

    private void txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMouseClicked

    private void txtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMouseEntered

    private void txtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMouseExited

    private void txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMousePressed

    private void txtMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMouseDragged

    private void txtMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMouseMoved

    private void txtMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_txtMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMouseWheelMoved

    private void txtPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPropertyChange

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
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField txt;
    // End of variables declaration//GEN-END:variables
}
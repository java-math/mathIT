/*
 * MessageFrame.java
 *
 * Copyright (C) 2004-2016 Andreas de Vries
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see http://www.gnu.org/licenses
 * or write to the Free Software Foundation,Inc., 51 Franklin Street,
 * Fifth Floor, Boston, MA 02110-1301  USA
 * 
 * As a special exception, the copyright holders of this program give you permission 
 * to link this program with independent modules to produce an executable, 
 * regardless of the license terms of these independent modules, and to copy and 
 * distribute the resulting executable under terms of your choice, provided that 
 * you also meet, for each linked independent module, the terms and conditions of 
 * the license of that module. An independent module is a module which is not derived 
 * from or based on this program. If you modify this program, you may extend 
 * this exception to your version of the program, but you are not obligated to do so. 
 * If you do not wish to do so, delete this exception statement from your version.
 */
package org.mathIT.gui;

import javax.swing.JLabel;
import javax.swing.UIManager;

/**
 * This class creates a simple frame to display a message.
 *
 * @author  Andreas de Vries
 * @version 1.0
 */
public class MessageFrame extends javax.swing.JFrame {
	private static final long serialVersionUID = -1082511041;
    
    /** Creates new output frame.
     *  @param message the message to be displayed
     *  @param title the title of this frame
     *  @param width the width of this frame
     *  @param height the height of this frame
     */
    public MessageFrame(String message, String title, int width, int height) {
        try {
            UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName() );
            if ( UIManager.getSystemLookAndFeelClassName().equals( "javax.swing.plaf.metal.MetalLookAndFeel" ) ) {
                UIManager.setLookAndFeel( "com.sun.java.swing.plaf.motif.MotifLookAndFeel" );
            }
        } catch ( Exception e ) {
        }    
        setTitle(title);
        initComponents();
        //JLabel outputArea = new javax.swing.JLabel(message);
        //outputArea.setPreferredSize(new java.awt.Dimension(width, height));
        //getContentPane().add(outputArea, java.awt.BorderLayout.CENTER);
        
        JLabel outputArea = new JLabel(message, javax.swing.SwingConstants.CENTER);
        javax.swing.JScrollPane scroller = new javax.swing.JScrollPane(outputArea);
        scroller.setPreferredSize(new java.awt.Dimension(width, height));
        getContentPane().add(scroller, java.awt.BorderLayout.CENTER);

        pack();
        setLocation( 50, 50);
        setVisible(true);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      leftPanel = new javax.swing.JPanel();
      rightPanel = new javax.swing.JPanel();
      closePanel = new javax.swing.JPanel();
      closeButton = new javax.swing.JButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

      leftPanel.setPreferredSize(new java.awt.Dimension(20, 100));
      getContentPane().add(leftPanel, java.awt.BorderLayout.WEST);

      rightPanel.setPreferredSize(new java.awt.Dimension(20, 100));
      getContentPane().add(rightPanel, java.awt.BorderLayout.EAST);

      closeButton.setText("OK");
      closeButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            closeButtonActionPerformed(evt);
         }
      });
      closePanel.add(closeButton);

      getContentPane().add(closePanel, java.awt.BorderLayout.SOUTH);

      pack();
   }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed
    
    /**
     * This method serves for test purposes...
     */
    /*
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
           new MessageFrame("This is a longer Text ...", "Title", 250, 50);
        });
    }
    // */
    
   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton closeButton;
   private javax.swing.JPanel closePanel;
   private javax.swing.JPanel leftPanel;
   private javax.swing.JPanel rightPanel;
   // End of variables declaration//GEN-END:variables
    
}

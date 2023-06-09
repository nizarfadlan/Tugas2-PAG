/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dev.nizarfadlan.tugas2;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/**
 *
 * @author nizar
 */
public class Tugas2 extends javax.swing.JFrame {
  private int[] dataSales = new int[6];
  private int maks;
  private int tg;
  private int lb;

  /**
   * Creates new form Tugas2
   */
  public Tugas2() {
    initComponents();
    setTitle("Drawing Sales Graph");
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    buttonGroup1 = new javax.swing.ButtonGroup();
    canvas1 = new java.awt.Canvas();
    buttonExit = new javax.swing.JButton();
    buttonDrawing = new javax.swing.JButton();
    buttonClear = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    selectBar = new javax.swing.JRadioButton();
    selectLine = new javax.swing.JRadioButton();
    selectPie = new javax.swing.JRadioButton();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    fieldJanuary = new javax.swing.JTextField();
    fieldFebruary = new javax.swing.JTextField();
    fieldMarch = new javax.swing.JTextField();
    fieldApril = new javax.swing.JTextField();
    fieldMay = new javax.swing.JTextField();
    fieldJune = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    canvas1.setBackground(new java.awt.Color(254, 254, 254));

    buttonExit.setText("Exit");
    buttonExit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonExitActionPerformed(evt);
      }
    });

    buttonDrawing.setText("Drawing");
    buttonDrawing.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonDrawingActionPerformed(evt);
      }
    });

    buttonClear.setText("Clear");
    buttonClear.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonClearActionPerformed(evt);
      }
    });

    jLabel1.setText("Select Chart");

    buttonGroup1.add(selectBar);
    selectBar.setSelected(true);
    selectBar.setText("Bar");

    buttonGroup1.add(selectLine);
    selectLine.setText("Line");

    buttonGroup1.add(selectPie);
    selectPie.setText("Pie");

    jLabel2.setText("Input Sales Data");

    jLabel3.setText("January");

    jLabel4.setText("February");

    jLabel5.setText("March");

    jLabel6.setText("April");

    jLabel7.setText("May");

    jLabel8.setText("June");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
              .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(fieldMay, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
              .addComponent(fieldApril)
              .addComponent(fieldMarch)
              .addComponent(fieldFebruary)
              .addComponent(fieldJanuary)
              .addComponent(fieldJune)))
          .addComponent(jLabel2))
        .addGap(19, 19, 19)
        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addComponent(buttonExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonDrawing, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
            .addComponent(buttonClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addComponent(jLabel1)
          .addComponent(selectBar)
          .addComponent(selectLine)
          .addComponent(selectPie))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(36, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel2)
            .addGap(21, 21, 21)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel3)
              .addComponent(fieldJanuary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel4)
              .addComponent(fieldFebruary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel5)
              .addComponent(fieldMarch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel6)
              .addComponent(fieldApril, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel7)
              .addComponent(fieldMay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel8)
              .addComponent(fieldJune, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
            .addGroup(layout.createSequentialGroup()
              .addComponent(buttonDrawing)
              .addGap(18, 18, 18)
              .addComponent(buttonClear)
              .addGap(49, 49, 49)
              .addComponent(jLabel1)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(selectBar)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(selectLine)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(selectPie)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(buttonExit))
            .addComponent(canvas1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(38, 38, 38))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
    System.exit(0);
  }//GEN-LAST:event_buttonExitActionPerformed

  private void buttonDrawingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDrawingActionPerformed
    hapusCanvas();
    tg = canvas1.getHeight();
    lb = canvas1.getWidth();
    String Januari = fieldJanuary.getText();
    String Februari = fieldFebruary.getText();
    String Maret = fieldMarch.getText();
    String April = fieldApril.getText();
    String Mei = fieldMay.getText();
    String Juni = fieldJune.getText();
    if (!Januari.equals("") &&
        !Februari.equals("") &&
        !Maret.equals("") &&
        !April.equals("") &&
        !Mei.equals("") &&
        !Juni.equals("")
    ) {
      // Simpan data
      dataSales[0] = Integer.parseInt(Januari);
      dataSales[1] = Integer.parseInt(Februari);
      dataSales[2] = Integer.parseInt(Maret);
      dataSales[3] = Integer.parseInt(April);
      dataSales[4] = Integer.parseInt(Mei);
      dataSales[5] = Integer.parseInt(Juni);

      // Cari nilai max
      maks = cariMaks(dataSales);

      // Pilih tipe bar
      if (selectBar.isSelected()) {
        gambarBar();
      } else if (selectLine.isSelected()) {
        gambarLine();
      } else if (selectPie.isSelected()) {
        gambarPie();
      }
    } else {
      JOptionPane.showMessageDialog(rootPane, "Data ada yang belum diisi");
    }
  }//GEN-LAST:event_buttonDrawingActionPerformed

  private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
    hapusCanvas();
    fieldJanuary.setText("");
    fieldFebruary.setText("");
    fieldMarch.setText("");
    fieldApril.setText("");
    fieldMay.setText("");
    fieldJune.setText("");
  }//GEN-LAST:event_buttonClearActionPerformed

  private void garisLabel(String title, int xMargin, int yMargin) {
    Graphics g = canvas1.getGraphics();
    // Title
    g.drawString(title, (lb/2)-(title.length()*3), 30);
    
    // Label y
    for(int i = 0; i <= 5; i++) {
      int labelBetween = (int) Math.floor(i * (maks / 5));
      String label = String.valueOf(labelBetween);
      g.drawString(label, 20, tg - yMargin - i * (tg - 2 * yMargin) / 5);
    }
    
    // Label x
    String[] labels = {"Jan", "Feb", "Mar", "Apr", "May", "Jun"};
    for(int i = 0; i < labels.length; i++) {
      g.drawString(labels[i], (xMargin+(xMargin*i)) + 20, (tg - yMargin + (yMargin/2)));
    }
    
    // Horizontal
    g.drawLine(xMargin, (tg - yMargin), (lb - yMargin), (tg - yMargin));
    
    // Vertical
    g.drawLine(xMargin, xMargin, xMargin, (tg - yMargin));
  }
  
  private void gambarBar() {
    int xMargin = 40;
    int yMargin = 40;
    int barWidth = (lb - xMargin) / dataSales.length - 15;
    int barHeight = tg - yMargin;
    
    Graphics g = canvas1.getGraphics();
    garisLabel("Sales Bar Chart", xMargin, yMargin);
    
    // Batang bar
    int scaleBarHeight = (tg - 2 * yMargin) / maks;
    for(int i = 0; i < dataSales.length; i++) {
      int barX = barWidth + (xMargin * i) + 20;
      int barHeight2 = dataSales[i] * scaleBarHeight;
      int barY = barHeight - barHeight2;
      
      g.setColor(Color.red);
      g.fillRect(barX, barY, barWidth, barHeight2);
    }
  }
  
  private void gambarLine() {
    int xMargin = 40;
    int yMargin = 40;
    int x = xMargin;
    int y = tg - yMargin;
    
    Graphics g = canvas1.getGraphics();
    garisLabel("Sales Line Chart", xMargin, yMargin);
    
    // Line
    int scale = (tg - 2 * yMargin) / maks;
    int yValue = 0;
    for(int i = 0; i < dataSales.length; i++) {
      int lineWidth = (lb / dataSales.length) - xMargin/2;
      int y2 = dataSales[i] * scale;
      
      // Line
      g.setColor(Color.red);
      g.drawLine(x, y - yValue, x + lineWidth, y - y2);
      
      // Fill Oval
      g.setColor(Color.blue);
      g.fillOval((x + lineWidth) - 7, (y - y2) - 6, 13, 13);
      
      x += lineWidth;
      yValue = y2;
    }
  }
  
  private void gambarPie() {
    Graphics g = canvas1.getGraphics();
    String[] labels = {"Jan", "Feb", "Mar", "Apr", "May", "Jun"};
    
    double totalValue = 0;
    for (int i = 0; i < dataSales.length; i++) {
      totalValue += dataSales[i];
    }
    
    double[] angles = new double[6];
    for (int i = 0; i < dataSales.length; i++) {
      angles[i] = dataSales[i] / totalValue * 360;
    }
    
    int x = lb / 2 - 100;
    int y = tg / 2 - 100;
    int diameter = 200;
    double startAngle = 0;
    for (int i = 0; i < dataSales.length; i++) {
      double angle = angles[i];
      g.setColor(getColor(i));
      g.fillArc(x, y, diameter, diameter, (int) startAngle, (int) angle);
      drawLabel(g, i, labels[i], getColor(i));
      startAngle += angle;
      
      // Label
      
    }
  }
  
  private void drawLabel(Graphics g, int i, String label, Color color) {
    g.setColor(Color.blue);
    g.drawString(label, 40 + (i * 45), tg - 35);
    
    g.setColor(color);
    g.fillRect(35 + (i * 45), tg-25, 30, 17);
  }
  
  private Color getColor(int index) {
    Color[] colors = {Color.RED, Color.BLUE, Color.MAGENTA, Color.GREEN, Color.CYAN, Color.DARK_GRAY};
    return colors[index % colors.length];
  }
  
  private void hapusCanvas() {
    Graphics g = canvas1.getGraphics();
    g.setColor(canvas1.getBackground());
    g.fillRect(0, 0, canvas1.getWidth()-1, canvas1.getHeight()-1);
  }
  
  private int cariMaks(int[] a) {
    int max = a[0];
    for (int i = 1; i < a.length; i++) {
      if (a[i] > max) {
        max = a[i];
      }
    }
    
    return max;
  }
          
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
      java.util.logging.Logger.getLogger(Tugas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Tugas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Tugas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Tugas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Tugas2().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton buttonClear;
  private javax.swing.JButton buttonDrawing;
  private javax.swing.JButton buttonExit;
  private javax.swing.ButtonGroup buttonGroup1;
  private java.awt.Canvas canvas1;
  private javax.swing.JTextField fieldApril;
  private javax.swing.JTextField fieldFebruary;
  private javax.swing.JTextField fieldJanuary;
  private javax.swing.JTextField fieldJune;
  private javax.swing.JTextField fieldMarch;
  private javax.swing.JTextField fieldMay;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JRadioButton selectBar;
  private javax.swing.JRadioButton selectLine;
  private javax.swing.JRadioButton selectPie;
  // End of variables declaration//GEN-END:variables
}

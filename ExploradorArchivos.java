package com.fileexplorer;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ExploradorArchivos extends javax.swing.JFrame {

    public ExploradorArchivos() {
        initComponents();
        this.setTitle("Explorador de archivos de José Carlos López");
        generarTabla();
        reset();
        setLocationRelativeTo(null);
    }
    
    private DefaultTableModel generarTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Extensión");
        modeloTabla.addColumn("Tamaño (bytes)");
        modeloTabla.addColumn("Fecha creación");
        modeloTabla.addColumn("Archivo / Directorio");
        jTable.setModel(modeloTabla);
        return modeloTabla;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        directorioTF = new javax.swing.JTextField();
        directorioBT = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        extensionTF = new javax.swing.JTextField();
        extensionBT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        limpiarBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setText("Inserte el directorio");

        directorioBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fileexplorer/toolbar_find.png"))); // NOI18N
        directorioBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directorioBTActionPerformed(evt);
            }
        });

        jLabel2.setText("Inserte la extensión");

        extensionBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fileexplorer/toolbar_find.png"))); // NOI18N
        extensionBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extensionBTActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Extensión", "Tamaño (bytes)", "Archivo / Directorio", "Fecha creación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fileexplorer/kde_folder (1).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        limpiarBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fileexplorer/gnome_edit_clear.png"))); // NOI18N
        limpiarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(limpiarBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(extensionTF, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                            .addComponent(directorioTF))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(extensionBT)
                            .addComponent(directorioBT))))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(directorioBT)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(directorioTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(extensionTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(extensionBT))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(limpiarBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private static String extensionArchivos(File fE) {
        String nombreArchivo = fE.getName();
        if (nombreArchivo.lastIndexOf(".") != -1 && nombreArchivo.lastIndexOf(".") != 0) {
            return nombreArchivo.substring(nombreArchivo.lastIndexOf("."));
        }
        return " ";
    }
    
    private void reset() {
        directorioTF.setText((String)null);
        extensionTF.setText((String)null);
        DefaultTableModel tabla = generarTabla();
        for (int i = 0; i < tabla.getRowCount(); i++) {
          tabla.removeRow(i); 
        }
    }
    
    private void fileChooser() throws IOException {
        JFileChooser buscadorArchivos = new JFileChooser();
        buscadorArchivos.setFileSelectionMode(2);
  
        int opcion = buscadorArchivos.showOpenDialog(this);
        if (opcion == 0) {
            String ruta = buscadorArchivos.getSelectedFile().toString();
            directorioTF.setText(ruta);
            mostrarDatos();
        } else if (opcion == 1) {
            fileChooser();
        } 
    }
    
    private void directorioVacio(DefaultTableModel tabla, String campoExtension) {
        if (tabla.getRowCount() == 0 && campoExtension.length() > 0) {
            JOptionPane.showMessageDialog(null, "No hay ningún archivo en la ruta con la extensión seleccionada");
            extensionTF.setText(null);
        }
    }
    
    private long obtenerTamanioDirectorio(File dir) {
        long tamanioDirectorio = 0;
        for (File file : dir.listFiles()) {
            if (file.isFile()) {
                tamanioDirectorio += file.length();
            } else {
                tamanioDirectorio += obtenerTamanioDirectorio(file);
            }
        }
        return tamanioDirectorio;
    }
    
    public String obternerFecha(File dir) throws IOException {
        BasicFileAttributes atributos;
        atributos = Files.readAttributes(dir.toPath(), BasicFileAttributes.class);
        FileTime time = atributos.creationTime();
        String pattern = "dd/MM/yyyy HH:mm";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String fechaFormateada = simpleDateFormat.format(new Date( time.toMillis()));
        return fechaFormateada;
    }
        
    private void insertarValores(File f, DefaultTableModel tabla) throws IOException {
        File[] archivos = f.listFiles();
        String campoExtension =  extensionTF.getText().trim();
        if (archivos.length == 0) {  
            JOptionPane.showMessageDialog(null, "La ruta especificada no contiene ningún archivo");
            reset();
        } else {
            for (int i = 0; i < archivos.length; i++) {
                if (campoExtension.length() == 0 || campoExtension == null) {
                    if (archivos[i].isDirectory()) {
                        tabla.addRow(new Object[] { archivos[i].getName(), extensionArchivos(archivos[i]), obtenerTamanioDirectorio(archivos[i]), obternerFecha(archivos[i]), "Directorio"});
                    } else {
                        tabla.addRow(new Object[] { archivos[i].getName(), extensionArchivos(archivos[i]), archivos[i].length(), obternerFecha(archivos[i]), "Archivo"});                    
                    }
                    extensionTF.setText((String)null);
                } else if (archivos[i].getName().endsWith(this.extensionTF.getText())) {
                    tabla.addRow(new Object[] { archivos[i].getName(), extensionArchivos(archivos[i]), archivos[i].length(), obternerFecha(archivos[i]), "Archivo" });
                }
            }
        }
        directorioVacio(tabla, campoExtension);
    }
    
    private void mostrarDatos() throws IOException {        
        DefaultTableModel tabla = generarTabla();
        File f = new File(directorioTF.getText());
        if (f.exists()) {
          insertarValores(f, tabla);
        } else {
          JOptionPane.showMessageDialog(null, "La ruta especificada no existe");
          reset();
        } 
    }
    
    private void extensionBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extensionBTActionPerformed
        try {
            mostrarDatos();
        } catch (IOException ex) {
            Logger.getLogger(ExploradorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_extensionBTActionPerformed

    private void directorioBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directorioBTActionPerformed
        try {
            mostrarDatos();
        } catch (IOException ex) {
            Logger.getLogger(ExploradorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_directorioBTActionPerformed

    private void limpiarBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBTActionPerformed
        reset();
    }//GEN-LAST:event_limpiarBTActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            fileChooser();
        } catch (IOException ex) {
            Logger.getLogger(ExploradorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ExploradorArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExploradorArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExploradorArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExploradorArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExploradorArchivos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton directorioBT;
    private javax.swing.JTextField directorioTF;
    private javax.swing.JButton extensionBT;
    private javax.swing.JTextField extensionTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JButton limpiarBT;
    // End of variables declaration//GEN-END:variables

}
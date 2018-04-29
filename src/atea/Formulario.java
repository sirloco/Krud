package atea;

import java.awt.Font;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;

public class Formulario extends javax.swing.JFrame {

    Font fuente = new Font("Dialog",Font.BOLD,18);
    Campos Texto = new Campos();
    Recuadrito Dato = new Recuadrito();
    private String[] relaciones = new String[]{"Padre/Madre","Tutor/Representante Legal","Familiar de Acogida","Mismo"};
    PanelUsuario panelSocioUsuario;
    PanelUsuario pa2;

    
    public Formulario() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        //add(panelSocioUsuario);
        PanelTutor();
        System.out.println(jTTelefono.getBounds());
        panelSocioUsuario = new PanelUsuario(this, 238);
        pa2 = new PanelUsuario(this,400);
    }

    private void PanelTutor() {
        Dato.Pongris(jTNombre, Texto.getNombre(), 0);
        Dato.Pongris(jTApellido1, Texto.getApellido1(), 0);
        Dato.Pongris(jTApellido2, Texto.getApellido2(), 0);
        Dato.Pongris(jTCalle, Texto.getCalle(), 0);
        Dato.Pongris(jTLocalidad, Texto.getLocalidad(), 0);
        Dato.Pongris(jTProvincia, Texto.getProvincia(), 0);
        Dato.Pongris(jTIban, Texto.getIban(), 0);
        Dato.Pongris(jTTelefono, Texto.getTelefono(), 0);
        Dato.Pongris(jTMovil, Texto.getMovil(), 0);
        
        
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTNombre = new javax.swing.JTextField();
        jTApellido1 = new javax.swing.JTextField();
        jTApellido2 = new javax.swing.JTextField();
        jTCalle = new javax.swing.JTextField();
        jTLocalidad = new javax.swing.JTextField();
        jTProvincia = new javax.swing.JTextField();
        jTIban = new javax.swing.JTextField();
        jTTelefono = new javax.swing.JTextField();
        jTMovil = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        banco = new javax.swing.JTextField();
        relacion = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listado = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jBNuevoUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATEA");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Soci@ Ordinari@"));

        jTNombre.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jTNombre.setToolTipText("Nombre");
        jTNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTNombreFocusLost(evt);
            }
        });

        jTApellido1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jTApellido1.setToolTipText("Primer Apellido");
        jTApellido1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTApellido1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTApellido1FocusLost(evt);
            }
        });

        jTApellido2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jTApellido2.setToolTipText("Segundo Apellido");
        jTApellido2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTApellido2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTApellido2FocusLost(evt);
            }
        });

        jTCalle.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jTCalle.setToolTipText("Calle");
        jTCalle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCalleFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCalleFocusLost(evt);
            }
        });

        jTLocalidad.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jTLocalidad.setToolTipText("Localidad");
        jTLocalidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTLocalidadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTLocalidadFocusLost(evt);
            }
        });

        jTProvincia.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jTProvincia.setToolTipText("Provincia");
        jTProvincia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTProvinciaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTProvinciaFocusLost(evt);
            }
        });

        jTIban.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jTIban.setToolTipText("Número de Cuenta");
        jTIban.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTIbanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTIbanFocusLost(evt);
            }
        });

        jTTelefono.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jTTelefono.setToolTipText("Teléfono Fijo");
        jTTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTTelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTTelefonoFocusLost(evt);
            }
        });

        jTMovil.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jTMovil.setToolTipText("Teléfono Movil");
        jTMovil.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTMovilFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTMovilFocusLost(evt);
            }
        });

        jCheckBox1.setText("Whatsapp");

        banco.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N

        relacion.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        relacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Padre/Madre", "Tutor/Representante Legal", "Familiar de Acogida", "Mismo" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTProvincia))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTIban, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTMovil, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(banco, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(relacion, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223)
                .addComponent(jCheckBox1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTIban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTMovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(banco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(relacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94))
        );

        jTNombre.setBounds(15,33,208,34);
        jTApellido1.setBounds(228, 33, 255, 34);
        jTApellido2.setBounds(488, 33, 255, 34);

        listado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Primer Apellido", "Segundo Apellido", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listado.setColumnSelectionAllowed(true);
        listado.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(listado);
        listado.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jButton1.setText("Guardar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Editar");

        jButton3.setText("Eliminar");

        jBNuevoUsuario.setText("Añadir Usuario");
        jBNuevoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBNuevoUsuarioMouseClicked(evt);
            }
        });
        jBNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jButton1)
                        .addGap(23, 23, 23)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBNuevoUsuario)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jTNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNombreFocusLost
        Dato.Pongris(jTNombre, Texto.getNombre(), jTNombre.getText().length());
    }//GEN-LAST:event_jTNombreFocusLost

    private void jTApellido1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTApellido1FocusLost
        Dato.Pongris(jTApellido1, Texto.getApellido1(), jTApellido1.getText().length());
    }//GEN-LAST:event_jTApellido1FocusLost

    private void jTApellido2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTApellido2FocusLost
        Dato.Pongris(jTApellido2, Texto.getApellido2(), jTApellido2.getText().length());
    }//GEN-LAST:event_jTApellido2FocusLost

    private void jTCalleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCalleFocusLost
        Dato.Pongris(jTCalle, Texto.getCalle(), jTCalle.getText().length());
    }//GEN-LAST:event_jTCalleFocusLost

    private void jTNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNombreFocusGained
        Dato.Ponnegro(jTNombre, Texto.getNombre());
    }//GEN-LAST:event_jTNombreFocusGained

    private void jTApellido1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTApellido1FocusGained
        Dato.Ponnegro(jTApellido1, Texto.getApellido1());
    }//GEN-LAST:event_jTApellido1FocusGained

    private void jTApellido2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTApellido2FocusGained
        Dato.Ponnegro(jTApellido2, Texto.getApellido2());
    }//GEN-LAST:event_jTApellido2FocusGained

    private void jTCalleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCalleFocusGained
        Dato.Ponnegro(jTCalle, Texto.getCalle());
    }//GEN-LAST:event_jTCalleFocusGained

    private void jTLocalidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTLocalidadFocusLost
        Dato.Pongris(jTLocalidad, Texto.getLocalidad(), jTLocalidad.getText().length());
    }//GEN-LAST:event_jTLocalidadFocusLost

    private void jTLocalidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTLocalidadFocusGained
        Dato.Ponnegro(jTLocalidad, Texto.getLocalidad());
    }//GEN-LAST:event_jTLocalidadFocusGained

    private void jTProvinciaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTProvinciaFocusGained
        Dato.Ponnegro(jTProvincia, Texto.getProvincia());
    }//GEN-LAST:event_jTProvinciaFocusGained

    private void jTProvinciaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTProvinciaFocusLost
        Dato.Pongris(jTProvincia, Texto.getProvincia(), jTProvincia.getText().length());
    }//GEN-LAST:event_jTProvinciaFocusLost

    private void jTIbanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTIbanFocusGained
        Dato.Ponnegro(jTIban, Texto.getIban());
    }//GEN-LAST:event_jTIbanFocusGained

    private void jTIbanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTIbanFocusLost
        Dato.Pongris(jTIban, Texto.getIban(), jTIban.getText().length());
    }//GEN-LAST:event_jTIbanFocusLost

    private void jTTelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTelefonoFocusGained
        Dato.Ponnegro(jTTelefono, Texto.getTelefono());
    }//GEN-LAST:event_jTTelefonoFocusGained

    private void jTTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTelefonoFocusLost
        Dato.Pongris(jTTelefono, Texto.getTelefono(), jTTelefono.getText().length());
    }//GEN-LAST:event_jTTelefonoFocusLost

    private void jTMovilFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTMovilFocusGained
        Dato.Ponnegro(jTMovil, Texto.getMovil());
    }//GEN-LAST:event_jTMovilFocusGained

    private void jTMovilFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTMovilFocusLost
        Dato.Pongris(jTMovil, Texto.getMovil(), jTMovil.getText().length());
    }//GEN-LAST:event_jTMovilFocusLost

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void jBNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoUsuarioActionPerformed
        
    }//GEN-LAST:event_jBNuevoUsuarioActionPerformed

    private void jBNuevoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNuevoUsuarioMouseClicked
        
    }//GEN-LAST:event_jBNuevoUsuarioMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Formulario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField banco;
    private javax.swing.JButton jBNuevoUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTApellido1;
    private javax.swing.JTextField jTApellido2;
    private javax.swing.JTextField jTCalle;
    private javax.swing.JTextField jTIban;
    private javax.swing.JTextField jTLocalidad;
    private javax.swing.JTextField jTMovil;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTProvincia;
    private javax.swing.JTextField jTTelefono;
    private javax.swing.JTable listado;
    private javax.swing.JComboBox<String> relacion;
    // End of variables declaration//GEN-END:variables

}

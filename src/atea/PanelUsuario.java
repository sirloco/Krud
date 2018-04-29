package atea;

import java.awt.Font;
import javax.swing.*;

public class PanelUsuario{
    
    //declaracion de variables globales
    private JFrame formulario;
    private JPanel panelUsuario;
    private JTextField nombre;
    private JTextField apellido1;
    private JTextField apellido2;
    private JTextField dni;
    private JTextField calle;
    private JTextField localidad;
    private JTextField provincia;
    private JTextField cp;
    private JTextField email;
    private JTextField telefono;
    private JTextField movil;
    private JCheckBox whatsapp;
    private int posicion;
    private Font fuente;
    private Recuadrito dato;
    private Campos texto;
    //fin declaracion de variables
   
    //CONSTRUCTOOOOOR!
    public PanelUsuario(JFrame formulario,int posicion){ 
        this.formulario = formulario;
        this.posicion = posicion;
        dato = new Recuadrito();
        texto = new Campos();
        fuente = new Font("Dialog",Font.BOLD,18);
        initComponents();
        panel();

    }
    
    private void panel(){
        //ponemos gris el texto del recuadro seun aparece
        dato.Pongris(nombre, texto.getNombre(),0);
        dato.Pongris(apellido1, texto.getApellido1(),0);
        dato.Pongris(apellido2, texto.getApellido2(),0);
        dato.Pongris(dni, texto.getDni(),0);
        dato.Pongris(calle, texto.getCalle(),0);
        dato.Pongris(localidad, texto.getLocalidad(),0);
        dato.Pongris(provincia, texto.getProvincia(),0);
        dato.Pongris(cp, texto.getCp(),0);
        dato.Pongris(email, texto.getemail(),0);
        dato.Pongris(telefono, texto.getTelefono(),0);
        dato.Pongris(movil, texto.getMovil(),0);
        
        //y porfin hacemos visible el panel
        panelUsuario.setVisible(true);
        
    }
  
    private void initComponents(){
        panelUsuario = new JPanel();
        nombre = new JTextField();
        apellido1 = new JTextField();
        apellido2 = new JTextField();
        dni = new JTextField();
        calle = new JTextField();
        localidad = new JTextField();
        provincia = new JTextField();
        cp = new JTextField();
        email = new JTextField();
        telefono = new JTextField();
        movil = new JTextField();
        whatsapp = new JCheckBox();
        
        panelUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Soci@ Usuari@"));
        panelUsuario.setLayout(null);
        panelUsuario.setBounds(6,posicion,752,160);
        formulario.add(panelUsuario);
        
        nombre.setFont(fuente);
        nombre.setToolTipText(texto.getNombre());
        nombre.setBounds(15,33,208,34);
        
        apellido1.setFont(fuente);
        apellido1.setToolTipText(texto.getApellido1());
        apellido1.setBounds(228,33,255,34);
        
        apellido2.setFont(fuente);
        apellido2.setToolTipText(texto.getApellido2());
        apellido2.setBounds(488,33,255,34);
        
        dni.setFont(fuente);
        dni.setToolTipText(texto.getDni());
        dni.setBounds(15,70,135,34);
        
        calle.setFont(fuente);
        calle.setToolTipText(texto.getCalle());
        calle.setBounds(155,70,329,34);
        
        localidad.setFont(fuente);
        localidad.setToolTipText(texto.getLocalidad());
        localidad.setBounds(489,70,170,34);
        
        cp.setFont(fuente);
        cp.setToolTipText(texto.getCp());
        cp.setBounds(664,70,79,34);
        
        provincia.setFont(fuente);
        provincia.setToolTipText(texto.getProvincia());
        provincia.setBounds(15,107,105,34);
        
        email.setFont(fuente);
        email.setToolTipText(texto.getemail());
        email.setBounds(125,107,250,34);
        
        telefono.setFont(fuente);
        telefono.setToolTipText(texto.getTelefono());
        telefono.setBounds(380,107,135,34);
        
        movil.setFont(fuente);
        movil.setToolTipText(texto.getMovil());
        movil.setBounds(520, 107, 135, 34);
        
        whatsapp.setBounds(660,107,83,34);
        whatsapp.setText("Whatsapp");
        
        //añadimos los componentes al panel asi no flotan en el limbo
        panelUsuario.add(nombre);
        panelUsuario.add(apellido1);
        panelUsuario.add(apellido2);
        panelUsuario.add(dni);
        panelUsuario.add(calle);
        panelUsuario.add(localidad);
        panelUsuario.add(cp);
        panelUsuario.add(provincia);
        panelUsuario.add(email);
        panelUsuario.add(telefono);
        panelUsuario.add(movil);
        panelUsuario.add(whatsapp);
        /////////////////////////////////////////////////////////////
        nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreFocusGained(evt);
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreFocusLost(evt);
            }            
        });
        
        apellido1.addFocusListener(new java.awt.event.FocusAdapter() {
            
            @Override
            public void focusGained(java.awt.event.FocusEvent evt){
                apellido1FocusGained(evt);
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent evt){
                apellido1FocusLost(evt);
            }
        });
        
        apellido2.addFocusListener(new java.awt.event.FocusAdapter() {
            
            @Override
            public void focusGained(java.awt.event.FocusEvent evt){
                apellido2FocusGained(evt);
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent evt){
                apellido2FocusLost(evt);
            }
        });
        
        dni.addFocusListener(new java.awt.event.FocusAdapter() {
            
            @Override
            public void focusGained(java.awt.event.FocusEvent evt){
                dniFocusGained(evt);
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent evt){
                dniFocusLost(evt);
            }
        });
        
        calle.addFocusListener(new java.awt.event.FocusAdapter() {
            
            @Override
            public void focusGained(java.awt.event.FocusEvent evt){
                calleFocusGained(evt);
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent evt){
                calleFocusLost(evt);
            }
        });
        
        localidad.addFocusListener(new java.awt.event.FocusAdapter() {
            
            @Override
            public void focusGained(java.awt.event.FocusEvent evt){
                localidadFocusGained(evt);
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent evt){
                localidadFocusLost(evt);
            }
        });
        
        cp.addFocusListener(new java.awt.event.FocusAdapter() {
            
            @Override
            public void focusGained(java.awt.event.FocusEvent evt){
                cpFocusGained(evt);
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent evt){
                cpFocusLost(evt);
            }
        });
        
        provincia.addFocusListener(new java.awt.event.FocusAdapter() {
            
            @Override
            public void focusGained(java.awt.event.FocusEvent evt){
                provinciaFocusGained(evt);
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent evt){
                provinciaFocusLost(evt);
            }
        });
        
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            
            @Override
            public void focusGained(java.awt.event.FocusEvent evt){
                emailFocusGained(evt);
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent evt){
                emailFocusLost(evt);
            }
        });
        
        telefono.addFocusListener(new java.awt.event.FocusAdapter() {
            
            @Override
            public void focusGained(java.awt.event.FocusEvent evt){
                telefonoFocusGained(evt);
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent evt){
                telefonoFocusLost(evt);
            }
        });
        
        movil.addFocusListener(new java.awt.event.FocusAdapter() {
            
            @Override
            public void focusGained(java.awt.event.FocusEvent evt){
                movilFocusGained(evt);
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent evt){
                movilFocusLost(evt);
            }
        });
    }
    
    public int getPosicion(){
        return posicion;
    }
    
    public void setPosicion(int posicion){
        this.posicion = posicion;
    }
    
    private void nombreFocusGained(java.awt.event.FocusEvent evt){
        dato.Ponnegro(nombre, texto.getNombre());
    }
    
    private void nombreFocusLost(java.awt.event.FocusEvent evt){
        dato.Pongris(nombre, texto.getNombre(), nombre.getText().length());
    }
    
    private void apellido1FocusGained(java.awt.event.FocusEvent evt){
        dato.Ponnegro(apellido1, texto.getApellido1());
    }
    
    private void apellido1FocusLost(java.awt.event.FocusEvent evt){
        dato.Pongris(apellido1, texto.getApellido1(), apellido1.getText().length());
    }
    
    private void apellido2FocusGained(java.awt.event.FocusEvent evt){
        dato.Ponnegro(apellido2, texto.getApellido2());
    }
    
    private void apellido2FocusLost(java.awt.event.FocusEvent evt){
        dato.Pongris(apellido2, texto.getApellido2(), apellido2.getText().length());
    }
    
    private void dniFocusGained(java.awt.event.FocusEvent evt){
        dato.Ponnegro(dni, texto.getDni());
    }
    
    private void dniFocusLost(java.awt.event.FocusEvent evt){
        dato.Pongris(dni, texto.getDni(), dni.getText().length());
    }
    
    private void calleFocusGained(java.awt.event.FocusEvent evt){
        dato.Ponnegro(calle, texto.getCalle());
    }
    
    private void calleFocusLost(java.awt.event.FocusEvent evt){
        dato.Pongris(calle, texto.getCalle(), calle.getText().length());
    }
    
    private void localidadFocusGained(java.awt.event.FocusEvent evt){
        dato.Ponnegro(localidad, texto.getLocalidad());
    }
    
    private void localidadFocusLost(java.awt.event.FocusEvent evt){
        dato.Pongris(localidad, texto.getLocalidad(), localidad.getText().length());
    }
    
    private void cpFocusGained(java.awt.event.FocusEvent evt){
        dato.Ponnegro(cp, texto.getCp());
    }
    
    private void cpFocusLost(java.awt.event.FocusEvent evt){
        dato.Pongris(cp, texto.getCp(), cp.getText().length());
    }
    
    private void provinciaFocusGained(java.awt.event.FocusEvent evt){
        dato.Ponnegro(provincia, texto.getProvincia());
    }
    
    private void provinciaFocusLost(java.awt.event.FocusEvent evt){
        dato.Pongris(provincia, texto.getProvincia(), provincia.getText().length());
    }
    
    private void emailFocusGained(java.awt.event.FocusEvent evt){
        dato.Ponnegro(email, texto.getemail());
    }
    
    private void emailFocusLost(java.awt.event.FocusEvent evt){
        dato.Pongris(email, texto.getemail(), email.getText().length());
    }
    
    private void telefonoFocusGained(java.awt.event.FocusEvent evt){
        dato.Ponnegro(telefono, texto.getTelefono());
    }
    
    private void telefonoFocusLost(java.awt.event.FocusEvent evt){
        dato.Pongris(telefono, texto.getTelefono(), telefono.getText().length());
    }
    
    private void movilFocusGained(java.awt.event.FocusEvent evt){
        dato.Ponnegro(movil, texto.getMovil());
    }
    
    private void movilFocusLost(java.awt.event.FocusEvent evt){
        dato.Pongris(movil, texto.getMovil(), movil.getText().length());
    }
}


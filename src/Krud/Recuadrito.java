package Krud;

import javax.swing.JTextField;

public class Recuadrito {
    String grisaceo = "#999999";
    String negro = "#000000";

    public void Pongris(JTextField letras, String texto, int tamaño) {
        if (tamaño == 0)//En caso de que no exista texto sale el de por defecto
        {
            letras.setText(texto);
            letras.setForeground(java.awt.Color.decode(grisaceo));
        }
        
    }

    public void Ponnegro(JTextField letras, String texto) {

        if (letras.getText().equals(texto)) {// En caso de que exista texto dejalo
            letras.setText("");
            letras.setForeground(java.awt.Color.decode(negro));
        }
    }
}

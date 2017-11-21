package herencia;

import javax.swing.JOptionPane;

public class Herencia {

    public static void main(String[] args) {

        Empleado e1 = new Empleado(ePuesto.Gerente , 20000, " juan ", 23);
        
        JOptionPane.showMessageDialog(null, e1.MostrarDatos());
                
    }
    
}

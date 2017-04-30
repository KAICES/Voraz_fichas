package voraz_fichas;


import java.text.DecimalFormat;
import javax.swing.*;
import java.util.Arrays;

/**
 *
 * @author KAICES
 */
public class Voraz_fichas {

    static int I = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de filas del tablero?" ));
    static int J = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de columnas del tablero?" )); 
    static int F = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de fichas?" )); 
    
    
    public static void main(String[] args) {
     
        
        double tablero[][] ;
        Voraz_fichas t = new Voraz_fichas();
        tablero = new double[F][3] ; 
        t.ingresar(tablero);
        t.escribir(tablero);

    }   
    public void ingresar (double tablero[][]) {
            
            int i, j ;
            double bendim = 0 , x = 0 , y = 0, dim, beneficio ;;
            String num;
                for(i=0;i<tablero.length;i++){
                    
                       x = Integer.parseInt(JOptionPane.showInputDialog("Dimension x de la pieza"+i+":"));
                       y = Integer.parseInt(JOptionPane.showInputDialog("Dimension x de la pieza"+i+":"));
                       dim = x * y;
                       tablero[i][0]= dim ; 
                       beneficio = Integer.parseInt(JOptionPane.showInputDialog("Beneficio de la pieza"+i+":"));
                       tablero[i][1]= beneficio ;
                       bendim = beneficio/dim;   
                       tablero[i][2]= bendim ;
                }
                                                   
                            
                       
                       
                      
    }  
    public void escribir(double mat[ ][ ]){

        DecimalFormat decimales = new DecimalFormat("0.00");
        int i, j;
        String Salida = "Elementos del tablero de fichas\n";
        for(i=0;i<mat.length;i++) {
            for(j=0;j<mat[i].length;j++)
                Salida+=mat[i][j]+" ";
                Salida+="\n";
        }

           JOptionPane.showMessageDialog(null,Salida,"MATRIZ DE FICHAS",JOptionPane.INFORMATION_MESSAGE);
        }
}    

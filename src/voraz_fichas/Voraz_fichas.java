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
        t.ordenar(tablero);
    }   
    public void ingresar (double tablero[][]) {
            
            int i, j ;
            double bendim = 0 , x = 0 , y = 0, dim, beneficio ;;
            String num;
                for(i=0;i<tablero.length;i++){
                        
                       j=i+1; 
                       x = Integer.parseInt(JOptionPane.showInputDialog("Dimension x de la pieza"+j+":"));
                       y = Integer.parseInt(JOptionPane.showInputDialog("Dimension y de la pieza"+j+":"));
                       dim = x * y;
                       tablero[i][0]= dim ; 
                       beneficio = Integer.parseInt(JOptionPane.showInputDialog("Beneficio de la pieza"+j+":"));
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
public void ordenar( double mat[ ][ ]) { // ordena por metodo shor de menor a mayor.
    
        int col = 2 ;
        // Verifico que la columna seleccionada se encuentre dentro del rango permitido
        // La variable col me indica la columna a ordenar
        if (col < 0 || col > 2) {
            return;
        }

        double aux ;

        // Recorro la columna selecciona
        for (int i = 0; i < mat.length ; i++) {
            for (int j = i + 1; j < mat.length; j++) {
                // Verifico si el elemento en la posición [i][col] es mayor que el de la posición [j][col]
                if (mat[i][col] > mat[j][col]) {
                    // Recorro las filas seleccionadas (i, j) e intercambio los elementos
                    // Declaro la variable k para controlar la posición (columnas) en la fila
                    for (int k = 0; k < 3; k++) {
                        // Intercambio los elementos de las filas seleccionadas columna por columna
                        aux = mat[i][k];
                        mat[i][k] = mat[j][k];
                        mat[j][k] = aux;
                    }
                }
            }
        }
        escribir(mat);
    }  

    public void voraz ( double matvoraz [][], double mat [][] ) { 
        
        double dimTablero = I * J ;
        double auxVoraz, dimFicha ; 
        int col = 2 ; 
        for(int i=mat.length-1; i>=0; i--){
            for (int j = mat[i].length-1; i < mat.length ; j--){
             if  (  mat[i][col] >= mat [j][col] && dimTablero < dimFicha ){
                 
                        for (int k = 0; k < 3; k++) {
                        // Intercambio los elementos de las filas seleccionadas columna por columna
                        auxVoraz = mat[i][k];
                        mat[i][k] = mat[j][k];
                        mat[j][k] = auxVoraz;
                    }
             }
                                  
             }
         
        }
        
       
    }
    
    
    
}    

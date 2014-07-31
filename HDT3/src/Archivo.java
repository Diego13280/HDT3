
import java.io.File; 
import java.io.PrintWriter; 
import java.util.Random; 
import javax.swing.JOptionPane;
import java.io.*;

/** 
* 
* @author Diego Juarez		13280
* @author Daniel Mejia		13271
* @author Esteban Barrera	13413
*/ 

public class Archivo 
{ 
    private File archivo; 

    public Archivo() 
    { 
        archivo = new File("miarchivo.txt");
        try 
        { 
            PrintWriter grabador = new PrintWriter(archivo);//aqui creamos 
            //el objeto que permite grabar en el archivo 

            Random rand = new Random();

            int contador = 0;
            while (contador < 2000)
            {

                int x = rand.nextInt(1000);
                grabador.println(x); 
                contador ++;
            }

            grabador.close();//es muy importante cerrar el archivo ya que 
            //sino lo haces no se guardan los cambios 
        }
        catch(Exception e) 
        { 
            JOptionPane.showMessageDialog(null, e.getMessage()); 
        } 
        
        
        
        try{
            // Abrimos el archivo
            FileInputStream fstream = new FileInputStream("miarchivo.txt");
            // Creamos el objeto de entrada
            DataInputStream entrada = new DataInputStream(fstream);
            // Creamos el Buffer de Lectura
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String strLinea;
            // Leer el archivo linea por linea
            while ((strLinea = buffer.readLine()) != null)   {
                // Imprimimos la línea por pantalla
                System.out.println (strLinea);
            }
            // Cerramos el archivo
            entrada.close();
        }catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
        
        
        
        
        
        
    }
}
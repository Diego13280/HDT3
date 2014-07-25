import java.io.File; 
import java.io.PrintWriter; 
import javax.swing.JOptionPane; 

/** 
* 
* @author Diego Juarez		13280
* @author Daniel Mejia		13271
* @author Esteban Barrera	13413
*/ 
public class Archivo { 
private File archivo; 

public Archivo() 
{ 
archivo = new File("miarchivo.txt");
try 
{ 
PrintWriter grabador = new PrintWriter(archivo);//aqui creamos 
//el objeto que permite grabar en el archivo 

grabador.println("Hola");//aqui simplemente mandamos la cadena 
//a grabar podemos usar varias veces la funcion para grabar 
//varias lineas en el archivo 
grabador.println("¿Como estas?"); 

grabador.close();//es muy importante cerrar el archivo ya que 
//sino lo haces no se guardan los cambios 
} 
catch(Exception e) 
{ 
JOptionPane.showMessageDialog(null, e.getMessage()); 
} 

} }
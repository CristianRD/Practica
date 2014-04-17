package Musica;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Cd {
    
private Canción [] canciones;
    private int contador;
    
    //Crea un Cd Virgen
    Cd(){
    canciones = new Canción [15];
    //inicializa Arreglo
        for (int i=0;i<canciones.length;i++){
            
            canciones[i]= new Canción();
            contador=0;
        }
        }
    
    
    
    public int numeroCanciones(){
    return contador;
       
    }
    
    public Canción dameCancion (int posicion){
    
    return canciones[posicion];
    }
    
    private void grabarCancion(int posicion, Canción cancion){
    
        if (posicion >=0 && posicion <=14){
        canciones[posicion]=cancion;
             
        } else {
            
            System.out.println("El CD esta lleno, no es posible agregar mas canciones");
        
        
        }
    }
    
    public void agregar (Canción cancion){
        
        grabarCancion(contador, cancion);
        contador=contador+1;
    
    }
    
    public void eliminar(int posicion){
    
        canciones[posicion].ponAutor("");
        canciones[posicion].ponTitulo("");
        
        if (posicion < contador){
        
            for (int i=posicion;i<canciones.length;i++){
                
                
                if (i<canciones.length-1){
                    
                    canciones[i] = canciones [i+1];
                }
                
                contador=contador-1;
                
            }
            
        }
        
    }
    
      public Canción[] obtenerCanciones(){
      
          return canciones;
      }
 
        
}

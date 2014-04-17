package Musica;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Canción {
    
 public String titulo;
    public String autor;

    /**
     * Constructor en blanco
     */
    
    Canción(){
    titulo="";
    autor="";
    }
    
     /**
     * Constructor Con parametros  
     */
    Canción (String titulo, String autor){
        this.titulo=titulo;
        this.autor=autor;
    }
    public String dameTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void ponTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String dameAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void ponAutor(String autor) {
        this.autor = autor;
    }
    
}

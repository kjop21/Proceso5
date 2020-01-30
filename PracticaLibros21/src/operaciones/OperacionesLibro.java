/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import entidades.Libro;
import java.util.ArrayList;

/**
 *
 * @author Karla Abad
 */
public class OperacionesLibro implements IOperacionesLibro{
    ArrayList<Libro> lista ;

    public OperacionesLibro(){
        this.lista = new ArrayList();
    }
   
    public ArrayList<Libro> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Libro> lista) {
        this.lista = lista;
    }
    
      @Override
    public void agregar(Libro libro) {
        this.lista.add(libro);
    }
    
    
    @Override
    public void guardarEnArchivo(Libro libro) {
        
    }

    @Override
    public ArrayList<Libro> leerDeArchivo(String criterioBusqueda) {
        return this.lista;
    }
    
}

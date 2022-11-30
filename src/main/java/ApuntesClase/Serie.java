/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ApuntesClase;

import java.util.Objects;

/**
 *titulo,Genero("Accion","Comedia","Scifi","Drama),sipnosis,nºtemporadas,
 * Productor
 * @author pablo
 */
    //declaracion clase serie
public class Serie {
        //Atributos de instancia (no static)
        private String titulo;
        private String genero;
        private String sipnosis;
        private String productor;
        private int numeroDeTemporadas;
        int numeroLikes;
        //en los getterSetter y marcamos encapsulado pone en private los atributos
    public Serie(String titulo, String genero, String sipnosis, String productor, int numeroDeTemporadas,int numeroLikes) {
        this.titulo = titulo;
        this.genero = genero;
        this.sipnosis = sipnosis;
        this.productor = productor;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.numeroLikes = numeroLikes;
    }

    public Serie() {
        // Los atributos quedan inicializados por defecto 
        // Objetos apuntan a null
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSipnosis() {
        return sipnosis;
    }

    public void setSipnosis(String sipnosis) {
        this.sipnosis = sipnosis;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public int getNumeroLikes() {
        return numeroLikes;
    }

    public void setNumeroLikes(int numeroLikes) {
        this.numeroLikes = numeroLikes;
    }
    
    
        // \n para salto linea

    @Override
    public String toString() {
        return "Serie{" + "titulo=" + titulo + ", genero=" + genero + ", productor=" + productor + ", numeroDeTemporadas=" + numeroDeTemporadas + ", numeroLikes=" + numeroLikes + '}';
    }
        
    public  void darLike(){
        //Se suma likes
        this.numeroLikes++;
        
    }   
    
    //El hascode sirve para que genere un numero unico para la serie
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.titulo);
        hash = 47 * hash + Objects.hashCode(this.genero);
        hash = 47 * hash + Objects.hashCode(this.sipnosis);
        hash = 47 * hash + Objects.hashCode(this.productor);
        hash = 47 * hash + this.numeroDeTemporadas;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        //El objeto con el que me estan comparando es el mismo??
        //No apunta al mismo objeto, si no lo que CONTIENEN
        //Siempre que se pase un objeto con metodo, hay ALIAS
        if (this == obj) {
            return true;
        }
        
        if (obj == null) {
            return false;
        }
        //this.getclas=s1(serie que queremos comparar), es igual o diferente
        // a un obj, puede ser persona u otro cosa ( p1)
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        //Haciendo variable tempoeral obj, para que sea serie al pasar los filtros
        // con la variable other
        final Serie other = (Serie) obj;
        
        if (this.numeroDeTemporadas != other.numeroDeTemporadas) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.genero, other.genero)) {
            return false;
        }
        if (!Objects.equals(this.sipnosis, other.sipnosis)) {
            return false;
        }
        return Objects.equals(this.productor, other.productor);
    }
    
    
     
        
}

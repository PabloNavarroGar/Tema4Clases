/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ApuntesClase;

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
        
}

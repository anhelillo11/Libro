
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.0
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;
    private String numeroReferencia;
    
    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numPag)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numPag;
        numeroReferencia = "";
    }
    
    public String getAutor() {
        return autor;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public int getNumeroPaginas() {
        return numeroPaginas; 
    }
    
    public String getNumeroReferencia() {
        return numeroReferencia;
    }
    
    public void setNumeroReferencia(String numReferencia) {
        if(numReferencia.length() >3) {
            numeroReferencia = numReferencia;
        }
        else {
            System.out.println("Error, el numero de referencia debe tener al menos tres digitos");
        }
    }
    
    public void imprimeAutor() {
        System.out.println(autor);
    }
    
    public void imprimeTitulo() {
        System.out.println(titulo);
    }
    
    public void imprimeDetalles() {
        if(numeroReferencia == "") {
            System.out.println("El autor es: " + autor);
            System.out.println("El titulo es: " + titulo);
            System.out.println("El numero de paginas es: " + numeroPaginas);
            System.out.println("El numero de referencia es: ZZZ");
        }
        else{
            System.out.println("El autor es: " + autor);
            System.out.println("El titulo es: " + titulo);
            System.out.println("El numero de paginas es: " + numeroPaginas);
            System.out.println("El numero de referencia es: " + numeroReferencia);
        }
    }
    
    
    public String getDetalles() {
        return "El autor es: " + autor + "  El titulo es: " + titulo + "  El numero de paginas es: "
        + numeroPaginas + "  El numero de referencia es: " + numeroReferencia;
    }
}


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
    private int vecesPrestado;
    private boolean esLibroDeTexto;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numPag)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numPag;
        numeroReferencia = "";
        vecesPrestado = 0;
        esLibroDeTexto = true;
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

    public int getVecesPrestado() {
        return vecesPrestado;
    }

    public void setNumeroReferencia(String numReferencia) {
        if(numReferencia.length() >3) {
            numeroReferencia = numReferencia;
        }
        else {
            System.out.println("Error, el numero de referencia debe tener al menos tres digitos");
        }
    }

    public void prestado(){
        vecesPrestado ++;
    }

    
    public void imprimeAutor() {
        System.out.println(autor);
    }

    public void imprimeTitulo() {
        System.out.println(titulo);
    }

    
    public void imprimeDetalles() {
        String esLibro = "";
        String referen = "";
        if(esLibroDeTexto == true) {
            esLibro = "Si";
        }
        else {
            esLibro = "No";
        }
        if (numeroReferencia == ""){
            referen = "ZZZ";
        }
        else {
            referen = numeroReferencia;
        }

        System.out.println("El autor es: " + autor);
        System.out.println("El titulo es: " + titulo);
        System.out.println("El numero de paginas es: " + numeroPaginas);
        System.out.println("El numero de referencia es: " + referen);
        System.out.println("El libro ha sido prestado: " + vecesPrestado + "veces");
        System.out.println("¿Es un libro de texto?: " + esLibro);
    }

    public String getDetalles() {
        String esLibro = "";
        String referen = "";
        if(esLibroDeTexto == true) {
            esLibro = "Si";
        }
        else {
            esLibro = "No";
        }
        if (numeroReferencia == ""){
            referen = "ZZZ";
        }
        else {
           referen = numeroReferencia;
        }
        return "El autor es: " + autor + "  El titulo es: " + titulo + "  El numero de paginas es: "
        + numeroPaginas + "  El numero de referencia es: " + referen +
        "  El libro ha sido prestado: " + vecesPrestado + "veces " +
        "¿Es un libro de texto?: " + esLibro;
    }
}

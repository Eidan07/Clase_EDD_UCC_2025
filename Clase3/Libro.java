public class Libro {
    private  String titulo;
    private String autor;
    private int precio;

    public Libro (String titulo, String autor, int precio){
    this.autor = titulo;
    this.autor = autor;
    this.precio = precio;
    }

    public String getTitulo(){
        return titulo;
    }

     public String getAutor(){
        return autor;
    }

     public int getPrecio(){
        return precio;
    }

    public String toString (){
        return "Libro { Titulo: " + titulo + " Autor: " + autor + " Precio: " + precio + "}";
    }

    public void recorrerArreglo (Libro[] l){
        for(int i = 0; i < l.length; i++){
            System.out.println(l[i]);
       }
    }

    public void calcularPrecioTotal (Libro[] l){
        int sumarPrecio = 0;
    }
}

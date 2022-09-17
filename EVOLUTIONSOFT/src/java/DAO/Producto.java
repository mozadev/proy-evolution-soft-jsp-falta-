
package DAO;

public class Producto {
int idproducto;
String descripcion;
int stock;
int id_categoria;
String descripcionCategoria;
int id_marca;
String descripcionMarca;

public Producto(){
}

    public Producto(int idproducto, String descripcion, int stock, int id_categoria, String descripcionCategoria, int id_marca, String descripcionMarca) {
        this.idproducto = idproducto;
        this.descripcion = descripcion;
        this.stock = stock;
        this.id_categoria = id_categoria;
        this.descripcionCategoria = descripcionCategoria;
        this.id_marca = id_marca;
        this.descripcionMarca = descripcionMarca;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getDescripcionCategoria() {
        return descripcionCategoria;
    }

    public void setDescripcionCategoria(String descripcionCategoria) {
        this.descripcionCategoria = descripcionCategoria;
    }

    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    public String getDescripcionMarca() {
        return descripcionMarca;
    }

    public void setDescripcionMarca(String descripcionMarca) {
        this.descripcionMarca = descripcionMarca;
    }


    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
}

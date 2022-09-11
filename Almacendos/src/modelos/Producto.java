
package modelos;


public class Producto {
    private String idProd;
    private String nombreProducto;
    private double precioProd;
    private int existenciaProd;

    public Producto() {
    }
   

    public Producto(String idProd, String nombreProducto, double precioProd, int existenciaProd) {
        this.idProd = idProd;
        this.nombreProducto = nombreProducto;
        this.precioProd = precioProd;
        this.existenciaProd = existenciaProd;
    }

    public String getIdProd() {
        return idProd;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecioProd() {
        return precioProd;
    }

    public int getExistenciaProd() {
        return existenciaProd;
    }

    public void setIdProd(String idProd) {
        this.idProd = idProd;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setPrecioProd(double precioProd) {
        this.precioProd = precioProd;
    }

    public void setExistenciaProd(int existenciaProd) {
        this.existenciaProd = existenciaProd;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProd=" + idProd + ", nombreProducto=" + nombreProducto + ", precioProd=" + precioProd + ", existenciaProd=" + existenciaProd + '}';
    }

    public void setnombreProducto(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
   
    
    

}

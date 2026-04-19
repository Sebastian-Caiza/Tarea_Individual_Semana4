public class Inventario {

    private String codigo, nombre, categoria;
    private double precio;
    private int stock, stockMin;

    public Inventario(String codigo, String nombre, String categoria, double precio, int stock, int stockMin){

        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        setPrecio(precio);
        setStock(stock);
        setStockMin(stockMin);

    }

    public void setPrecio(double precio) {
        if (precio > 0){
        this.precio = precio;}
        else{
            System.out.println("✖️ Error! Precio Invalido");
        }
    }

    public void setStock(int stock) {
        if (stock >= 0){
            this.stock = stock;
        }
        else{
            System.out.println("✖️ Stock Invalido");
        }
    }

    public void setStockMin(int stockMin) {
        if (stockMin >= 0){
        this.stockMin = stockMin;}
        else{
            System.out.println("✖️ Stock Insuficiente");
        }
    }

    public String estado(){
        if (stock < stockMin){
            return "Requiere reposicion";
        } else if (stock == 0) {
            return "Agotado";
        }
        else{
            return  "Stock suficiente";
        }
    }

    public double totalInventario(){
        return precio * stock;
    }

    public void imprimir(){

        System.out.println("-------------");
        System.out.println("Codigo:" + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Categoria: " + categoria);
        System.out.println("Precio Unitario: " + precio);
        System.out.println("Stock: " + stock);
        System.out.println("Stock minimo: " + stockMin);
        System.out.println("Total inventario: " + String.format("%.2f", totalInventario()) + "$");
        System.out.println("Estado: " + estado());

    }
}

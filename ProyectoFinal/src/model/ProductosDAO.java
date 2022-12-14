package model;
import Controller.ControllerInventario;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 * 
 * @author Roberto
 */
public class ProductosDAO extends Conexion {
    private String intruccionSQL;
    private PreparedStatement ms;   
    /**
     * @autor josue :)
     * Funcion para jala todos los datos de la tabla Inventario
     * @return Arraylist con los objetos Producto
     */    
    public ArrayList<Producto> listaProductos(){    
        ArrayList<Producto> listaProductos = null;
        ResultSet resultado;      
        try{
            this.conectar();
            intruccionSQL = "SELECT * FROM `inventario`";
            ms = this.conectar.prepareStatement(intruccionSQL);
            resultado = ms.executeQuery();
            listaProductos = new ArrayList();
            while(resultado.next()){
                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                float precio = resultado.getFloat("precio");
                int cantidad = resultado.getInt("cantidad");
                String marca = resultado.getString("marca");
                String fabricacion = resultado.getString("fabricacion");
                String lote = resultado.getString("lote");
                String descripcion = resultado.getString("descripcion");
                Producto producto = new Producto(id,nombre,precio,cantidad,marca,fabricacion,lote,descripcion);
                listaProductos.add(producto);         
            }   
        }
        catch(Exception a){
            System.out.println(a.getMessage());
    
        }
        finally{
            this.cerrarConex();
        }
        return listaProductos;
    }
    /**
     * @author josue :)
     * Metodo para realizar una consulta a la base de datos
     * @param id id del objeto a realizar una consulta
     * @return Arraylist con el objeto que devolvio la consulta
     */
     public ArrayList<Producto> consultar(int id){
         ArrayList<Producto> lista = null;
         ResultSet resultado;
         try{
            this.conectar();
            lista = new ArrayList();
            intruccionSQL = "SELECT * FROM `inventario` WHERE id = ?;";
            ms = this.conectar.prepareStatement(intruccionSQL);
            ms.setInt(1,id);
            resultado = ms.executeQuery();
            if (resultado.next()) {
                id = resultado.getInt("id");
                float precio = resultado.getFloat("precio");
                String nombre = resultado.getString("nombre");
                int cantidad = resultado.getInt("cantidad");
                String marca = resultado.getString("marca");
                String fabricacion = resultado.getString("fabricacion");
                String lote = resultado.getString("lote");
                String descripcion = resultado.getString("descripcion");
                Producto producto = new Producto(id,nombre,precio,cantidad,marca,fabricacion,lote,descripcion);
                lista.add(producto);  
            }
            else{
                JOptionPane.showMessageDialog(null, "Registro no encontrado!!"); 
                ControllerInventario.limpiar();
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            this.cerrarConex();
        }
         return lista;
     }
     /**
      * @author :)
      * Guarda objetos Producto en la base de datos
      * @param producto Producto a guardar en la base de datos
      */
     public void guardar(Producto producto){
         try{
            this.conectar();
            intruccionSQL = "INSERT INTO `inventario` (id,nombre,precio,cantidad,marca,fabricacion,lote,descripcion) VALUES(?,?,?,?,?,?,?,?)";
            ms = this.conectar.prepareStatement(intruccionSQL);
            ms.setInt(1,producto.getID());
            ms.setString(2, producto.getNombre());
            ms.setFloat(3, producto.getPrecio());
            ms.setInt(4, producto.getCantidad());
            ms.setString(5, producto.getMarca());
            ms.setString(6,producto.getFrabricacion());
            ms.setString(7,producto.getLote());
            ms.setString(8, producto.getDescricion());
            int n = ms.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null, "Producto registrado");
                ControllerInventario.limpiar();
            }  
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
         this.cerrarConex();
        }
     }
     /**
      * @author josue :)
      * Metodo para actualizar un producto
      * @param producto Producto actualizado
      */
     public void actualizar(Producto producto){          
        try{
            this.conectar();
            intruccionSQL = "UPDATE `inventario` set `nombre` = '"+producto.getNombre()+"', `precio` = '"+producto.getPrecio()+
                    "', `cantidad` = '"+producto.getCantidad()+"', `marca` = '"+producto.getMarca()+"', `fabricacion` = '"+producto.getFrabricacion()+
                    "', `lote` = '"+producto.getLote()+"', `descripcion` = '"+producto.getDescricion()+"' WHERE id= ?";
            ms = this.conectar.prepareStatement(intruccionSQL);
            ms.setInt(1,producto.getID());
            int n = ms.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null, "Producto Actualizado");
                ControllerInventario.limpiar();
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
         this.cerrarConex();
        }
     }
     /**
      * @author josue :)
      * Metodo para eliminar un producto
      * @param id id del producto a eliminar
      */
     public void eliminar(int id){
         try {
            this.conectar();
            intruccionSQL ="DELETE FROM inventario WHERE id=?";
            ms = this.conectar.prepareStatement(intruccionSQL);
            ms.setInt(1, id);
            int n = ms.executeUpdate();
            if (n>0) {
                System.out.println("GUI pops up");
                //JOptionPane.showMessageDialog(null, "FACTURA ELIMINADA"); 
               //ControllerProducto.limpiar();
              }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            this.cerrarConex();
        }
     }
}
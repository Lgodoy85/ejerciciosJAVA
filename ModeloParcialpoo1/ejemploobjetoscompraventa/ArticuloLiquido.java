/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploobjetoscompraventa;

/**
 *
 * @author alumno
 */
public class ArticuloLiquido extends articulo{
      private int _litros;
    public ArticuloLiquido(int codigo,String nombre, float precioCosto,int stock,int litros )
    {
        super(codigo,nombre,precioCosto,stock );
        this._litros= litros;
        
    }
}

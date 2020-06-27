/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiciosWEB;

import Model.Cliente;
import Model.Usuario;
import ServiciosDB.ServicioDBCliente;
import ServiciosDB.ServicioDBUsuario;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author sebas
 */
@WebService(serviceName = "ServicioWeb")
public class ServicioWeb {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
        @WebMethod(operationName = "Login")
    public Usuario loginUsuario(
            @WebParam(name = "id") String id_usuario,
            @WebParam(name = "id-password") String usuario_password) {
        boolean flag = true;
        Usuario u = null;
        if (id_usuario != null && usuario_password != null) {
            u = su.obtenerUsuariobyUser(id_usuario);
            flag = this.valida(u, id_usuario, usuario_password);

        } else {
            flag = false;
        }
        return (flag)?u:null;
    }
    
    public Cliente retornaCliente(Usuario u){
        Cliente c = null;
        c = sc.obtenerClientebyUser(u.getIdUsuario());
        return c;
    }
    
    public boolean esadmin( int x){
        return x == 0;
    }

    private boolean valida(Usuario u, String id, String clave) {
        return (u.getIdUsuario().equals(id) && u.getClave().equals(clave));
    }
    

    ServicioDBUsuario su = new ServicioDBUsuario();
    ServicioDBCliente sc = new ServicioDBCliente();
}

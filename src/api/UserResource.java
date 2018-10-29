package api;

import com.google.gson.Gson;
import users.UserDataModel;
import users.UserModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class UserResource extends HttpServlet {

    // Se genera de forma aleatoria, establece version de la clase
    private static final long serialVersionUID = 8057734212103116679L;

    /**
     * Funcion que se ejecuta en las peticiones de tipo "GET"
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Se establece cabecera de tipo de respuesta
        response.setContentType("application/json; charset=utf-8");
        // Obtener instancia del response
        PrintWriter out = response.getWriter();

        // Crear arreglo de objetos
        ArrayList obj = new ArrayList<>();

        // Generar datos aleatorios para la tabla
        for (int i = 0; i <= 10; i++) {
            // Llamada a la clase de UserModel
            obj.add(new UserModel("Sara" + i, "Von" + i, i));
        }

        // Llamada a la clase de UserDataModel
        UserDataModel userDataModel = new UserDataModel();
        // Anexar arreglo de clase UserModel a UserDataModel
        userDataModel.setData(obj);

        // Instanciar la clase de JSON (libreria externa de google).
        Gson gson = new Gson();
        // Convertir el arreglo a formato json
        String json = gson.toJson(userDataModel);

        // Enviar la respuesta al navegador
        out.write(json);
        // vaciar la instancia
        out.close();

    }

    /**
     * Funcion que se ejecuta para peticiones de tipo "POST"
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Se establece cabecera de tipo de respuesta
        response.setContentType("application/json; charset=utf-8");
        // Obtener instancia del response
        PrintWriter out = response.getWriter();

        // Obtener instancia de lectura
        BufferedReader reader = request.getReader();

        // Instanciar la clase de JSON (libreria externa de google).
        Gson gson = new Gson();

        // Convierte los parametros recibidos de tipo post a tipo compatible con la clase UserModel
        UserModel userModel = gson.fromJson(reader, UserModel.class);
        // Crear objeto de respuesta
        HashMap<String, Object> map = new HashMap<>();
        // Anexar a la variable "data" los valores de UserModel
        map.put("data", userModel);
        // Convertir el objeto a formato json
        String json = gson.toJson(map);

        // Enviar la respuesta al navegador
        out.write(json);
        // vaciar la instancia
        out.close();

    }

}

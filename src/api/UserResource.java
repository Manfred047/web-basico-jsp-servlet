package api;

import com.google.gson.Gson;
import users.UserDataModel;
import users.UserModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class UserResource extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("application/json; charset=utf-8");
        PrintWriter out = response.getWriter();

        ArrayList obj = new ArrayList<>();

        for (int i=0; i<=10; i++) {
            obj.add(new UserModel("Sara" + i, "Von" + i, i));
        }

        UserDataModel userDataModel = new UserDataModel();
        userDataModel.setData(obj);

        Gson gson = new Gson();
        String json = gson.toJson(userDataModel);

        out.print(json);
        out.flush();

    }

}

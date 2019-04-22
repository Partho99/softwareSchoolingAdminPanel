/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.admin.module;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.json.simple.JSONObject;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONArray;

/**
 *
 * @author partho
 */
public class DashBoardController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String message;

        JSONObject object = new JSONObject();
        // object.clone();

        object.put("name", "student");

        JSONObject obj = new JSONObject();
        JSONArray array = new JSONArray();

        obj.put("name", "partho");
        obj.put("age", 27);
        obj.put("profession", "softwraeEngineer");

        array.add(obj);

        object.put("course", array);

        message = object.toJSONString();

        JsonArray jsonArray = new JsonArray();
        JsonObject jsonObject = new JsonObject();

        jsonObject.addProperty("firstname", "partho");
        jsonObject.addProperty("lastname", "das");

        object.put("Bio", jsonObject);

        // message = jsonObject.toString();
        

        System.out.println(message);
        request.setAttribute("message", object.put("Bio", jsonObject));

        request.getRequestDispatcher("test.jsp").forward(request, response);
        request.getRequestDispatcher(message).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}

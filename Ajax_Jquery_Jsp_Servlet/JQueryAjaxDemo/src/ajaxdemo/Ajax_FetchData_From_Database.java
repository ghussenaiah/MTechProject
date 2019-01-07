package ajaxdemo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;






import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;


public class Ajax_FetchData_From_Database extends HttpServlet {
 private static final long serialVersionUID = 1L;

  
 
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
  ArrayList<Countries> country=new ArrayList<Countries>();
  country=FetchData.getAllCountries();
  Gson gson = new Gson();
  JsonElement element = gson.toJsonTree(country, new TypeToken<List<Countries>>() {}.getType());

  JsonArray jsonArray = element.getAsJsonArray();
  response.setContentType("application/json");
  response.getWriter().print(jsonArray);
  
 }

 
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  
 }

}

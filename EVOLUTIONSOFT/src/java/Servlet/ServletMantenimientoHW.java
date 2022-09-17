package Servlet;

import DAO.ProductoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletMantenimientoHW extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String opcion = "";
        opcion = request.getParameter("opcion2");
        switch (opcion)
        {
            case "LISTAR":
                ProductoDAO objProdDAO = new ProductoDAO();
                ArrayList listardatos = objProdDAO.ListarDatos();
                request.setAttribute("listardatos", listardatos);
                request.getRequestDispatcher("/listado.jsp").forward(request, response);

                break;
            default:
                throw new AssertionError();
        }
      
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}

package Servlet;

import DAO.ProductoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConsultaHW extends HttpServlet {

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
            case "CONSULTAR":
                ProductoDAO objProductoDAO = new ProductoDAO();
                ArrayList listarcategoria = objProductoDAO.ListarCategoria();
                request.setAttribute("listarcategoria", listarcategoria);
                ArrayList listarmarca = objProductoDAO.ListarMarca();
                request.setAttribute("listarmarca", listarmarca);
                request.getRequestDispatcher("/consultarHW.jsp").forward(request, response);

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

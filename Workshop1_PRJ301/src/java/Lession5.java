/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.Console;

/**
 *
 * @author LONG
 */
public class Lession5 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
            String tkt = "";
            String kttu = "";
            String vttu = "";
            String ketqua = "";
            try {
                String input = request.getParameter("vb");
                if (input.isEmpty()) {
                    tkt = "Please enter text!! Can't empty.";
                    return;
                }

                int pos = Integer.parseInt(request.getParameter("vt"));
                int start = Integer.parseInt(request.getParameter("vtd"));
                int end = Integer.parseInt(request.getParameter("vtc"));
                String text = request.getParameter("ch");

                tkt = "" + input.length();

                kttu = "" + input.charAt(pos);

                if (input.indexOf(text) < 0) {
                    vttu = "Khong ton tai";
                } else {
                   vttu = " " + input.indexOf(text);
                }
                
                if (start > end) {
                    int temp = end;
                    end = start;
                    start = temp;
                }
                ketqua = "" + input.substring(start, end + 1);
                

            } catch (Exception e) {
                tkt = "<br>Invalid input! Please enter number.";
                kttu = "<br>Invalid input! Please enter number.";
                vttu = "<br>Invalid input! Please enter number.";
                ketqua = "Qua gioi han";
            }

         request.setAttribute("tongkt", tkt);
         request.setAttribute("kytutu", kttu);
         request.setAttribute("vitritu", vttu);
         request.setAttribute("ketqua", ketqua);
        request.getRequestDispatcher("Ex5.jsp").forward(request, response);
    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

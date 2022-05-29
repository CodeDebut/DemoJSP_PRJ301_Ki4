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

/**
 *
 * @author LONG
 */
public class Lession3 extends HttpServlet {

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
        
            String tonglt = "";
            String gt = "";
            String sl = "";
            String sc = "";
            String snto = "";
            String result = "";
            try {
                int n = Integer.parseInt(request.getParameter("n"));
                String name = request.getParameter("chon");
                if (n > 1 && n < 100) {
                    if (request.getParameter("Chay") != null) {
                        //Tong n lien tiep tu 0 - n
                        if (name.equals("tongnlt")) {
                            int r = 0;
                            for (int i = 0; i <= n; i++) {
                                r += i;
                            }
                            tonglt = "" + r;
                        }
                        //tinh n giai thua
                        if (name.equals("n!")) {
                            int giaithua = 1;
                            for (int i = 2; i <= n; i++) {
                                giaithua *= i;
                            }
                            gt = "" + giaithua;
                        }
                        //in day so le tu 1 - n
                        if (name.equals("sole")) {
                            
                            for (int i = 0; i <= n; i++) {
                                if (i % 2 == 1) {
                                    sl = i + " ";
                                }
                            }
                        }
                        //in day so chan 0 - n
                        if (name.equals("sochan")) {
                          
                            for (int i = 0; i <= n; i++) {
                                if (i % 2 == 0) {
                                    sc = i + " ";
                                }
                            }
                        }
                        //Ktra n co phai la SNT hay khong
                        //số nguyên tố là số lớn hơn 1 và chỉ chia hết cho 1 và chính nó.
                        if (name.equals("snt")) {
                            if (n == 2 || n == 3) {
                                snto = "" + n + " la So Nguyen To";
                            }
                            for (int i = 2; i <= Math.sqrt(n); i++) {
                                if (n % i == 1) {
                                    snto = "" + n + " la So Nguyen To";
                                    return;
                                } else {
                                    snto = "" + n + " khong phai la So Nguyen To";
                                    return;
                                }
                            }
                        }
                    }

                } else {
                    result = "in range 1-100";
                }
            } catch (Exception e) {
                result = ("Invalid input");
            }
            
            request.setAttribute("result", result);
            request.getRequestDispatcher("Ex3.jsp").forward(request, response);
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

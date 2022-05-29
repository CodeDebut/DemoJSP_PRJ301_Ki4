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
import java.util.ArrayList;

/**
 *
 * @author LONG
 */
public class Lession4 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String result = "";
        String input = request.getParameter("input");
        String[] s = input.split("\\s+");
        int check = Integer.parseInt(request.getParameter("option"));

        //check val
        int val = 0;
        for (int i = 0; i < s.length; i++) {
            if (isNumeric(s[i]) == false) {
                val++;
            }
        }
        if (val != 0) {
            result = "Invalid array! Array only can contain number.";
        } else {
            switch (check) {
                case 1:
                    for (int i = 0; i < s.length; i++) {
                        result += s[i] + " ";
                    }
                    break;
                case 2:
                    int rs2 = 0;
                    for (int i = 0; i < s.length; i++) {
                        if (Integer.parseInt(s[i]) % 2 != 0) {
                            rs2 += Integer.parseInt(s[i]);
                        }
                    }
                    result = "" + rs2;
                    break;
                case 3:
                    int rs3 = 1;
                    for (int i = 0; i < s.length; i++) {
                        if (Integer.parseInt(s[i]) % 2 == 0) {
                            rs3 *= Integer.parseInt(s[i]);
                        }
                    }
                    result = "" + rs3;
                    break;
                case 4:
                    ArrayList<Integer> s1 = new ArrayList<Integer>();
                    for (int i = 0; i < s.length; i++) {
                        s1.add(Integer.parseInt(s[i].trim()));
                    }
                    int tg = s1.get(0);
                    for (int i = 0; i < s1.size() - 1; i++) {
                        for (int j = i + 1; j < s1.size(); j++) {
                            if (s1.get(i) > s1.get(j)) {
                                tg = s1.get(j);
                                s1.set(j, s1.get(i));
                                s1.set(i, tg);
                            }
                        }
                    }
                    result = "" + s1;
                    break;
                default:
                    throw new AssertionError();

            }

        }
        request.setAttribute("result", result);
        request.getRequestDispatcher("Ex4.jsp").forward(request, response);
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

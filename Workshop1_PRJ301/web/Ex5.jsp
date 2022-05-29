<%-- 
    Document   : Ex5
    Created on : May 29, 2022, 9:33:23 PM
    Author     : LONG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ex5</title>
    </head>
    <body> 
        <%
          String result="";
          String result1="";
          String result2="";
          String result3="";
          if(request.getAttribute("tongkt")!= null){
             result = (String)request.getAttribute("tongkt");
            }
          if(request.getAttribute("kytutu")!= null){
             result1 = (String)request.getAttribute("kytutu");
            }
          if(request.getAttribute("vitritu")!= null){
             result2 = (String)request.getAttribute("vitritu");
            }
          if(request.getAttribute("ketqua")!= null){
             result3 = (String)request.getAttribute("ketqua");
            }
            
        %>
        <form action="bai5" method='get'>
            <h1>DOI TUONG STRING</h1>
            <span style="margin-bottom: 10px;">Nhap doan van</span>
            <br>
            <textarea name ="vb" cols="30" rows="5"></textarea>
            Tong so ky tu: <input type='text' name='tongkt' value="<%=result%>" readonly>
            <div style="margin-bottom: 20px">
                <span style="margin-right: 27px"> Nhap vi tri</span>
                <input type="number" name="vt">
                Ky tu tuong ung: <input type='text' name='kytutu' value="<%=result1%>" readonly>
                <br>
            </div>
            <div style="margin-bottom: 20px">
                <span style="margin-right: 27px"> Nhap chuoi</span>
                <input type="text" name="ch">
                Vi tri tuong ung: <input type='text' name='vitritu' value="<%=result2%>" readonly>
                <br>
            </div>
            <div>
                <span>Nhap vi tri can tach tu:</span>
                <input type='text' name='vtd'>
                <span>Den</span>
                <input style="margin-bottom: 20px" type='text' name='vtc'>
                Ket qua: <input type='text' name='ketqua' value="<%=result3%>" readonly>
            </div>
            <input type='submit' name='Tim' value='Nhap lai'>
            <input type='reset' name='xoa' value='Thoat'>
        </form>   
    </body>
</html>

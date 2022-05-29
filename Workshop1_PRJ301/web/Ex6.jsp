<%-- 
    Document   : Ex6
    Created on : May 29, 2022, 10:26:59 PM
    Author     : LONG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ex6</title>
    </head>
    <body>
         <%
          String result="";
          if(request.getAttribute("result")!= null)
            result = (String)request.getAttribute("result");
            
        %>
        <form action="bai6" method='get'>
            <h1 style="color: blue; text-align: center">GIAI PHUONG TRINH
            <br> BAC NHAT</h1>
            <div style="margin-left: 40px">Nhap a: <input type='text' name='a'></div>
            <div style="margin-top: 20px; margin-left: 40px">Nhap b: <input type='text' name='b'></div>
            <div style="margin-top: 20px; margin-left:150px"><input type='submit' name='Tim' value='Tìm'></div>
            <div style="margin-left: 40px">Ket luan nghiem: <br><input style="padding-right: 70px;width:200px; height:50px;" type='text' cols="40" rows="5"  name='result' value="<%=result%>" readonly></div>
        </form>  
    </body>
</html>

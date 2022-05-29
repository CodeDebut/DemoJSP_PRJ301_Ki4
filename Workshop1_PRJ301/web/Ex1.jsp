<%-- 
    Document   : Ex1
    Created on : May 29, 2022, 8:40:34 PM
    Author     : LONG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ex1</title>
    </head>
    <body>
        <%
          String result="";
          if(request.getAttribute("result")!= null)
            result = (String)request.getAttribute("result");
            
        %>
         <form action="cal" method='get'>
            <h1 style="color: blue;">THUC HIEN PHEP TOAN</h1>
            Enter a:<input  style="margin-bottom: 15px; border-style:inset;background: #ccffff; border-bottom-color: white; border-right-color: white; border-left-color: #cccccc ;border-top-color:#cccccc " type='text' name='a'>
            <br>Enter b:<input  style="margin-bottom:30px; border-style:inset;background: #ccffff; border-bottom-color: white; border-right-color: white; border-left-color: #cccccc ;border-top-color:#cccccc " type='text' name='b'>
            <br><input  style="margin-left: 40px " type ='submit' name='Cong' value='a+b'>
            <input type='submit' name='Hieu' value='a-b'>
            <input type='submit' name='Nhan' value='a*b'>
            <input type='submit' name='Chia' value='a/b'>
            <br><br>Result: <input type='text' name='result' value="<%=result%>" readonly>
        </form>
    </body>
</html>

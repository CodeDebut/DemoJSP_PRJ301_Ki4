<%-- 
    Document   : Ex4
    Created on : May 29, 2022, 9:22:05 PM
    Author     : LONG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ex4</title>
    </head>
    <body>
        <%
          String result="";
          if(request.getAttribute("result")!= null)
            result = (String)request.getAttribute("result");
            
        %>
        <form action="bai4">
            <h1 style="color: blue">CÁC THAO TÁC VỚI MẢNG</h1>
            Nhập mảng: <input required type='text' name='input' style='margin-left: 20px' ><br>
            <br> <input type='radio' name='option' value='1'> <i>In mảng</i>&emsp;
            <input type='radio' name='option' value='2'> <i>Tổng lẻ</i>&emsp;
            <input type='radio' name='option' value='3'><i>Tích chẵn</i>&emsp;
            <input type='radio' name='option' value='4'><i>Sắp xếp</i>
            <br><br>Ket qua: <input type='text' name='result' value="<%=result%>" readonly>
            <br><br><br> <input type='submit' name='OK' value='Thực hiện' style='margin-left: 70px'>
            <button type="reset">Thoát</button> 
        </form>
    </body>
</html>

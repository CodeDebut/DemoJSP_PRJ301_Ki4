<%-- 
    Document   : Ex3
    Created on : May 29, 2022, 9:03:13 PM
    Author     : LONG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ex3</title>
    </head>
    <body>
        <%
          String result="";
          if(request.getAttribute("result")!= null)
            result = (String)request.getAttribute("result");
            
        %>
        <form action="bai3" method='get'>
            <h1 style="color: blue; text-align: center">THUC HIEN PHEP TOAN</h1>
            <p style="color:blue; font-weight: bold; font-size: 20px">Nhap n: <input style="margin-left: 80px" type='text' name='n'> (1 < n < 100)</p>
            <p style="color:blue; font-weight: bold; font-size: 20px">Chon phep toan: <select style="margin-left: 6px" id="chon" name="chon"></p>
            <option name='tong' value='tongnlt'>Tong n so lien tiep</option>
            <option name='giaithua' value='n!'>Tinh n!</option>
            <option name='le' value='sole'>In day le</option>
            <option name='chan' value='sochan'>In day so chan</option>
            <option name='SNT' value="snt">Kiem tra so nguyen to</option>
        </select>
        <br><input style="margin-left: 155px; margin-top: 40px" type='submit' name='Chay' value='OK'>
        <br>Ket qua: <input style="margin-left: 70px" type='text' name='result' value="<%=result%>" readonly>
    </form>
</body>
</html>

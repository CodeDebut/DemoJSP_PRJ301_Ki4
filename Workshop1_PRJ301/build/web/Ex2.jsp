<%-- 
    Document   : Ex2
    Created on : May 29, 2022, 8:49:58 PM
    Author     : LONG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ex2</title>
    </head>
    <body>
        <%
          String result="";
          if(request.getAttribute("result")!= null)
            result = (String)request.getAttribute("result");
            
        %>
        <form action="bai2" method='get'>
            <h1 style="color: blue; text-align: center">Tim Max Tim Min</h1>
            Enter a: <input style="margin-bottom: 15px; border-style:inset;background: #ccffff; border-bottom-color: white; border-right-color: white; border-left-color: #cccccc ;border-top-color:#cccccc "  type='text' name='a'>
            <br>Enter b: <input style="margin-bottom: 15px; border-style:inset;background: #ccffff; border-bottom-color: white; border-right-color: white; border-left-color: #cccccc ;border-top-color:#cccccc "  type='text' name='b'>
            <br>Enter c: <input style="margin-bottom: 15px; border-style:inset;background: #ccffff; border-bottom-color: white; border-right-color: white; border-left-color: #cccccc ;border-top-color:#cccccc "  type='text' name='c'>
            <br>Result: <input style="margin-bottom: 15px; border-style:inset;background: #ccffff; border-bottom-color: white; border-right-color: white; border-left-color: #cccccc ;border-top-color:#cccccc; padding-left: 5px" type='text' name='result' value="<%=result%>" readonly>
            <br><input style="margin: 20px 0 20px 0;" checked type='radio' name='MAX' value='Tim so lon nhat'/><i style="font-weight:bold">Tim so lon nhat</i>
            <input type='radio' name='MAX' value='Tim so nho nhat'/><i style="font-weight:bold">Tim so nho nhat</i>
            <div class="select"><br><input type='submit' name='Tim' value='Tìm'>
            <input type='reset' name='Xoa' value='Xóa'></div>
        </form>
    </body>
</html>

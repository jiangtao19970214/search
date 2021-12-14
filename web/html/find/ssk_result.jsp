<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>山羊の前端小窝</title>
    <%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
    <%String path = request.getContextPath();%>
    <style>
        * {
            margin: 0;
            padding: 0;
            background-size: cover;
        }

        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background: #140f1d;
        }

        .shell {
            position: absolute;
            top:200px;
        }

        .input {
            padding: 10px;
            width: 80px;
            height: 80px;
            background: none;
            border: 4px solid rgb(255, 210, 45);
            border-radius: 20px;
            box-sizing: border-box;
            font: 400 26px Comic Sans Ms;
            color: rgba(255,210,45,.2);
            outline: none;
            transition: .5s;
        }
        #checkbox {
            display: none;
        }
        [for=checkbox]{
            display: block;
            width: 70px;
            height: 70px;
            border-radius: 20px;
            position: absolute;
            right: 0;
            margin: 4px;
            transition: .4s;
            background-image: url('<%=path%>/html/find/find.png');
        }
        #checkbox:checked~label{
            border-radius: 10px;
            background-image: url('<%=path%>/html/find/worry.png');
            border: 4px solid rgb(255, 210, 45);
            margin: 0 -5px;
        }
        #checkbox:checked~input{
            width: 400px;
            border-radius: 10px;
            margin-right: 80px;
            background-color: #272133;
            color: rgb(255, 210, 45);
        }
        .fonts{
            position: absolute;
            top: 0;
            left: 10px;
            color: rgb(255, 210, 45);
            letter-spacing: 5px;
            font: 400 26px Comic Sans Ms;
            display: flex;
        }
        .fonts span{
            transition: .3s;
            opacity: 0;
        }
        #checkbox:checked ~.fonts span{
            transition: calc(var(--i)*0.1s) .3s;
            transform: translateY(-40px);
            opacity: 1;
        }
        .move1{
            position: absolute;
            top: 200px;
        }
        .a{
            position: relative;
            width: 800px;
            height: 450px;
            border: #fff 10px solid;
            background-color: rgb(120,140,200);
            top: 120px;
            border-radius: 20px;
            overflow: hidden;
        }
        #hide{
            display: block;
        }
    </style>
    <script>
        function move(){
            document.getElementById("shell").className="move1";
        }
    </script>
</head>

<body>
    <div class="shell" id="shell">
        <form action="/find" method="post">
        <input type="checkbox" id="checkbox" onclick="move()">
        <label for="checkbox"></label>
        <input type="text" class="input" id="input" name="movie">

        <div class="fonts">
            <span style="--i:1">S</span>
            <span style="--i:2">e</span>
            <span style="--i:3">a</span>
            <span style="--i:4">r</span>
            <span style="--i:5">c</span>
            <span style="--i:6">h</span>
            <span style="--i:7">.</span>
            <span style="--i:8">.</span>
            <span style="--i:9">.</span>
            <span style="--i:10">.</span>
            <span style="--i:11">.</span>
            <span style="--i:12">.</span>
        </div>
        </form>
    </div>
    <div class="a" id="hide">
<%--    <h1 id="h1"><%=request.getAttribute()%></h1>--%>
        <h1 id="h2">电影名称：<%=request.getAttribute("movieName")%></h1>
        <h1 id="h3">电影作者：<%=request.getAttribute("movieAuthor")%></h1><br>
    <h1 id="h4">电影链接：<a href="<%=request.getAttribute("movieLink")%>"><%=request.getAttribute("movieLink")%></a></h1><br>
        <h1 id="h5">电影简介：<%=request.getAttribute("movieIntroduction")%></h1>
        <h1 id="h6">电影图片：<%=request.getAttribute("moviePicture")%></h1>
    </div>
</body>

</html>
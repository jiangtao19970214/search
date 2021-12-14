<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <%String path = request.getContextPath();%>
    <%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
    <link rel="stylesheet" href="<%=path%>/html/back_paltform/font_cqbiizu5og9/iconfont.css">
    <title>不愧是我~</title>

    <style>
        * {
            padding: 0;
            margin: 0;
            text-decoration: none;
        }

        body {
            background-color: rgb(209, 213, 219);
            display: flex;
            justify-content: space-evenly;
            height: 100vh;
            align-items: center;
        }

        .shell {
            width: 100px;
            height: 80%;
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: column;
            background-color: rgb(17, 24, 39);
            border-radius: 10px;
            transition: .3s;
            overflow: hidden;
            position: absolute;
            left: 5%;
        }

        .box {
            display: block;
            height: 15%;
            width: 85%;
            margin: 9px;
            border-radius: 5px;
            position: relative;
            transition: .3s;
            color: rgb(160, 160, 175);
        }
        .box i {
            font-size: 60px;
            position: absolute;
            margin: 7px 0 0 13px;
        }

        .box:nth-child(1)::before,
        .box:nth-child(5)::before{
            content: '';
            display: block;
            width: 100%;
            height: 2px;
            background-color: rgb(55, 65, 81);
            position: absolute;
            bottom: -10px;
        }

        .box span{
            position: relative;
            top: 22px;
            left: 80px;
            font: 500 20px '';
            opacity: 0;
            transition: .1s;
        }
        .shell:hover{
            width: 270px;
        }
        .box:hover{
            background-color: rgb(55, 65, 81);
        }
        .shell:hover span{
            opacity: 1;
        }
        .box:hover{
            color: #fff;
        }

        .shell:nth-child(2) {
            background-color: rgb(243, 244, 246);
        }
        .shell:nth-child(2) .box:hover{
            background-color: rgb(209, 213, 219);
            color: rgb(241, 159, 159);
        }
        .shell:nth-child(2) .box{
            color: #000;
        }

        .shell:nth-child(3) {
            background-color: rgb(49,46,129);
        }
        .shell:nth-child(3) .box:hover{
            background-color: rgb(67, 56, 202);
        }
        .shell:nth-child(3) .box{
            color: rgb(140, 120, 240);
        }
        .content {
            width: 100vw;
            height: 100vh;
            /* background-color: aqua; */
            background: url(<%=path%>/html/back_paltform/bg2.jpg) no-repeat;
            background-size: cover;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .login-content {
            position: absolute;
            right: 10%;
            width: 60%;
            height: 70%;
            background-color: rgba(207, 205, 218, 0.16);
            border-radius: 30px;
            padding: 30px;
        }
        .banner-box {
            display: inline-block;
            width: 500px;
            height: 100%;
            /* background-color: rgb(0, 92, 92); */
            background: url(<%=path%>/html/back_paltform/bg1.jpg) no-repeat;
            background-size: cover;
            border-radius: 20px 0 0 20px;
        }
        #a1{
            display: none;
            position: relative;
            width: 700px;
            height: 700px;
            top: 6%;
            left: 10%;
        }

    /*    按钮样式*/
        .button {
            display: inline-block;
            border-radius: 4px;
            background-color: #f4511e;
            border: none;
            color: #FFFFFF;
            text-align: center;
            font-size: 28px;
            padding: 20px;
            transition: all 0.5s;
            cursor: pointer;
            margin: 5px;
            vertical-align:middle;
        }

        .button span {
            cursor: pointer;
            display: inline-block;
            position: relative;
            transition: 0.5s;
        }

        .button span:after {
            content: '»';
            position: absolute;
            opacity: 0;
            top: 0;
            right: -20px;
            transition: 0.5s;
        }

        .button:hover span {
            padding-right: 25px;
        }

        .button:hover span:after {
            opacity: 1;
            right: 0;
        }
</style>
    <script>
        function move(){
            document.getElementById("hide1").style.backgroundColor="rgb(160, 160, 175)";
        }
        function move1(){
            document.getElementById("hide1").style.backgroundColor="rgb(17, 24, 39)";
        }
        var click = "1";
        function fun() {
            if (click == "1") {
                show();
                click = "2";
            }
            else if (click == "2") {
                hidden();
                click = "1";
            }
        }
        function show() {
            document.getElementById("a1").style.display = "block";
        }
        function hidden() {
            document.getElementById("a1").style.display = "none";
        }
        var s = 2;
        function change(){
            var s1="url(<%=path%>/html/back_paltform/bg"+s+".jpg) "
            document.getElementById("content1").style.background = s1;
            s = (s+1)%7;
        }
    </script>
</head>
<body>
<div class="content" id="content1">
    <div class="shell" id="hide1">
<!--        直接返回最初界面
        @@@@@已实现-->
        <a href="<%=path%>/html/index.html" class="box" ><i class="iconfont icon-cangku"></i><span></span></a>
<!--        黑白显示框事件
            @@@@@已实现-->
        <a href="#" class="box"onclick="move()"><i class="iconfont icon-zhuti_tiaosepan"></i><span>style_white</span></a>
        <a href="#" class="box" onclick="move1()"><i class="iconfont icon-qianbao"></i><span>style_black</span></a>

<!--        显示数据列表功能-->
        <a href="<%=path%>/html/back_paltform/index_choose.jsp" class="box" ><i class="iconfont icon-liebiao"></i><span>list</span></a>

<!--        更换背景图片功能
        @@@已实现-->
        <a href="#" class="box" onclick="change()"><i class="iconfont icon-tupian"></i><span>picture</span></a>


        <!--        点击显示二维码事件
        @@@@@@已实现-->
        <a href="#" class="box" onclick="fun()"> <i class="iconfont icon-erweima"></i><span >QR code</span></a>
<!--跳转到个人博客-->
        <a href="https://www.zibuyu.online" class="box"><i class="iconfont icon-dunpaibaoxianrenzheng"></i><span>Personal blog</span></a>
<!--返回初始界面
@@@@@已实现-->
        <a href="<%=path%>/html/login.html" class="box"><i class="iconfont icon-dengchu"></i><span>cancellation</span></a>
    </div>
    <div class="login-content">
        <img src="<%=path%>/html/back_paltform/img.jpg" id="a1">
        <form action="/findusermessage" method="post">
            <button class="button" name="button" value="user"><span>UserMessage</span></button>
            <button class="button" name="button" value="master"><span>MasterMessage</span></button>
            <button class="button" name="button" value="movie"><span>MovieMessage</span></button>
        </form>

        <form action="Updata_UserData.jsp">
            <button class="button" name="button" value="updatauser"><span>UpDataUser</span></button>
        </form>

        <form action="Updata_MasterData.jsp">
            <button class="button" name="button" value="updatamaster"><span>UpDataMaster</span></button>
        </form>

        <form action="Updata_MovieData.jsp">
            <button class="button" name="button" value="updatamovie"><span>UpDataMovie</span></button>
        </form>
    </div>
</div>


<!--    <div class="shell">-->
<!--        <a href="#" class="box"><i class="iconfont icon-liebiao"></i><span>list</span></a>-->
<!--        <a href="#" class="box"><i class="iconfont icon-cangku"></i><span> Warehouse</span></a>-->
<!--        <a href="#" class="box"><i class="iconfont icon-zhuti_tiaosepan"></i><span>theme</span></a>-->
<!--        <a href="#" class="box"><i class="iconfont icon-qianbao"></i><span>wallet</span></a>-->
<!--        <a href="#" class="box"><i class="iconfont icon-tupian"></i><span>picture</span></a>-->
<!--        <a href="#" class="box"><i class="iconfont icon-erweima"></i><span>QR code</span></a>-->
<!--        <a href="#" class="box"><i class="iconfont icon-dunpaibaoxianrenzheng"></i><span>authentication</span></a>-->
<!--        <a href="#" class="box"><i class="iconfont icon-dengchu"></i><span>cancellation</span></a>-->
<!--    </div>-->
</body>

</html>
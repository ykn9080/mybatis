<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false"%>
<c:set var="loginId" value="${pageContext.request.getSession(false)==null ? '' : pageContext.request.session.getAttribute('id')}"/>
<c:set var="loginOutLink" value="${loginId=='' ? '/login/login' : '/login/logout'}"/>
<c:set var="loginOut" value="${loginId=='' ? 'Login' : 'ID='+=loginId}"/>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>fastcampus</title>
    <link rel="stylesheet" href="<c:url value='/css/menu.css'/>">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css"/>
    <style>

        a { text-decoration: none;  }

        ul {
            list-style-type: none;
            height: 48px;
            width: 100%;
            background-color: #30426E;
            display: flex;
        }

        ul > li {
            color: lightgray;
            height : 100%;
            width:90px;
            display:flex;
            align-items: center;
        }

        ul > li > a {
            color: lightgray;
            margin:auto;
            padding: 10px;
            font-size:20px;
            align-items: center;
        }

        ul > li > a:hover {
            color :white;
            border-bottom: 3px solid rgb(209, 209, 209);
        }

        #logo {
            color:white;
            font-size: 18px;
            padding-left:40px;
            margin-right:auto;
            display: flex;
        }
    </style>
</head>
<body>
<div id="menu">
    <ul>
        <li id="logo">fastcampus</li>
        <li><a href="<c:url value='/'/>">Home</a></li>
        <li><a href="<c:url value='/board/list'/>">Board</a></li>
        <li><a href="<c:url value='${loginOutLink}'/>">${loginOut}</a></li>
        <li><a href="<c:url value='/register/add'/>">Sign in</a></li>
        <li><a href=""><i class="fa fa-search"></i></a></li>
    </ul>
</div>
<div style="text-align:center">
    <h1>This is HOME</h1>
    <h1>This is HOME</h1>
    <h1>This is HOME</h1>
</div>
</body>
</html>
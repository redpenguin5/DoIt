<!DOCTYPE HTML>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
    <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta http-equiv="Pragma" content="no-cache">
        <meta http-equiv="Cache-Control" content="no-cache">
        <meta http-equiv="Expires" content="Sat, 01 Dec 2001 00:00:00 GMT">

    <title>Task Manager | Home</title>

    <link href="static/css/bootstrap.min.css" rel="stylesheet">
         <link href="static/css/style.css" rel="stylesheet">

         <!--[if lt IE 9]>
         		<script src="static/js/html5shiv.min.js"></script>
         		<script src="static/js/respond.min.js"></script>
         	<![endif]-->

</head>

<body>
<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/" class="navbar-brand">DoIt!</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="all-tasks">All Tasks</a></li>
				</ul>
			</div>
		</div>
	</div>
    <div class="container invisible-at-first" id="homeDiv">
        <div class="jumbotron text-center">
        <h1>Welcome to DoIt task manager! JUST DO IT!</h1>
        </div>
     </div>
         <div class="container text-center" id="tasksDiv">
             <h3>My Tasks</h3>
             <hr>
             <div class="table-responsive">
                <table class="table table-striped table-bordered text-left">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Description</th>
                            <th>Status</th>
                            <th>Hours Estimated</th>
                            <th>Hours Contributed</th>
                            <th>Project ID</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="task" items="${tasks}">
                            <tr>
                                <td>${task.task_ID}</td>
                                <td>${task.task_name}</td>
                                <td>${task.task_description}</td>
                                <td>${task.task_status}</td>
                                <td>${task.hours_estimated}</td>
                                <td>${task.hours_contributed}</td>
                                <td>${task.project_ID}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
             </div>
          </div>

<script src="static/js/jquery-1.11.1.min.js"></script>
    <script src="static/js/bootstrap.min.js"></script>
</body>

</html>
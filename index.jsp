<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LCA Advocacia</title>
<%@ include file="header.jsp"%>

</head>

<body>

	<nav class="navbar navbar-inverse navbar-fixed-top">

	<div class="container">

		<div class="navbar-header">

			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>

			<a class="navbar-brand" href="#">LCA Advocacia</a>
		</div>
		<!-- Fechamento do navbar-header -->

		<div id="navbar" class="navbar-collapse collapse">

			<form class="navbar-form navbar-right" method="post">
				<div class="form-group">
					<input type="text" placeholder="Email" class="form-control"
						name="email" onblur="validarEmail (this, 'erroEmail');">
				</div>

				<div class="form-group">
					<input type="password" placeholder="Senha" class="form-control"
						onblur="validarSenha (this, 'erroSenha');">
				</div>

				<button type="submit" class="btn btn-success">Entrar</button>

			</form>
			<!-- Fechamento do form-->

		</div>
		<!-- Fechamento do navbar-collapse -->

	</div>
	<!-- Fechamento do container --> </nav>
	<!--  Fechamento da navbar-inverse -->

	<br>
	<br>
	<br>

				<h1 class="text-center">LCA <small>Advocacia</small></h1>

	<div class="container">
		<div class="starter-template">
			<div class="jumbotron">
				<h2 class="text-center">ACOMPANHAMENTO DE PROCESSOS</h2>

				<h3 class="text-center">Você poderá ter acesso a informações
					particulares sobre seus processos. As informações podem ser
					atualizadas sempre que necessário, tudo com muita segurança e
					comodidade. É simples, fácil e funcional!</h3>

			</div>

		</div>

	</div>
	<!-- /.container -->





	<script type="text/javascript" src="js/script.js" charset="utf-8"></script>


</body>
</html>
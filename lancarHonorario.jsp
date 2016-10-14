<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lançar Honorário</title>
<%@ include file="header.jsp"%>

</head>
<body>
	<%@ include file="menu.jsp"%>


	<div class="container">

		<br>


		<div class="container">
			<h3>LANÇAR HONORÁRIO</h3>
		</div>

		<br> <br>


		<form action="lancarHonrarioServlet" id="campo"
			class="form-horizontal" method="post">

			<div class="form-group">
				<label for="idNome" class="col-sm-2 control-label">Nome:</label>
				<div class="col-sm-5">

					<input type="text" name="nome" id="idNome" size="20" maxlength="50"
						class="form-control" placeholder="Descrição Honorário"
						onblur="validarNome (this ,'erroNome' );"> <span
						class="erro" id="erroNome" onkeyup="alteraMaiusculo()"></span>
				</div>

			</div>
			<!-- Fechamento da form-group -->

			<div class="form-group">
				<label for="idData" class="col-sm-2 control-label"> Data: </label>
				<div class="col-sm-2">
					<input type="text" class="form-control" name="data" id="idData"
						placeholder="Digite a data" maxlength="10"
						OnKeyPress="formatar('##/##/####', this) "
						onblur="validarData (this ,'erroData' );"> <span
						class="erro" id="erroData"></span>

				</div>
			</div>
			<!-- Fechamento da form-group -->

			<div class="form-group">
				<label for="idHora" class="col-sm-2 control-label">
					Quantidade de Horas: </label>
				<div class="col-sm-2">
					<input type="text" class="form-control" name="hora" id="idHora"
						placeholder="Digite a hora" maxlength="5"
						OnKeyPress="formatar('##.##', this)"
						onblur="validarHora (this ,'erroHora' );"> <span
						class="erro" id="erroHora"></span>
				</div>
			</div>
			<!-- Fechamento da form-group -->


			<div class="form-group ">

				<label class="col-sm-2 control-label">Observações:</label>
				<div class="col-sm-5">
					<textarea rows="5"  name="comentar" id="comentar"
						class="form-control" placeholder="Digite aqui sua observação..."></textarea>
				</div>
			</div>
			<!-- Fechamento da form-group -->

			<p class="text-right">
			<div class="form-group">

				<p class="text-center">

					<input id="btnCadastrar" type="submit" class="btn btn-warning"
						value="Cadastrar"> <a href="ListarProcesso.html"> <input
						class="btn btn-danger" id="btnVoltar" type="button" value="Voltar"></a>
				</p>
			</div>

		</form>

	</div>
	<!-- Fechamento da container -->


	<script type="text/javascript" src="js/script.js" charset="utf-8"></script>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Lançar Despesa</title>

<%@ include file="header.jsp"%>
</head>
<body>
	<%@ include file="menu.jsp"%>

	<br>

	<div class="container">

		<h3>LANÇAR DESPESA</h3>


		<br> <br>

		<form action="lancarDespesaServlet" class="form-horizontal"
			method="post" id="campo" >


			<div class="form-group">
				<label id="nome " for="idNome" class="col-sm-2 control-label">Nome:</label>

				<div class="col-sm-5">
					<input type="text" name="nome" id="idNome"
						placeholder="Digite o Nome" class="form-control"
						onblur="validarNome (this,'erroNome');" onkeyup="alteraMaiusculo()">
						 <span class="erro" id="erroNome"></span>
				</div>
			</div>
			<!-- Fechamento do form-group-->

			<div class="form-group">
				<label for="idData" class="col-sm-2 control-label"> Data: </label>
				<div class="col-sm-2">
					<input type="text" class="form-control"
						OnKeyPress="formatar('##/##/####', this)" maxlength="10"
						name="data" id="idData" placeholder="Digite a Data"
						onblur="validarData (this, 'erroData');" > <span
						class="erro" id="erroData"></span>

				</div>
			</div>
			<!-- Fechamento do form-group-->


			<div class="form-group">

				<label for="idValor" class="col-sm-2 control-label">Valor:</label>
				<div class="input-group col-sm-2">
					<div class="input-group-addon">R$</div>
					<input type="text" name="valor" class="form-control" id="idValor"
						size="20" placeholder="Valor"
						onblur="validarValor (this, 'erroValor');">

					<div class="input-group-addon">.00</div>
				</div>
			</div>
			<!-- Fechamento do form-group-->

			<div class="form-group ">

				<label class="col-sm-2 control-label">Observações:</label>
				<div class="col-sm-5">
					<textarea rows="5"  name="comentar" id="comentar"
						class="form-control" placeholder="Digite aqui sua observação..."></textarea>
				</div>
			</div>



			<div class="form-group">
				<p class="text-center">
					<input id="btnCadastrar" type="submit" class="btn btn-warning"
						value="Cadastrar"> <a href="ListarProcesso.html"><input
						class="btn btn-danger" id="btnVoltar" type="button" value="Voltar"></a>
				</p>
			</div>

		</form>
	</div>
	<!-- Fechamento do container-->


	<script type="text/javascript" src="js/script.js" charset="utf-8"></script>

</body>
</html>
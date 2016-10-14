/**
 * 
 */

	function validarNome(tag, idErro) {
		var nome = tag.value;
		var validacao = /^[A-Za-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ ]+$/;
		var spanErro = document.getElementById(idErro);
		if (!validacao.test(nome)) {
			tag.style.border = "2px solid red";
			spanErro.innerHTML = "Nome Inválido !";
		} else {
			tag.style.border = "1px solid green";

			spanErro.innerHTML = "";
		}
	}
	
	
	function validarData(tag,idErro){
		var data = tag.value;
		var validacao = /^[0-9/]+$/;
		var spanErro = document.getElementById(idErro);
		if (!validacao.test(data)){
			tag.style.border = "2px solid red";
			spanErro.innerHTML = "Data Inválida !";
		}else{
			tag.style.border = "1px solid green";
			spanErro.innerHTML = "";
			}
	}
	
	function validarValor(tag,idErro){
		var valor = tag.value;
		var validacao = /^[0-9]+$/;
		var spanErro = document.getElementById(idErro);
		if (!validacao.test(valor)){
			tag.style.border = "2px solid red";
			spanErro.innerHTML = "Valor Inválido !";
		}else{
			tag.style.border = "1px solid green";
			spanErro.innerHTML = "";
			}
	}
	
	function formatar(mascara, documento){
		  var i = documento.value.length;
		  var saida = mascara.substring(0,1);
		  var texto = mascara.substring(i)
		  
		  if (texto.substring(0,1) != saida){
		            documento.value += texto.substring(0,1);
		  }
		  
		}

	function validarHora(tag,idErro){
		var hora = tag.value;
		var validacao = /^[0-9@.-:]+$/;
		var spanErro = document.getElementById(idErro);
		if (!validacao.test(hora)){
			tag.style.border = "2px solid red";
			spanErro.innerHTML = "Hora Inválida !";
		}else{
			tag.style.border = "1px solid green";
			spanErro.innerHTML = "";
			}
	}
	
	function validarProcesso(tag,idErro){
		var processo = tag.value;
		var validacao = /^[0-9.-]+$/;
		var spanErro = document.getElementById(idErro);
		if (!validacao.test(processo)){
			tag.style.border = "2px solid red";
			spanErro.innerHTML = "Processo Inválido !";
		}else{
			tag.style.border = "1px solid green";
			spanErro.innerHTML = "";
			}
	}
	
	function validarEmail(tag,idErro){
		var email = tag.value;
		var validacao = /^[a-z0-9.-_+=]+$/;
		var spanErro = document.getElementById(idErro);
		if (!validacao.test(email)){
			tag.style.border = "2px solid red";
		}else{
			tag.style.border = "1px solid green";
			spanErro.innerHTML = "";
			}
	}
	
	function validarSenha(tag,idErro){
		var senha = tag.value;
		var validacao = /^[A-Za-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑa-z0-9.-]+$/;
		var spanErro = document.getElementById(idErro);
		if (!validacao.test(senha)){
			tag.style.border = "2px solid red";
		}else{
			tag.style.border = "1px solid green";
			spanErro.innerHTML = "";
			
			}
	}
	
	function alteraMaiusculo(){
		var valor = document.getElementById("campo").nome;
		var novoTexto = valor.value.toUpperCase();
		valor.value = novoTexto;
		}
	
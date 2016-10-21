 /**
* 
* @author Felipe Moita Vieira 
* @author João Miguel Souza Martins
* @author Marcelo Pereira Marco Peres
* 
* @see    		   Advogado
*/


package br.com.fiap.dao;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import br.com.fiap.beans.Advogado;
 
public class AdvogadoDAO extends PessoaDAO {
	
 /**
  * 
 * Método que <b>adiciona</b> uma tupla nas tabelas
 * T_AAD_PESSOA. 
 * T_AAD_ADVOGADO.
 * T_AAD_ESPECIALIDADE.
 * @param a Um objeto do tipo Advogado
 * @param conexao Um objeto do tipo Connection
 * @throws Exception
 */
     
    public void gravar (Advogado a, Connection conexao ) throws Exception{
 
    	//Insere dados na Tabela Pessoa
    	PreparedStatement strt = conexao.prepareStatement("insert into T_AAD_PESSOA "
				+ "(CD_PESSOA, NM_NOME) "
				+ "values (SQ_AM_PESSOA.nextval,?)");
    	
    	strt.setString(1, a.getNome());
    	strt.execute();
    	strt.close();
    	
    	//Insere dados na Tabela Advogado
        PreparedStatement estrutura = conexao.prepareStatement("insert into T_AAD_ADVOGADO "
        		+ "(NR_OAB, NR_CPF, NR_RG, DS_EMAIL, DS_SENHA,CD_ADVOGADO) "
        		+ "values (?,?,?,?,?,SQ_AM_PESSOA.currval)");
        estrutura.setString(1, a.getNumeroOAB());
        estrutura.setString(2, a.getCpf());
        estrutura.setString(3, a.getRg());
        estrutura.setString(4, a.getEmail());
        estrutura.setString(5, a.getSenha());
        estrutura.execute();
        estrutura.close();
       
        //Insere dados na Tabela Especialidade
        PreparedStatement strtEspec = conexao.prepareStatement("insert into T_AAD_ESPECIALIDADE "
        		+ "(CD_ADVOGADO, CD_CAUSA) values (SQ_AM_PESSOA.currval,?)");
        strtEspec.setInt(1, a.getEspecialidade().getCodigoTipoCausa());
        strtEspec.execute();
        strtEspec.close();
       
 
    }
 
    
 
 
}

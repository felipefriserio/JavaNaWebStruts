package fiap.scj.struts.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import fiap.scj.struts.model.Pessoa;

@Namespace("/")
public class FormularioAction extends ActionSupport{
	private static final long serialVersionUID = 1l;
	
	private Pessoa pessoa;
	private String mensagem;
	
	@Action(value = "/form", results = {
			@Result(name = "success", location="/formulario.jsp")
	})
	public String abreFormulario(){
		pessoa = new Pessoa();
		return SUCCESS;
	}
	
	@Action(value = "/cadastrar", results ={
			@Result(name = "success", location = "/formulario.jsp")
	})
	public String cadastrar(){
		System.out.println(this.pessoa);
		this.mensagem = "Tudo certo ";
		return SUCCESS;
	}
	

}

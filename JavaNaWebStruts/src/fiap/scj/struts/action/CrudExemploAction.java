package fiap.scj.struts.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/")
public class CrudExemploAction extends ActionSupport{
	
	@Action(value="welcome", results = {
			@Result(name = "success", location="sucesso.jsp"),
			@Result(name = "error", location="erro.jsp")
	})
	public String execute() throws Exception{
		return SUCCESS;
	}
	
}

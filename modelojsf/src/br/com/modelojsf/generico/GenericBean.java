package br.com.modelojsf.generico;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

public class GenericBean {
	
	public Object getObjetoSessao(String chave) {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
		
		if (session == null) {
			return null;
		} else {
			return session.getAttribute(chave);
		}
	}
	
	public void addObjetoSessao(String chave, Object valor) {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
		removeObjetoSessao(chave);
		session.setAttribute(chave, valor);
	}
	
	public void removeObjetoSessao(String chave) {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
		session.removeAttribute(chave);
	}

}
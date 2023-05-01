package br.com.cedi.service;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.inject.Inject;

import br.com.cedi.dao.HistoricoDAO;
import br.com.cedi.dao.PessoaDAO;
import br.com.cedi.model.Historico;
import br.com.cedi.model.Pessoa;
import br.com.cedi.uil.jpa.Transactional;



public class HistoricoService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private HistoricoDAO historicoDAO;
	
	@Transactional
	public void salvar(Historico historico) {	
		if(historico.getId() == null){
			this.historicoDAO.inserir(historico);
		}else{
			this.historicoDAO.atualizar(historico);
		}
	}
	
}

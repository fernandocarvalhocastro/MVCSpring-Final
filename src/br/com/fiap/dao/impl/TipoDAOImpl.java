package br.com.fiap.dao.impl;

import org.springframework.stereotype.Repository;
import br.com.fiap.dao.TipoDAO;
import br.com.fiap.model.Tipo;

@Repository
public class TipoDAOImpl extends GenericDAOImpl<Tipo, Integer>
												implements TipoDAO{

}
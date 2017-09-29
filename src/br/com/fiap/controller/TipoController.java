package br.com.fiap.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.dao.TipoDAO;
import br.com.fiap.model.Tipo;

@Controller
@RequestMapping("/tipo")
public class TipoController {

	@Autowired
	private TipoDAO dao;
	
	@GetMapping("cadastrar")
	public ModelAndView abrirForm(){
		return new ModelAndView("tipo/cadastro")
				.addObject("tipo", new Tipo());
	}
	
	@Transactional
	@PostMapping("cadastrar")
	public ModelAndView processarForm(@Valid Tipo tipo, 
			BindingResult result, RedirectAttributes redirect){
		if (result.hasErrors()){
			return new ModelAndView("tipo/cadastro");
		}else{
			dao.cadastrar(tipo);
			redirect.addFlashAttribute("msg", "Cadastrado!");
			return new ModelAndView("redirect:/tipo/cadastrar");
		}
	}
	
}




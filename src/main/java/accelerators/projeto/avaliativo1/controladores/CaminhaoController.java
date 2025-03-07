package accelerators.projeto.avaliativo1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import accelerators.projeto.avaliativo1.modelos.Caminhao;

@Controller
@RequestMapping("/caminhao")
public class CaminhaoController {
    static Caminhao volvo = new Caminhao("Volvo VM 270");

    @GetMapping("/painel")
    public ModelAndView geral(){
        ModelAndView mv = new ModelAndView("/caminhao/painel.html");
        mv.addObject("caminhao", volvo);
        return mv;
    }

    @GetMapping("/painel/acelerar")
    public ModelAndView acelerar(){
        volvo.aumentarVelocidade();
        ModelAndView mv = new ModelAndView("/caminhao/painel.html");
        mv.addObject("caminhao", volvo);
        return mv;
    }

    @GetMapping("/painel/frear")
    public ModelAndView frear(){
        volvo.diminuirVelocidade();
        ModelAndView mv = new ModelAndView("/caminhao/painel.html");
        mv.addObject("caminhao", volvo);
        return mv;
    }

    @GetMapping("/painel/redefinir")
    public ModelAndView redefinir(){
        volvo = new Caminhao("Volvo VM 270");
        ModelAndView mv = new ModelAndView("/caminhao/painel.html");
        mv.addObject("caminhao", volvo);
        return mv;
    }

    @GetMapping("/painel/voltar")
    public String voltar(){
        volvo = new Caminhao("Volvo VM 270");
        return "redirect:../../";        
    }
}

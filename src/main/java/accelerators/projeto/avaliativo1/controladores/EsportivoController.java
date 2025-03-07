package accelerators.projeto.avaliativo1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import accelerators.projeto.avaliativo1.modelos.CarroEsportivo;

@Controller
@RequestMapping("/esportivo")
public class EsportivoController {
    //com a chamada da página, cria automaticamente um instancia de CarroEsportivo para ser usada
    static CarroEsportivo porsche = new CarroEsportivo("Porsche 911");

    @GetMapping("/painel")
    public ModelAndView geral(){
        ModelAndView mv = new ModelAndView("/esportivo/painel.html");
        mv.addObject("caresportivo", porsche);
        return mv;
    }

    @GetMapping("/painel/acelerar")
    public ModelAndView acelerar(){
        porsche.aumentarVelocidade();
        ModelAndView mv = new ModelAndView("/esportivo/painel.html");
        mv.addObject("caresportivo", porsche);
        return mv;
    }

    @GetMapping("/painel/frear")
    public ModelAndView frear(){
        porsche.diminuirVelocidade();
        ModelAndView mv = new ModelAndView("/esportivo/painel.html");
        mv.addObject("caresportivo", porsche);
        return mv;
    }

    @GetMapping("/painel/redefinir")
    public ModelAndView redefinir(){
        porsche = new CarroEsportivo("Porsche 911");
        ModelAndView mv = new ModelAndView("/esportivo/painel.html");
        mv.addObject("caresportivo", porsche);
        return mv;
    }

    @GetMapping("/painel/voltar")
    public String voltar(){
        porsche = new CarroEsportivo("Porsche 911");
        return "redirect:../../";        
    }

}

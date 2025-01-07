package com.tallerwebi.presentacion;

import com.tallerwebi.dominio.PresionArterial;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorPresionArterial {


    @RequestMapping(value = "/guardarPresion", method = RequestMethod.POST)
    public ModelAndView formularioControlPresion(@ModelAttribute("presionArterial") PresionArterial presionArterial){

        Integer presionAlta = presionArterial.getPresionAlta();
        Integer presionBaja = presionArterial.getPresionBaja();
        Integer pulsaciones = presionArterial.getPulsaciones();

        System.out.println("Presión Alta: " + presionAlta);
        System.out.println("Presión Baja: " + presionBaja);
        System.out.println("Pulsaciones: " + pulsaciones);


        return new ModelAndView("resultado"); 
    }
}

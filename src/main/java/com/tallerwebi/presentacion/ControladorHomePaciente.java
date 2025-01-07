package com.tallerwebi.presentacion;

import com.tallerwebi.dominio.Paciente;
import com.tallerwebi.dominio.PresionArterial;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorHomePaciente {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView home() {

        ModelMap modelo = new ModelMap(); //ModelMap es el tipo de dato que mandamos a la vista

        //ObjetoAGuardar objeto = new ObjetoAGuardar

        //modelo.put("nombre de llave", objeto); En el modelo guardamos con una clave el objeto

        //en el primer parametro del ModelAndView va el nombre del html, en el segundo parametro va el objeto del ModelMap

        Paciente paciente = new Paciente("Joao", "Pontinho");


        modelo.put("paciente", paciente);


        return new ModelAndView("home", modelo);
    }

    @RequestMapping(value = "/controlPresion", method = RequestMethod.GET)
    public ModelAndView controlPresion() {
        ModelMap modelo = new ModelMap();
        PresionArterial presionArterial = new PresionArterial();
        modelo.put("presionArterial", presionArterial);
        return new ModelAndView("controlPresion", modelo);
    }

    @RequestMapping(value = "/controlPeso", method = RequestMethod.GET)
    public ModelAndView controlPeso() {
        ModelMap modelo = new ModelMap();
        return new ModelAndView("controlPeso", modelo);
    }

    @RequestMapping(value = "/controlDiabetes", method = RequestMethod.GET)
    public ModelAndView controlDiabetes() {
        ModelMap modelo = new ModelMap();
        return new ModelAndView("controlDiabetes", modelo);
    }


}

package com.tallerwebi.presentacion;

import com.tallerwebi.dominio.PresionArterial;
import org.junit.jupiter.api.Test;
import org.springframework.web.servlet.ModelAndView;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ControladorPresionArterialTest {


    @Test
    public void debeRetornarLaVistaControlPresionCuandoSeEjecutaElMetodoControlarPresion(){

        //dado
        ControladorPresionArterial presionArterial = new ControladorPresionArterial();

        //cuando
        ModelAndView modelAndView = presionArterial.controlarPresion();


        assertThat(modelAndView.getViewName(), equalToIgnoringCase("controlPresion"));

    }

    @Test
    public void debeRetornarLaVistaControlPresionConElObjetoPresionArterialYLaLlavePresionArterialCuandoSeEjecutaElMetodoControlarPresion(){

        //dado
        ControladorPresionArterial presionArterial = new ControladorPresionArterial();

        //cuando
        ModelAndView modelAndView = presionArterial.controlarPresion();


        assertThat(modelAndView.getViewName(), equalToIgnoringCase("controlPresion"));
        assertThat(modelAndView.getModel().get("presionArterial"), is(notNullValue()));


    }


}

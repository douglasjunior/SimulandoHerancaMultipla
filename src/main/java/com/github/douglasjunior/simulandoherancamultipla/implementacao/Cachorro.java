package com.github.douglasjunior.simulandoherancamultipla.implementacao;

import com.github.douglasjunior.simulandoherancamultipla.interfaces.Animal;

/**
 *
 * @author Douglas
 */
public class Cachorro implements Animal {

    private double velocidade;

    @Override
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public Double getVelocidade() {
        return velocidade;
    }

}

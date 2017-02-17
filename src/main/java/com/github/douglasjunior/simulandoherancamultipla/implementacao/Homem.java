package com.github.douglasjunior.simulandoherancamultipla.implementacao;

import com.github.douglasjunior.simulandoherancamultipla.interfaces.Animal;
import com.github.douglasjunior.simulandoherancamultipla.interfaces.Humano;

/**
 *
 * @author Douglas
 */
public class Homem implements Humano, Animal {

    private double velocidade;

    @Override
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public Double getVelocidade() {
        return velocidade;
    }

    @Override
    public void correr() {
        Humano.super.correr();
    }

}

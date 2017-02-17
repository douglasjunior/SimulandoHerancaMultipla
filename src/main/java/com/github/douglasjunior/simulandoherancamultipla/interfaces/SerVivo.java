package com.github.douglasjunior.simulandoherancamultipla.interfaces;

/**
 *
 * @author Douglas
 */
public interface SerVivo {

    public void setVelocidade(double velocidade);

    public Double getVelocidade();

    public void correr();

    default public void respirar() {
        System.out.println("O " + getClass().getSimpleName() + " está respirando...");
    }

}

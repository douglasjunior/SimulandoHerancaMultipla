package com.github.douglasjunior.simulandoherancamultipla.interfaces;

/**
 *
 * @author Douglas
 */
public interface Humano extends SerVivo {

    @Override
    default public void correr() {
        System.out.println("O " + getClass().getSimpleName() + " corre em uma velocidade de " + getVelocidade());
    }

    default public void pensar() {
        System.out.println("O " + getClass().getSimpleName() + " está pensando...");
    }

}

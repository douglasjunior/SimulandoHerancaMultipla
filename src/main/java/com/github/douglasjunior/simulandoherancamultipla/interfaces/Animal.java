package com.github.douglasjunior.simulandoherancamultipla.interfaces;

/**
 *
 * @author Douglas
 */
public interface Animal extends SerVivo {

    @Override
    default public void correr() {
        System.out.println("O " + getClass().getSimpleName() + " corre em uma velocidade de " + (getVelocidade() * 2));
    }

    default public void cacar() {
        System.out.println("O " + getClass().getSimpleName() + " está cançando...");
    }

}

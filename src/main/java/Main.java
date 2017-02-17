import com.github.douglasjunior.simulandoherancamultipla.implementacao.Cachorro;
import com.github.douglasjunior.simulandoherancamultipla.implementacao.Homem;

/**
 *
 * @author Douglas
 */
public class Main {

    public static void main(String[] args) {

        Cachorro c = new Cachorro();
        c.setVelocidade(5);
        c.respirar();
        c.cacar();
        c.correr();

        Homem h = new Homem();
        h.setVelocidade(5);
        h.respirar();
        h.pensar();
        h.cacar();
        h.correr();
        
        /*
        Saída:
        O Cachorro está respirando...
        O Cachorro está cançando...
        O Cachorro corre em uma velocidade de 10.0
        O Homem está respirando...
        O Homem está pensando...
        O Homem está cançando...
        O Homem corre em uma velocidade de 5.0
        */

    }

}


import com.github.douglasjunior.simulandoherancamultipla.implementacao.Cachorro;
import com.github.douglasjunior.simulandoherancamultipla.implementacao.Homem;
import com.github.douglasjunior.simulandoherancamultipla.interfaces.Animal;

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

    }

}

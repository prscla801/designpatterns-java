package iterator;

import java.util.ArrayList;

public class CanaisEsportes implements AgregadoDeCanais {
 
    protected ArrayList<Canal> canais;
 
    public CanaisEsportes() {
        canais = new ArrayList<Canal>();
        canais.add(new Canal("Esporte ao vivo"));
        canais.add(new Canal("Esporte mas só futebol mesmo"));
        canais.add(new Canal("Sport TV 1"));
        canais.add(new Canal("Sport TV 2"));
        canais.add(new Canal("Sport TV 55"));
    }
 
    @Override
    public IteradorInterface criarIterator() {
        return new IteradorListaDeCanais(canais);
    }
}

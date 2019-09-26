package iterator;

public class CanaisFilmes implements AgregadoDeCanais {

    Canal canais[]; 

    public CanaisFilmes() {
        canais = new Canal[4];
        canais[0] = new Canal("Telecine 1");
        canais[1] = new Canal("Telecine 2");
        canais[2] = new Canal("Telecine 3");
        canais[3] = new Canal("Telecine 4");
    }

    @Override
    public IteradorInterface criarIterator() {
        return new IteradorVetorDeCanais(canais);
    }

}

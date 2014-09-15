import java.util.Random;


public class PrototypeMutation implements IMutation {

    private Random rnd = null;
    private player11 contestReference;
    
    private PrototypeMutation(Random rnd, player11 contestReference){
        this.rnd = rnd;
        this.contestReference = contestReference;
    }

    @Override
    public Individual mutate(double[] dna) {
        dna[3] = dna[3]+rnd.nextDouble();
        
        // TODO Auto-generated method stub
        return contestReference.createIndividual(dna);
    }

}

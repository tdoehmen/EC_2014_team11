import java.util.Random;


public class UncorrelatedMutation implements IMutation {

    private Individual individual;
    private Random rnd;
    private player11 contestReference;
    
    public UncorrelatedMutation(Random rnd, player11 contestReference) {
        this.rnd = rnd;
        this.contestReference = contestReference;
    }

    @Override
    public Individual mutate(double[] dna) {
        this.individual = individual;
        // TODO Auto-generated method stub
        return contestReference.createIndividual(dna);
    }

}

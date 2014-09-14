import java.util.Random;


public class CorrelatedMutation implements IMutation {

    private Individual individual;
    private Random rnd;
    
    public CorrelatedMutation(Random rnd) {
        this.rnd = rnd;
    }

    @Override
    public Individual mutate(Individual individual) {
        this.individual = individual;
        // TODO Auto-generated method stub
        return null;
    }

}

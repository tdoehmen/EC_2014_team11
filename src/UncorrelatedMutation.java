import java.util.Random;


public class UncorrelatedMutation implements IMutation {

    @Override
    public Individual mutate(double[] dna) {
        for(int i = 0; i<dna.length; i++){
            dna[i] = dna[i]+player11.rnd.nextDouble()*0.2-0.1;
        }
        return player11.createIndividual(dna);
    }

}

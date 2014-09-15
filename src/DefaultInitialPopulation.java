import java.util.Random;

import org.vu.contest.ContestEvaluation;


public class DefaultInitialPopulation implements IInitialPopulation {

    public static int INITIAL_POPULATION_SIZE = 10;

    private Random rnd = null;
    private player11 contestReference = null;
    
    public DefaultInitialPopulation(Random rnd, player11 contestReference) {
        this.rnd = rnd;
        this.contestReference = contestReference;
    }
    
    @Override
    public Population createInitialPopulation() {
        Population population = new Population();
        
        while(population.getIndividuals().size() < INITIAL_POPULATION_SIZE){
            double[] randomDna = new double[10];
            for(int i = 0; i<10; i++){
                //bounds are [-5.0,5.0[
                randomDna[i] = rnd.nextDouble()*10.0 - 5.0;
            }
            Individual individual = contestReference.createIndividual(randomDna);
            population.addIndividual(individual);
        }
        
        return population;
    }

}





public class InitialPopulationSimple implements IInitialPopulation {

    public static int INITIAL_POPULATION_SIZE = 10;
    private IMutation mutation = null;
    
    public void setMutation(IMutation mutation){
        this.mutation = mutation;
    }
    
    @Override
    public Population createInitialPopulation() {
        Population population = new Population();
        
        while(population.getIndividuals().size() < INITIAL_POPULATION_SIZE){
            double[] randomDna = new double[10];
            for(int i = 0; i<10; i++){
                //bounds are [-5.0,5.0[
                randomDna[i] = player11.rnd.nextDouble()*10.0 - 5.0;
            }

            
            Individual ind = new Individual(randomDna);
            player11.evaluateInitialIndividual(ind);
            mutation.intializeMutationParameters(ind);
            population.addIndividual(ind);
        }
        
        return population;
    }

}

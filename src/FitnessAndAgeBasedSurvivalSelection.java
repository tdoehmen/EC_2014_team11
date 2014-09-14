import java.util.ArrayList;


public class FitnessAndAgeBasedSurvivalSelection implements ISurvivalSelection{

    public static int MAXIMUM_POPULATION_SIZE;
    
    public void selectSurvivals(Population unselectedPopulation){
        ArrayList<Individual> unselectedIndividuals = unselectedPopulation.getIndividuals();
        ArrayList<Individual> selectedIndividuals = unselectedPopulation.getIndividuals();
        Population selectedPopulation = unselectedPopulation;

        for(Individual individual : unselectedIndividuals){
            //skip all individuals older than 2 generations
            if( individual.getGeneration() - unselectedPopulation.getGeneration() > 2){
                continue;
            }else{
                //TODO select based on fitness
                selectedPopulation.addIndividual(individual);
            }  
        }

        selectedPopulation.setIndividuals(selectedIndividuals);
    }
}

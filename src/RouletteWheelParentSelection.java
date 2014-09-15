import java.util.ArrayList;
import java.util.Random;


public class RouletteWheelParentSelection implements IParentSelection {

    private Random rnd;
    
    public RouletteWheelParentSelection(Random rnd){
        this.rnd = rnd;
    }
    @Override
    public Individual[] selectParents(Population population) {
        ArrayList<Individual> allIndividuals = population.getIndividuals();
        //TODO: select individual based on roulette wheel probability
        int indexA = (int) (rnd.nextDouble()*allIndividuals.size());
        int indexB = -1;
        do{
            indexB = (int) (rnd.nextDouble()*allIndividuals.size());
        }while(indexB==indexA);
        Individual[] parents = new Individual[2];
        parents[0] = allIndividuals.get(indexA);
        parents[1] = allIndividuals.get(indexB);
        return parents;
    }

}

import java.util.ArrayList;


public interface IRecombination {

    public ArrayList<Individual> crossover(Individual parentA, Individual parentB, int number_of_childs);
}

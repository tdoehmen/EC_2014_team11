import java.util.ArrayList;
import java.util.Random;

import org.vu.contest.ContestEvaluation;


public class BiPolarBlendCrossover implements IRecombination {

    public static double APLPHA_CROSS_RATE = 0.5;
    
    private Random rnd;
    private ContestEvaluation evaluation;
    
    public BiPolarBlendCrossover(Random rnd, ContestEvaluation evaluation){
        this.rnd = rnd;
        this.evaluation = evaluation;
    }
    
    @Override
    public ArrayList<Individual> crossover(Individual parentA, Individual parentB, int number_of_childs) {
        //see slides ch04.pdf, p.31 & http://books.google.nl/books?id=QcWdO7koNUQC&lpg=PA36&ots=D-iG4JtxI5&dq=blend%20crossover%20evolutionary%20computing&hl=de&pg=PA36#v=onepage&q&f=false
        ArrayList<Individual> childs = new ArrayList<Individual>();
        
        if(number_of_childs % 2 != 0){
            throw new RuntimeException("Number of childs has to be even. But was: "+number_of_childs);
        }
        
        for( int i = 0; i<number_of_childs; i=i+2){
            childs.add(blendCross(parentA,parentB));
            childs.add(blendCross(parentB,parentA));
        }
        
        return childs;
    }

    private Individual blendCross(Individual parentOne, Individual parentTwo){
        double[] child_dna = new double[10];
        for(int j = 0; j<10; j++){
            double di_delta = parentOne.getDna()[j]-parentTwo.getDna()[j];
            if(di_delta > 0){
                child_dna[j] = parentOne.getDna()[j]+(rnd.nextDouble()*(2.0*di_delta)-(di_delta));
            }else{
                child_dna[j] = parentTwo.getDna()[j];
            }
        }
        
        //calculate fitness
        Double fitness = (Double) evaluation.evaluate(child_dna);
        //create individual
        return new Individual(child_dna, fitness);
        
    }
}

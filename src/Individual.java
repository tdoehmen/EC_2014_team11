import java.util.Arrays;

public class Individual implements Comparable{

    private double[] dna;
    private Double fitness;
    
    public Individual(double[] dna, Double fitness) {
        super();
        this.dna = dna;
        this.fitness = fitness;
    }
    @Override
    public String toString() {
        return "Individual [dna=" + Arrays.toString(dna) + ", fitness=" + fitness + "]";
    }
    public double[] getDna() {
        return dna;
    }
    public void setDna(double[] dna) {
        this.dna = dna;
    }
    public Double getFitness() {
        return fitness;
    }
    public void setFitness(Double fitness) {
        this.fitness = fitness;
    }
    @Override
    public int compareTo(Object arg0) {
        if( arg0 instanceof Individual ){
            Individual comp = (Individual) arg0;
            return this.getFitness().compareTo(comp.fitness);
        }
        return 0;
    }
    
    
    
}
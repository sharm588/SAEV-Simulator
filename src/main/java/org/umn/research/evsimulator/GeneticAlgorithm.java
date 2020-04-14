package org.umn.research.evsimulator;

import ilog.concert.IloException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class GeneticAlgorithm {

    ArrayList<Organism> population = new ArrayList<>();
    ArrayList<Organism> sortedList = new ArrayList<>();
    int generations = 10;
    int populationSize = 1;
    int size = 0;
    float mutate = 0;
    double bestPercent = 0.1; //take top 10% of fittest organisms
    double a1  = 0.005;
    double arithmeticFactor = 0;
    Random r = new Random();
    double ProbabilityValue = 0;

    public void calculateArithmeticfactor () throws IloException, IOException
    {
        int divideby = (populationSize-1);
        arithmeticFactor = -1 * ((2 / populationSize) - (2 * a1)) / (divideby);
    }

    public void createPopulation () throws IloException, IOException { //create initial population of organisms
        for (int i = 0; i < populationSize; i++) {
            Organism organism = new Organism();
            population.add(organism);
        }
    }

    public int assignParent() throws IloException, IOException
    {
        probabilityValue = r.nextDouble(); //assign probability between 0 and 1

        if (probabilityValue == 0) { //if probability is 0, set to 1
            probabilityValue++;
        }

        double arithmeticCounter = 0;
        int numberOfTerms = 0;

        while(arithmeticCounter < probabilityValue) {   //loop until arithmetic sequence sum is greater than the random probability value
            arithmeticCounter += firstTerm + (numberOfTerms * arithmeticFactor);
            numberOfTerms++;
        }
        return numberOfTerms;
    }

    public void survivalOfFittest () throws IloException, IOException {

        ArrayList<Organism> bestOrganisms = new ArrayList<>();
        ArrayList<Organism> nextGeneration = new ArrayList<>();

        for (int i = 0; i < generations; i++) { //loop through number of generations

            Collections.sort(population);   //sort values from least to greatest

            int bestNumber = (int) Math.round(bestPercent * populationSize); //calculate how many organisms to take into next generation

            if (bestNumber == 0) { // if  bestNumber rounds to 0, set bestNumber to 1
                bestNumber = 1;
            }

            for (int x = 0; x < bestNumber; x++) { //add best organisms to list
                bestOrganisms.add(population.get(x));
            }

            //size = population.size() - bestNumber; //set size to population - bestNumber since we are not considering best few
            //System.out.println("size: " + (size + 2)); //print original population size

            for (int j = 0; j < populationSize; j++) { //loop through population (minus first two)

                mutate = r.nextFloat();

                if (mutate > 0.05f) { //mutate 5% of the time

                    int numberofValues = assignParent();
                    int parent1_index =  populationSize - (numberofValues - 1) - 1;  //assign parent
                    double parent1_beta = population.get(parent1_index).randomBeta; //first parent beta value
                    double parent1_alpha = population.get(parent1_index).randomAlpha;

                    numberofValues = assignParent();

                    int parent2_index = populationSize - (numberofValues - 1) - 1;  //assign parent

                    if (parent2_index == parent1_index) { //make sure parents aren't the same
                        if(parent2_index == populationSize-1) parent2_index--;
                        parent2_index++;
                    }
                  
                    double parent2_beta = population.get(parent2_index).randomBeta;   //second parent beta value
                    double parent2_alpha = population.get(parent2_index).randomAlpha;

                    double averageBeta = (parent1_beta + parent2_beta) / 2;   //calculate average beta value between parents
                    double averageAlpha = (parent1_alpha + parent2_alpha) / 2; //calculate average alpha value between parents
                    Organism child = new Organism(averageBeta, averageAlpha);    //create child
                    nextGeneration.add(child); //add organism to temporary array list

                } else {
                    double high = 10;
                    double betaVal = high * r.nextDouble();
                    double alphaVal = high * r.nextDouble();
                    Organism child = new Organism(betaVal, alphaVal); //create organism with random alpha and beta values (mutation)
                    nextGeneration.add(child);
                }

            }

            Collections.sort(population);   //sort current population from lowest to highest waiting time
            System.out.println(population.get(0).waitTime); //print best waiting time

            for (int x = 0; x < bestNumber; x++) { //add best organisms from this generation to next generation
                nextGeneration.add(bestOrganisms.get(x));
            }

            population.clear();
            for (Organism org : nextGeneration) {  //replace organisms of last generation with children
                population.add(org);
            }
            bestOrganisms.clear();
            nextGeneration.clear();

        }

    }

}
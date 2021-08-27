package ru.netology;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static Logger logger = Logger.getInstance();

    public static void main( String[] args ) {

        logger.log("Starting the program");
        logger.log("Enter filter value: ");
        int filterValue = scanner.nextInt();
        Filter filter = new Filter(filterValue);
        logger.log("Printing the result " + filter.filterOut(generateList()));
        logger.log("Ending the program");

    }

    public static List<Integer> generateList(){
        Random random = new Random();
        logger.log("Enter list`s length: ");
        int length = scanner.nextInt();
        logger.log("Enter max element`s value: ");
        int maxValue = scanner.nextInt();
        List<Integer> inputList = new ArrayList<>();
        for(int i = 0; i <= length; i++){
            inputList.add(random.nextInt(maxValue));
        }
        logger.log("Generating the list " + inputList);
        return inputList;
    }
}

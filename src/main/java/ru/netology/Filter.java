package ru.netology;


import java.util.List;
import java.util.stream.Collectors;


public class Filter {

    protected int threshold;

    public Filter(int threshold){
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source){
        Logger logger = Logger.getInstance();
        logger.log("Starting filter");
        List<Integer> result = source.stream()
                .filter(v -> v > threshold)
                .collect(Collectors.toList());
        return result;
    }
}

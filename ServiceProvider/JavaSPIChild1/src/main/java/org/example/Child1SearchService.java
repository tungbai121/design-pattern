package org.example;

import java.util.List;

public class Child1SearchService implements SearchService {
    @Override
    public List<Result> search(String text) {
        System.out.println("ChildSearchService#search()");
        return null;
    }
}

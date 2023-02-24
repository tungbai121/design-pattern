package org.example;

import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        System.out.println("App started!");

        ServiceLoader<SearchService> providers = ServiceLoader.load(SearchService.class);
        for (SearchService provider : providers) {
            provider.search("");
        }

        System.out.println("Child1SearchService: ");
        SearchService service = getServiceByName(Child1SearchService.class.getCanonicalName());
        if (service != null) {
            service.search("");
        }

        System.out.println("App finished!");
    }

    public static SearchService getServiceByName(String className) {
        ServiceLoader<SearchService> providers = ServiceLoader.load(SearchService.class);
        for (SearchService provider : providers) {
            if (provider.getClass().getCanonicalName().equals(className)) {
                return provider;
            }
        }

        return null;
    }
}

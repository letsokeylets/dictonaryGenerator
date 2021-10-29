package org.example;

import java.util.Set;

@FunctionalInterface
public interface MyFunction {
    boolean addWords(Set<String> list, String word);
}

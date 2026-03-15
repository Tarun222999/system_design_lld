package lldquestions.snakeandfood.movementstrategy;

import lldquestions.snakeandfood.pair.Pair;

public interface MoveMentStrategy {
    public Pair getNextPosition(Pair currentHead, String direction);
}

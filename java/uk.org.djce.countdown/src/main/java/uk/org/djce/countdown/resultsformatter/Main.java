package uk.org.djce.countdown.resultsformatter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class Main {

    private Main() {

    }

    public static void main(final String[] rawArgs) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        OpTreeBuilder opTreeBuilder = new OpTreeBuilder();
        LeafProcessor lp = new LeafProcessor(opTreeBuilder);
        LeafLineParser leafLineParser = new LeafLineParser(lp);

        new NumbersResultsProcessor(bufferedReader, leafLineParser).run();
    }
}
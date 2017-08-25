package ai.labs.parser.internal.matches;

import ai.labs.parser.model.IDictionary;
import lombok.Getter;

import java.util.LinkedList;
import java.util.List;

/**
 * @author ginccc
 */
@Getter
public class MatchingResult {
    private List<IDictionary.IFoundWord> result;
    private boolean corrected;

    public MatchingResult() {
        this(false);
    }

    private MatchingResult(boolean corrected) {
        this.corrected = corrected;
        result = new LinkedList<>();
    }

    public void addResult(IDictionary.IFoundWord dictionaryEntries) {
        result.add(dictionaryEntries);
    }
}

package com.madhurtoppo.dpandrecursion.tccig.q815word_break;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        boolean [] memo = new boolean[s.length()+1];
        memo[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i ; j++) {
                if (memo[j] && set.contains(s.substring(j, i))) {
                    memo[i] = true;
                    break;
                }
            }
        }
        return memo[s.length()];
    }
}

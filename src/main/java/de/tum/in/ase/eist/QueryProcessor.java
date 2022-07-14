package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
@Service
public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "Mar";
        } else if (query.contains("numbers")) {
            String[] parts = query.split("%");

            return "";
        } else if (query.contains("plus")) {
            Pattern p = Pattern.compile("\\d+");
            Matcher m = p.matcher(query);
            int sum = 0;
            while (m.find()) {
                sum += Integer.parseInt(m.group());
            }

            return String.valueOf(sum);
        } else {
            return "";
        }
    }
}


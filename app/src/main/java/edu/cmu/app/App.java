/* (C)2022 */
package edu.cmu.app;

import static edu.cmu.app.MessageUtils.getMessage;
import static edu.cmu.utilities.StringUtils.join;
import static edu.cmu.utilities.StringUtils.split;

import edu.cmu.list.LinkedList;
import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}

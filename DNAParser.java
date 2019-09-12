package letterCount;
//package projects;

public class DNAParser {

    /**
     * Given: A DNA string s of length at most 1000 nt.
     *
     * Return: Four integers (separated by spaces) counting the respective
     * number of times that the symbols 'A', 'C', 'G', and 'T' occur in s.
     *
     * Sample Dataset
     * AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC
     *
     * Sample Output 20 12 17 21
     *
     */
    
    
    public static void main(String[] args) {

        DNAParser dna = new DNAParser();

        String dd = dna.sequenceCount("AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGA"
                + "TTAAAAAAAGAGTGTCTGATAGCAGC");
        System.out.println(dd);

        DNAParser kcb = new DNAParser();

        String kb = kcb.kuuCount("ELOHELOHEELOHLOHHHHLELOHEELOEEOLDDDDDDDD");
        System.out.println(kb);
        
        
    }

    public String sequenceCount(String sequence) {

        // implement the counters ensure the names are the same as in the return statement i.e. aCount
        int aCount;
        int cCount;
        int gCount;
        int tCount;

        // implement the loop to parse the string below here:
        aCount = countOccurrence(sequence, 'A');
        cCount = countOccurrence(sequence, 'C');
        gCount = countOccurrence(sequence, 'G');
        tCount = countOccurrence(sequence, 'T');

        return aCount + " " + cCount + " " + gCount + " " + tCount;

    }

    static int countOccurrence(String s, char ch) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                ++count;
            }
        }
        return count;
    }

    public String kuuCount(String kuuku) {

        // implement the counters ensure the names are the same as in the return statement i.e. eCount
        int eCount;
        int lCount;
        int oCount;
        int hCount;
        int dCount;

        
        // implement the loop to parse the string below here:
        eCount = kuuOccurrence(kuuku, 'E');
        lCount = kuuOccurrence(kuuku, 'L');
        oCount = kuuOccurrence(kuuku, 'O');
        hCount = kuuOccurrence(kuuku, 'H');
        dCount = kuuOccurrence(kuuku, 'D');

        return eCount + " " + lCount + " " + oCount + " " + hCount + " " + dCount;

    }

    static int kuuOccurrence(String p, char kh) {
        int counts = 0;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == kh) {
                ++counts;
            }
        }
        return counts;
    }

    
}

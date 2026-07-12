class Solution {
    public String sortVowels(String s) {
        int n = s.length();
        ArrayList<Character> vowels = new ArrayList<>();
        // collect vowel
        for(int i =0; i< n; i++){
            char ch = s.charAt(i);
            if(isVowel(ch)){
                vowels.add(ch);
            }
        }
        // sort vowels
        Collections.sort(vowels);

        // convert to array 
        char[] t = s.toCharArray();

        // put back vowel in sorted form
        int j = 0;
        for(int i = 0 ; i< n ;i++){
            if(isVowel(t[i])){
                t[i] = vowels.get(j);
                j++;
            }
        }

        return new String(t);

    }
    public static boolean isVowel(char ch){
        return ch =='A' || ch =='E' || ch =='I' || ch =='O' || ch =='U' || ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u' ;
    }
}
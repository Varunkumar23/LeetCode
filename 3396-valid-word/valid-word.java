class Solution {
    public boolean isValid(String word) {
        boolean hasVowel = word.matches(".*[aeiouAEIOU].*");
        boolean hasConsonant = word.matches(".*[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ].*");
        if(word.length()>=3 && word.matches("^[A-Za-z0-9]+$") && (hasVowel && hasConsonant)){
            return true;
        }
        return false;
    }
}
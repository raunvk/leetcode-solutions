class Solution {
    public String sortVowels(String s) {
        char[] arr = s.toCharArray();
        List<Character> vowels = new ArrayList<>();
        int index = 0;
        for(char c : arr) {
            if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U') {
                vowels.add(c);
                arr[index] = '.';
            }
            index++;
        }
        Collections.sort(vowels);
        index = 0;
        for(char c : vowels) {
            int last = 0;
            for(int i=index; i<arr.length; i++) {
                if(arr[i]=='.'){
                    arr[i] = c;
                    last = i;
                    break;
                }
            }
            index = last+1;
        }
        return new String(arr);
    }
}
class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        List<String> list = new ArrayList<>();
        for(String word : words){
            int[] flag = new int[3];
            for(char c : word.toLowerCase().toCharArray()){
                if(row1.indexOf(c)!=-1){
                    flag[0]=1;
                }
                else if(row2.indexOf(c)!=-1){
                    flag[1]=1;
                }
                else if(row3.indexOf(c)!=-1){
                    flag[2]=1;
                }
            }
            int sum = flag[0]+flag[1]+flag[2];
            if(sum==1){
                list.add(word);
            }
        }
        String[] result = new String[list.size()];
        int i = 0;
        for(String word : list){
            result[i++] = word;
        }
        return result;
    }
}
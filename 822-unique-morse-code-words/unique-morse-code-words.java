class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashMap<Character, String> mp = new HashMap<>();
mp.put('a', ".-");
mp.put('b', "-...");
mp.put('c', "-.-.");
mp.put('d', "-..");
mp.put('e', ".");
mp.put('f', "..-.");
mp.put('g', "--.");
mp.put('h', "....");
mp.put('i', "..");
mp.put('j', ".---");
mp.put('k', "-.-");
mp.put('l', ".-..");
mp.put('m', "--");
mp.put('n', "-.");
mp.put('o', "---");
mp.put('p', ".--.");
mp.put('q', "--.-");
mp.put('r', ".-.");
mp.put('s', "...");
mp.put('t', "-");
mp.put('u', "..-");
mp.put('v', "...-");
mp.put('w', ".--");
mp.put('x', "-..-");
mp.put('y', "-.--");
mp.put('z', "--..");

TreeSet<String> a = new TreeSet<>();

for(String val : words){
    String s = val;
    String ans = "";
    for(int i=0;i<s.length();i++){
        ans += mp.get(s.charAt(i));
    }
    a.add(ans);
}

return a.size();
    }
}
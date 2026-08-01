class Solution {
    public int convertTime(String current, String correct) {
        
        int movements = 0;

        int ch = Integer.parseInt(current.substring(0,2));
        int cm = Integer.parseInt(current.substring(3,5));

        int coh = Integer.parseInt(correct.substring(0,2));
        int com = Integer.parseInt(correct.substring(3,5));

        int minutescurrent = ch*60+cm;
        int minutescorrect = coh*60+com;

        int bal = minutescorrect -  minutescurrent;

        System.out.print(bal);

        movements += bal/60;
        bal %= 60;
        movements += bal/15;
        bal %= 15; 
        movements += bal/5;
        movements += bal%5;
        

        return movements;
    }
}
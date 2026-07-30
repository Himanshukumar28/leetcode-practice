class Solution {
    public int[] scoreValidator(String[] events) {
        int score = 0;
        int counter = 0;
        for(String event: events){
            if(counter == 10) break;

            if(event.equals("W")){
                counter++;
            }
            else if(event.equals("WD") || event.equals("NB")){
                score++;
            }
            else{
                score += Integer.parseInt(event);//convert the string to an integer
            }
        }
        return new int[]{score , counter};
    }
}
class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int pos = 0;
        for(int i = 0; i < commands.size(); i++){
            if(commands.get(i).equals("UP")){
                pos -= n;
            }
            else if(commands.get(i).equals("DOWN")){
                pos += n;
            }
            else if(commands.get(i).equals("RIGHT")){
                pos++;
            }
            else{
                pos--;
            }
        }
        return pos;
    }
}
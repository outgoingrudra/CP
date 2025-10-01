

class Solution {
  public static List<Integer> row(int r){
    long ans = 1;
    List<Integer> ansRow = new ArrayList<>();
    ansRow.add(1);

    for(int col = 1 ; col < r ; col ++ ){
        ans = ans * (r-col)/col;
        ansRow.add((int)ans);
    }
    return ansRow;
  }
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();
        for(int row=1;row<=numRows;row++){
            ans.add(row(row));
        }
        return ans ;
        
    }
}
class Solution {
    public void setZeroes(int[][] mat) {
        List<Integer> zeroPositions = new ArrayList<>();
		int col = mat[0].length;
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<col; j++) {
				if(mat[i][j]==0) {
					zeroPositions.add((i*col) + j + 1);
				}
			}
		}
	 	for(Integer zeroPosition: zeroPositions) {
			int row = -1;
            // System.out.println("col = " + col + " zeroPosition = " + zeroPosition);
			int column = -1;
			if((zeroPosition%col)==0) {
                row = (zeroPosition/col) -1;
                column = col-1;
            } else {
                row = (zeroPosition/col);
                column = (zeroPosition%col)-1;
            }
            for(int i=0; i< mat.length; i++) {
				mat[i][column] = 0;
			}
			for(int j=0; j<col; j++) {
				mat[row][j] = 0;
			}
		}

    }
}

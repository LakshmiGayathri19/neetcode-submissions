class Solution {
    int result[] = new int[3];
	public boolean mergeTriplets(int triplets[][], int target[]) {
		for(int i=0; i<triplets.length; i++) {
			if(triplets[i][0]>target[0] || triplets[i][1]>target[1] || triplets[i][2]>target[2]) {
				continue;
			}
			if(triplets[i][0] == target[0]) {
				result[0] = 1;
			} 
            if( triplets[i][1]==target[1]) {
				result[1] = 1;
			} 
            if(triplets[i][2]==target[2]) {
				result[2]=1;
			}
		}
		if(result[0] == 1 && result[1] == 1 && result[2] == 1) {
			return true;
		}

		return false;
    }
}

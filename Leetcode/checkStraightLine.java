//You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int count = 0;
        double m = Math.abs(
                (double) (coordinates[1][1] - coordinates[0][1]) / (double) (coordinates[1][0] - coordinates[0][0]));

        for (int i = 1; i < coordinates.length - 1; i++) {

            if (m == Math.abs((double) (coordinates[i + 1][1] - coordinates[i][1])
                    / (double) (coordinates[i + 1][0] - coordinates[i][0])))
                count++;
        }
        if (count == coordinates.length - 2) {
            return true;
        }
        return false;
    }
}

// i=0 j=0 x1
// j=1 y1

// i=1 j=0 x2
// j=1 y2
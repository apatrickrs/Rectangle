public class Intersect {
    
    private int left, right, bottom, top;

    public Intersect(int left, int top, int right, int bottom) {
        this.left = left;
        this.right = right;
        this.top = top;
        this.bottom = bottom;
    }

    public boolean intersect(int x1, int y1, int x2, int y2) {
        // if one rectangle is to the left or right, then there can be no overlap
        if (x2 < left || right < x1) {
            return false;
        }
            
        // the x values overlap, but the y values may still lie outside the rectangle
        // if one rectangle is above or below, then there can be no overlap
        if (y2 < top || bottom < y1) {
            return false;
        }

        // otherwise we must overlap !
        return true;        
    }
}
